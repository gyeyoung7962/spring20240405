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
<div>
    <%--    action의 값이 없거나 생략되면 현재 요청 경로로 보냄--%>
    <form action="">
        <div class="d-flex col-md-6" style="align-items: center;">
            <div class="col-md-2" style="align-items: center; text-align:right;">
                이름
            </div>
            <div class="col-md-3">
                <input type="text" name="name" placeholder="조회할 이름을 입력하세요" class="form-control" value="${name}">
            </div>

            <div class="col-md-4">
                <input type="submit" value="조회" class="btn btn-primary">
            </div>

        </div>

    </form>
</div>


<div class="col-md-3"></div>

<div class="col-md-6"></div>
<table class="table table-dark">
    <thead class="table-primary">
    <tr>
        <th class="col-1" style="text-align: center;">번호</th>
        <th class="col-1">id</th>
        <th class="col-1">name</th>
        <th class="col-2">contact name</th>
        <th class="col-2">address</th>
        <th class="col-2">city</th>
        <th class="col-2">code</th>
        <th class="col-2">country</th>

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
<div class="col-md-3"></div>
</body>
</html>
