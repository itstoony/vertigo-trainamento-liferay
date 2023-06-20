<%@ page import="com.liferay.training.contato.web.constants.CommandNames" %>
<%@ include file="/init.jsp" %>

<portlet:actionURL name="<%=CommandNames.HANDLE_FORM%>" var="actionURL"/>

<liferay-portlet:renderURL var="listar">
    <portlet:param name="mvcRenderCommandName" value="<%=CommandNames.LISTA_CONTATOS%>" />
</liferay-portlet:renderURL>

<div class="container-fluid-1280 edit-assignment">

    <h1><liferay-ui:message key="Formulario de Contato"/></h1>

    <aui:form action="${actionURL}" name="fm">

        <aui:input name="nome">
            <aui:validator name="required"/>
        </aui:input>

        <aui:input name="telefone">
            <aui:validator name="required"/>
            <aui:validator errorMessage="Formato de telefone invalido" name="custom">
                (val) => {
                    var regExp = new RegExp("^\(?\d{2}\)?\s?\d{4,5}-?\d{4}$");

                    return regExp.test(val);
                }
            </aui:validator>
        </aui:input>

        <aui:input name="email">
            <aui:validator name="required"/>
            <aui:validator errorMessage="Formato de Email invalido" name="email" />
        </aui:input>

        <aui:input name="idade">
            <aui:validator name="required"/>
            <aui:validator name="number"/>
        </aui:input>

        <aui:button-row>
            <aui:button cssClass="btn btn-primary" type="submit" value="Salvar"/>
            <aui:button cssClass="btn btn-secondary" onClick="${listar}" type="cancel" value="Cancelar" />
        </aui:button-row>

        <hr>

    </aui:form>

</div>
