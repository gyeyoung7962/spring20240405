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
        <a class="${current eq 'sub6' ? 'active': ''}" href="/main17/sub6">sub6</a>
        <a class="${current eq 'sub7' ? 'active': ''}" href="/main17/sub7">sub7</a>
        <a class="${current eq 'sub8' ? 'active': ''}" href="/main17/sub8">sub8</a>
    </div>

    <c:if test="${not empty sessionScope.id}" var="loggedIn">
        ${sessionScope.id}
    </c:if>
    <c:if test="${not loggedIn}">
        <p>게스트님</p>
    </c:if>
</div>