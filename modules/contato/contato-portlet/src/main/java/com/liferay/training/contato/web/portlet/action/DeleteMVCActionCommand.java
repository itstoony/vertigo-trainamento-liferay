package com.liferay.training.contato.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
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
                "mvc.command.name=" + CommandNames.DELETE_ACTION
        }
)
public class DeleteMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
        Long contatoId = Long.valueOf(actionRequest.getParameter("contatoId"));

        try {
            contatoLocalService.deleteContato(contatoId);

            SessionMessages.add(actionRequest, "contatoDeleted");
            return true;

        } catch (PortalException e) {
            e.printStackTrace();

            SessionErrors.add(actionRequest, "serverErrorDetails", e);

            actionResponse.setRenderParameter(CommandNames.LISTA_CONTATOS);
        }


        return false;
    }

    @Reference
    protected ContatoLocalService contatoLocalService;

}
