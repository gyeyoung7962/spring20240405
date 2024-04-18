<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<h3>주문일로 주문 조회</h3>
<form>
    <div class="row d-block">
        <div class="col-md-6 d-flex">
            <div class="col-md-2" style="border:1px solid black;align-items: center;">시작</div>
            <div class="col-md-5">
                <input type="date" class="form-control" name="start" value="${start}">
            </div>
        </div>

        <div class="col-md-6 d-flex">
            <div class="col-md-2" style="border:1px solid black;align-items: center;">종료</div>
            <div class="col-md-5">
                <input type="date" class="form-control" name="end" value="${end}">
            </div>
        </div>

        <div class="col-md-6 d-flex">
            <button class="btn btn-primary">조회</button>
        </div>
    </div>
</form>
<hr/>


<table class="table table-dark">
    <thead class="table-success">
    <tr>
        <th>id</th>
        <th>customer</th>
        <th>employee</th>
        <th>date</th>
        <th>shipper</th>
    </tr>
    </thead>
    <tbody>

    <c:if test="${empty list}">
        <tr>
            <td colspan="5" style="text-align: center;">조회된 내용이 없습니다</td>
        </tr>

    </c:if>

    <c:if test="${not empty list}">
        <c:forEach items="${list}" var="list">
            <tr>
                <td>${list.orderId}</td>
                <td>${list.customerId}</td>
                <td>${list.employeeId}</td>
                <td>${list.orderDate}</td>
                <td>${list.shipperId}</td>
            </tr>
        </c:forEach>
    </c:if>
    </tbody>
</table>

</body>
</html>
