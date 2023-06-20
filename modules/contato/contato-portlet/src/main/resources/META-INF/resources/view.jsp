<%@ page import="com.liferay.training.contato.web.constants.CommandNames" %>
<%@ taglib uri="http://liferay.com/tld/clay" prefix="clay" %>
<%@ include file="/init.jsp"%>

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
            <td><aui:button-row>Editar</aui:button-row></td>
        </tr>

    </c:forEach>

    </tbody>
</table>


<portlet:renderURL var="cadastroURL">
    <portlet:param name="mvcRenderCommandName" value="<%=CommandNames.CADASTRO%>" />
    <portlet:param name="redirect" value="${currentURL}" />
</portlet:renderURL>

<hr>

<aui:button value="Cadastrar Contato" href="<%= cadastroURL %>" cssClass="btn btn-primary" />

