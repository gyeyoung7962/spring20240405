<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<table class="table table-dark">
    <thead>
    <tr>
        <th>no</th>
        <th>id</th>
        <th>name</th>
        <th>contactName</th>
        <th>address</th>
        <th>city</th>
        <th>code</th>
        <th>country</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${list}" var="list" varStatus="status">
        <tr>
            <td style="text-align: center;">${status.count}</td>
            <td>${list.customerId}</td>
            <td>${list.customerName}</td>
            <td>${list.contactName}</td>
            <td>${list.address}</td>
            <td>${list.city}</td>
            <td>${list.postalCode}</td>
            <td>${list.country}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
