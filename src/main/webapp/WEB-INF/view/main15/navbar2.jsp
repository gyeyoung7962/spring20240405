<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    .active {
        background-color: red;
    }
</style>
<div>
    <%--    <span>${current1}</span>--%>
    <%--    <span>${current2}</span>--%>
    <a href="/main15/sub3">
        <span class="${current2 eq 'sub3' ? 'active' : ''}">sub3</span>
    </a>
    <a href="/main15/sub4">
        <span class="${current2 eq 'sub4' ? 'acitve' : ''}">sub4</span>
    </a>
</div>
