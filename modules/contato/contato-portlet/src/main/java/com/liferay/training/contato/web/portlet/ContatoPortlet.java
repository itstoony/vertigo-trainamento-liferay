package com.liferay.training.contato.web.portlet;

import com.liferay.training.contato.model.Contato;
import com.liferay.training.contato.service.ContatoLocalService;
import com.liferay.training.contato.web.constants.ContatoPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.List;

/**
 * @author vertigo
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=treinamento",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Contato",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ContatoPortletKeys.CONTATO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ContatoPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		List<Contato> listaDeContatos = _contatoLocalService.getContatos(-1, -1);
		renderRequest.setAttribute("listaDeContatos", listaDeContatos);

		super.render(renderRequest, renderResponse);
	}

	@Reference
	protected ContatoLocalService _contatoLocalService;
}