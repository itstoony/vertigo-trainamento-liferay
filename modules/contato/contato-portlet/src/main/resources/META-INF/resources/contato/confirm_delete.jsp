<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../init.jsp" %>

<portlet:actionURL name="<%=CommandNames.DELETE_ACTION%>" var="deleteAction" >
    <portlet:param name="contatoId" value="${renderRequest.getAttribute('contatoId')}"/>
</portlet:actionURL>

<liferay-portlet:renderURL var="listar">
    <portlet:param name="mvcRenderCommandName" value="<%=CommandNames.LISTA_CONTATOS%>" />
</liferay-portlet:renderURL>

<div class="choice-dialog">

    <clay:alert message="Essa ação não podera ser desfeita" title="Deseja mesmo excluir ${renderRequest.getAttribute('nome')} ?" />

    <aui:button-row>
        <aui:button cssClass="btn btn-primary" type="button" value="Excluir" onClick="${deleteAction}"/>
        <aui:button cssClass="btn btn-secondary" onClick="${listar}" type="cancel" value="Cancelar"/>
    </aui:button-row>

</div>


