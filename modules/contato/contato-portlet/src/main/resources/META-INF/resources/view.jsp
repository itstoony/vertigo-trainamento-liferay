<%@ include file="init.jsp" %>

<h2>Lista de Contatos</h2>

<table class="table table-striped">
    <thead>
    <tr>
        <th>Nome</th>
        <th>Telefone</th>
        <th>Email</th>
        <th>Idade</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="contato" items="${listaDeContatos}">

        <tr>

            <td>${contato.nome}</td>
            <td>${contato.telefone}</td>
            <td>${contato.email}</td>
            <td>${contato.idade}</td>

            <liferay-portlet:renderURL var="portletURL">
                <portlet:param name="mvcRenderCommandName" value="<%=CommandNames.EDIT_FORM%>"/>
                <portlet:param name="contatoId" value="${contato.contatoId}"/>
            </liferay-portlet:renderURL>

            <liferay-portlet:renderURL var="deleteURL">
                <portlet:param name="mvcRenderCommandName" value="<%=CommandNames.DELETE_FORM%>"/>
                <portlet:param name="contatoId" value="${contato.contatoId}"/>
            </liferay-portlet:renderURL>

            <td>
                <aui:button-row>
                    <aui:button cssClass="btn btn-primary" type="button" value="Editar" onClick="<%=portletURL%>"/>
                    <aui:button cssClass="btn btn-secondary" type="cancel" onClick="${deleteURL}" value="Excluir"/>
                </aui:button-row>
            </td>

        </tr>

    </c:forEach>
    </tbody>
</table>

<portlet:renderURL var="cadastroURL">
    <portlet:param name="mvcRenderCommandName" value="<%=CommandNames.CADASTRO%>"/>
    <portlet:param name="redirect" value="${currentURL}"/>
</portlet:renderURL>

<hr>

<aui:button value="Cadastrar Contato" href="<%= cadastroURL %>" cssClass="btn btn-primary"/>
