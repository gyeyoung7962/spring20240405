<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<style>

</style>
<body>

<table class="table table-dark">
    <thead class="table-primary">
    <tr>
        <th style="text-align: center;">번호</th>
        <th>도시</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="list" varStatus="status">
        <tr>
            <td style="text-align: center;">${status.count}</td>
            <td>${list.country}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>
</body>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
</html>
