package com.liferay.training.contato.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.training.contato.service.ContatoLocalService;
import com.liferay.training.contato.web.constants.CommandNames;
import com.liferay.training.contato.web.constants.ContatoPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + ContatoPortletKeys.CONTATO,
                "mvc.command.name=" + CommandNames.EDIT_FORM_ACTION
        }
)
public class EditMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

        String nome = actionRequest.getParameter("nome");
        String telefone = actionRequest.getParameter("telefone");
        String email = actionRequest.getParameter("email");
        Integer idade = Integer.valueOf(actionRequest.getParameter("idade"));
        Long contatoId = Long.valueOf(actionRequest.getParameter("contatoId"));

        try {
            contatoService.updateContato(contatoId, nome, telefone, email, idade);
            return false;
        } catch (PortalException pe) {
            SessionErrors.add(actionRequest, "serviceErrorDetails", pe.getMessage());

            actionResponse.setRenderParameter(
                    "mvcRenderCommandName", CommandNames.EDIT_FORM);
        }

        return false;
    }

    @Reference
    protected  ContatoLocalService contatoService;
}
