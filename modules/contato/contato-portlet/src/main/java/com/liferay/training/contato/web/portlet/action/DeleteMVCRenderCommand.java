package com.liferay.training.contato.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.training.contato.model.Contato;
import com.liferay.training.contato.service.ContatoLocalService;
import com.liferay.training.contato.web.constants.CommandNames;
import com.liferay.training.contato.web.constants.ContatoPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ContatoPortletKeys.CONTATO,
                "mvc.command.name=" + CommandNames.DELETE_FORM
        }
)
public class DeleteMVCRenderCommand implements MVCRenderCommand {

    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
        Long contatoId = Long.valueOf(renderRequest.getParameter("contatoId"));

        try {
            Contato contato = contatoLocalService.getContato(contatoId);
            renderRequest.setAttribute("contatoId", contatoId);
            renderRequest.setAttribute("nome", contato.getNome());

        } catch (PortalException e) {
            e.printStackTrace();
        }

        return "/contato/confirm_delete.jsp";

    }

    @Reference
    protected ContatoLocalService contatoLocalService;

}
