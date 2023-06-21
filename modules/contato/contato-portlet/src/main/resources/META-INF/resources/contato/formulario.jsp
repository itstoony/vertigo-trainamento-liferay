<%@ include file="/init.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>


<liferay-ui:error key="serviceErrorDetails">
    <liferay-ui:message key="Email já cadastrado" arguments='<%= SessionErrors.get(liferayPortletRequest, "serviceErrorDetails") %>' />
</liferay-ui:error>

<portlet:actionURL name="<%=CommandNames.HANDLE_FORM%>" var="actionURL"/>

<liferay-portlet:renderURL var="listar">
    <portlet:param name="mvcRenderCommandName" value="<%=CommandNames.LISTA_CONTATOS%>" />
</liferay-portlet:renderURL>

<div class="container-fluid-1280 edit-assignment">

    <h1><liferay-ui:message key="Formulário de Contato"/></h1>

    <aui:form action="${actionURL}" name="fm" id="meuFormulario">

        <aui:input name="nome" placeholder="Nome" label="Nome">
            <aui:validator name="required" errorMessage="Campo obrigatório"/>
            <aui:validator name="custom" errorMessage="Nome inválido">
                (val) => {
                    var regExp = new RegExp("^[a-zA-ZÀ-ÖØ-öø-ÿ\s]+$");
                    return regExp.test(val);
                }
            </aui:validator>
        </aui:input>

        <aui:input name="telefone" placeholder="Telefone" label="Telefone" onkeyup="formatarTelefone(this)">
            <aui:validator name="required" errorMessage="Campo obrigatório"/>
            <aui:validator name="custom" errorMessage="Telefone inválido">
                        (val) => {
                            var regExp = new RegExp("^\\(?(\\d{2})\\)?\\s(\\d{4,5})\\-(\\d{4})$");
                            return regExp.test(val);
                        }
            </aui:validator>
        </aui:input>

        <aui:input name="email" placeholder="Email" label="Email">
            <aui:validator name="required" errorMessage="Campo obrigatório"/>
            <aui:validator errorMessage="Formato de Email inválido" name="email" />
        </aui:input>

        <aui:input name="idade" placeholder="Idade" label="Idade">
            <aui:validator name="required" errorMessage="Campo obrigatório"/>
            <aui:validator name="custom" errorMessage="Idade inválida">
                        (val) => {
                            var regExp = new RegExp("^(?:[1-9]|[1-9][0-9]|[1][0-4][0-9]|999)$");
                            return regExp.test(val);
                        }
            </aui:validator>
        </aui:input>

        <aui:button-row>
            <aui:button cssClass="btn btn-primary" type="submit" value="Salvar" onClick="return validarFormulario();" />
            <aui:button cssClass="btn btn-secondary" onClick="${listar}" type="cancel" value="Cancelar" />
        </aui:button-row>

        <hr>

    </aui:form>

</div>

<script>
    function validarFormulario() {
        var formulario = document.getElementById("meuFormulario");
        var isValid = formulario.validate();

        if (!isValid) {
            var inputs = formulario.querySelectorAll(".aui-field-error");
            if (inputs.length > 0) {
                alert("Existem campos inválidos no formulário!");
                inputs[0].focus();
            }
        }

        return isValid;
    }

    function formatarTelefone(input) {
        var numero = input.value.replace(/\D/g, '');

        var formatado = '';
        if (numero.length > 0) {
            formatado += '(' + numero.substring(0, 2);
        }
        if (numero.length >= 3) {
            formatado += ') ' + numero.substring(2, 7);
        }
        if (numero.length >= 7) {
            formatado += '-' + numero.substring(7, 11);
        }

        input.value = formatado;
    }
</script>
