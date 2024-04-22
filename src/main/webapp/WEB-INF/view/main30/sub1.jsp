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
    <form action="">
        <div class="d-flex col-md-6" style="align-items: center;">
            <div class="col-md-2" style="align-items: center; text-align:right;">
                번호
            </div>
            <div class="col-md-3">
                <input type="text" name="id" placeholder="조회할 번호" class="form-control">
            </div>

            <div class="col-md-4">
                <input type="submit" value="조회" class="btn btn-primary">
            </div>


        </div>

    </form>
</div>

<div class="col-md-4">
    <form action="/main30/sub1/delete" method="post" onsubmit="return confirm('삭제하시겠습니까?')">

        <div class="row">
            <div class="col-md-3">
                <input type="text" name="id" placeholder="삭제할 번호" class="form-control" value="${id}">
            </div>
            <div class="col-md-3">
                <button class="btn btn-danger">삭제</button>
            </div>

            <div class="col-md-6">
                <c:if test="${not empty message}">
                    <p class="text-primary" style="align-items: center;">${message}</p>
                </c:if>
            </div>
        </div>
    </form>

</div>

<div class="col-md-3"></div>

<div class="col-md-6"></div>
<table class="table table-dark">
    <thead class="table-primary">
    <tr>
        <th class="col-1">id</th>
        <th class="col-2">customerName</th>
        <th class="col-2">contactName</th>
        <th class="col-2">address</th>
        <th class="col-2">city</th>
        <th class="col-2">code</th>
        <th class="col-2">country</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:if test="${list == null}">
            <td colspan="7">조회가 불가능합니다</td>
        </c:if>

        <td>${list.customerId}</td>
        <td>${list.customerName}</td>
        <td>${list.contactName}</td>
        <td>${list.address}</td>
        <td>${list.city}</td>
        <td>${list.postalCode}</td>
        <td>${list.country}</td>
    </tr>
    </tbody>
</table>

<div class="col-md-3"></div>
</body>
</html>
