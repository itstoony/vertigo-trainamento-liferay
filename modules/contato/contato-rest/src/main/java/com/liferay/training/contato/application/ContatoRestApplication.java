package com.liferay.training.contato.application;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.service.CompanyService;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.training.contato.application.dto.ContatoDTO;
import com.liferay.training.contato.application.dto.NomeDTO;
import com.liferay.training.contato.model.Contato;
import com.liferay.training.contato.service.ContatoService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @author vertigo
 */
@Component(
		property = {
				JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/contatos",
				JaxrsWhiteboardConstants.JAX_RS_NAME + "=Contato.Rest"
		},
		service = Application.class
)
public class ContatoRestApplication extends Application {

	public Set<Object> getSingletons() {
		return Collections.singleton(this);
	}

	@Reference
	private ContatoService contatoService;

	@Reference
	private CompanyService companyService;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/test")
	public String status( NomeDTO dto) {
		return dto.getNome();
	}


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getContatosByGroupId() {
		try {
			List<Contato> contatoList = new ArrayList<>();
			Company company = companyService.getCompanyById(PortalUtil.getDefaultCompanyId());
			List<Group> groups = GroupLocalServiceUtil.getGroups(company.getCompanyId(), 0, true);
			System.out.println("Buscando por GroupID" );
			groups.forEach(g -> {
				try {
					contatoList.addAll(contatoService.getContatosByGroupId(g.getGroupId()));
				} catch (PortalException e) {
					e.printStackTrace();
				}
			});

			return JSONFactoryUtil.serialize(contatoList);

		} catch (PortalException e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@GET
	@Path("/{contatoId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getContatoById(@PathParam("contatoId") long contatoId) {
		System.out.println("search pelo ID: " + contatoId);
		try {
			Contato contato = contatoService.getContatoById(contatoId);
			return JSONFactoryUtil.serialize(contato);
		} catch (PortalException e) {
			return e.getMessage();
		}
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String addContato(ContatoDTO dto, @Context HttpServletRequest request) {
		try {
			long userId = Long.parseLong(request.getUserPrincipal().getName());

			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setRequest(request);
			serviceContext.setCompanyId(PortalUtil.getDefaultCompanyId());
			serviceContext.setUserId(userId);

			Contato contato = contatoService.addContato(dto.getGroupId(),
					dto.getNome(),
					dto.getTelefone(),
					dto.getEmail(),
					dto.getIdade(),
					serviceContext);

			return JSONFactoryUtil.serialize(contato);

		} catch (PortalException e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@PUT
	@Path("/{contatoId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String updateContato(@PathParam("contatoId") long contatoId, ContatoDTO dto) {
		try {
			Contato contato = contatoService.updateContato(contatoId,
					dto.getNome(),
					dto.getTelefone(),
					dto.getEmail(),
					dto.getIdade());

			return JSONFactoryUtil.serialize(contato);
		} catch (PortalException e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	@DELETE
	@Path("/{contatoId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteContato(@PathParam("contatoId") long contatoId) {
		try {
			Contato contato = contatoService.deleteContato(contatoId);

			return JSONFactoryUtil.serialize(contato);
		} catch (PortalException e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
}