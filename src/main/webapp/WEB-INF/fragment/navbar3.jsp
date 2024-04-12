<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>

    .active {
        background-color: lightblue;
    }

    a {
        border: 1px solid black;
    }
</style>


<div style="display: flex; justify-content: space-between; padding-bottom: 100px;">

    <div>
        <a class="${current eq 'sub3' ? 'active': ''}" href="/main17/sub3">sub3</a>
        <a class="${current eq 'sub4' ? 'active': ''}" href="/main17/sub4">sub4</a>
        <a class="${current eq 'sub5' ? 'active': ''}" href="/main17/sub5">sub5</a>
    </div>

    <c:if test="${not empty sessionScope.userName}" var="loggedIn">
        <%--        ${sessionScope.userName}--%>
        <a href="/main17/sub9">${sessionScope.userName}</a>
    </c:if>
    <c:if test="${not loggedIn}">
        <p>게스트님</p>
    </c:if>
</div>