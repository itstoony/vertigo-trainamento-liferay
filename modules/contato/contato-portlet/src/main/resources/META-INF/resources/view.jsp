<%@ page import="com.liferay.portal.kernel.portlet.LiferayWindowState" %>
<%@ taglib uri="http://liferay.com/tld/clay" prefix="clay" %>
<%@ include file="/init.jsp"%>

<liferay-portlet:renderURL var="addContatoURL" windowState="<%=LiferayWindowState.EXCLUSIVE.toString() %>">
    <portlet:param name="mvcRenderCommandName" value="adicionaContato" />
</liferay-portlet:renderURL>

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
        </tr>

    </c:forEach>

    </tbody>
</table>


<portlet:renderURL var="viewAssignmentURL">
    <portlet:param name="mvcRenderCommandName" value="<%="cadastro"%>" />
    <portlet:param name="redirect" value="${currentURL}" />
</portlet:renderURL>

<hr>

<aui:button value="Cadastrar Contato" href="<%= viewAssignmentURL %>" cssClass="btn btn-primary" />

