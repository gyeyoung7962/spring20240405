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
    <form action="/main25/sub3">
        <div class="d-flex col-md-6" style="align-items: center;">
            <div class="col-md-2" style="align-items: center; text-align:right;">
                이름
            </div>
            <div class="col-md-3">
                <input type="text" name="name" placeholder="조회할 이름을 입력하세요" class="form-control" value="${search}">
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
        <th class="col-1">productId</th>
        <th class="col-1">productName</th>
        <th class="col-2">unit</th>
        <th class="col-2">price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="list" varStatus="status">
        <tr>
            <td style="text-align: center;">${status.count}</td>
            <td>${list.productId}</td>
            <td>${list.productName}</td>
            <td>${list.unit}</td>
            <td>${list.price}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>
<div class="col-md-3"></div>
</body>
</html>
