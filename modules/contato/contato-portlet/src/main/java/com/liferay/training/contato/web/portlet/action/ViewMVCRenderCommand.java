package com.liferay.training.contato.web.portlet.action;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.training.contato.model.Contato;
import com.liferay.training.contato.service.ContatoLocalService;
import com.liferay.training.contato.web.constants.CommandNames;
import com.liferay.training.contato.web.constants.ContatoPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.List;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ContatoPortletKeys.CONTATO,
                "mvc.command.name=" + CommandNames.LISTA_CONTATOS
        },
        service = MVCRenderCommand.class
)
public class ViewMVCRenderCommand implements MVCRenderCommand {

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) {
        try {
            ServiceContext serviceContext = ServiceContextFactory.getInstance(Contato.class.getName(), renderRequest);
            List<Contato> listaDeContatos = _contatoLocalService.getContatosByUser(serviceContext);
            renderRequest.setAttribute("listaDeContatos", listaDeContatos);
        } catch (PortalException e) {
            e.printStackTrace();
        }

        return "/view.jsp";
    }

    @Reference
    protected ContatoLocalService _contatoLocalService;

}
