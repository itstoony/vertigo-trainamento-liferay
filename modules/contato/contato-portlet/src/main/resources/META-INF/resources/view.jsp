<%@ include file="init.jsp" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<h2 style="text-align: center">Contatos</h2>

<aui:container fluid="false" class="text-center">
    <c:choose>
        <c:when test="<%= !themeDisplay.isSignedIn() %>">
            <hr>
            <aui:fieldset label="Você precisa estar logado para acessar esta página" style="text-align: center"/>
            <br>
            <aui:button cssClass="btn btn-primary"
                        type="button" value="Login"
                        href="http://localhost:8080/c/portal/login"/>
        </c:when>
        <c:otherwise>
            <%@ include file="contato/list_contato.jsp" %>
        </c:otherwise>
    </c:choose>
</aui:container>
