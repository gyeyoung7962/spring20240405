<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    .menu-item {
        border: 1px solid black;
    }

    .active {
        background-color: aqua;
    }
</style>
<div>
    <a href="/main15/sub5">
        <span class="menu-item ${current eq 'sub5' ? 'active' : ''}">sub5</span>
    </a>
    <a href="/main15/sub6">
        <span class="menu-item ${current eq 'sub6' ? 'active': ''}">sub6</span>
    </a>
</div>
