<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    a {
        border: 1px solid black;
    }

    .active {
        background-color: bisque;
    }
</style>
<div>
    <a class="${param.current eq 'sub12' ? 'active': ''}" href="/main15/sub12">sub12</a>
    <a class="${param.current eq 'sub13' ? 'active' : ''}" href="/main15/sub13">sub13</a>
</div>
