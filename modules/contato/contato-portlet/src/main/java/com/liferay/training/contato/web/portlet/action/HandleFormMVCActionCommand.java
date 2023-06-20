package com.liferay.training.contato.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.contato.model.Contato;
import com.liferay.training.contato.service.ContatoService;
import com.liferay.training.contato.web.constants.ContatoPortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

@Component(
        immediate = true,
        property = {
            "javax.portlet.name=" + ContatoPortletKeys.CONTATO,
                "mvc.command.name=handleForm"
        },
        service = MVCActionCommand.class
)
public class HandleFormMVCActionCommand implements MVCActionCommand {

    @Override
    public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) {

        String nome = actionRequest.getParameter("nome");
        String telefone = actionRequest.getParameter("telefone");
        String email = actionRequest.getParameter("email");
        Integer idade = Integer.valueOf(actionRequest.getParameter("idade"));

        try {
            ServiceContext serviceContext = ServiceContextFactory.getInstance(
                    Contato.class.getName(), actionRequest);

            _contatoService.getContatosByGroupId(serviceContext.getScopeGroupId()).forEach(System.out::println);

            ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
            _contatoService.addContato(themeDisplay.getScopeGroupId(), nome, telefone, email, idade, serviceContext);

            SessionMessages.add(actionRequest, "contactAdded");

        } catch (PortalException pe) {
            pe.printStackTrace();
        }

        return true;
    }

    @Reference
    protected ContatoService _contatoService;

}
