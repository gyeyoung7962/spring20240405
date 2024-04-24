<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<style>
    input {
        margin: 10px;
    }
</style>
<body>
<table class="table table-dark">
    <thead class="table-primary">
    <tr>
        <th class="col-1">string_col</th>
        <th class="col-2">int_col</th>
        <th class="col-2">dec_col</th>
        <th class="col-2">date_col</th>
        <th class="col-2">date_time_col</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="list">
        <tr>
            <td>${list.stringCol}</td>
            <td>${list.intCol}</td>
            <td>${list.decCol}</td>
            <td>${list.dateCol}</td>
            <td>${list.dateTimeCol}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<hr/>
<form action="/main34/sub9/insert" method="post">

    <div class="d-flex col-md-6" style="align-items: center;">
        <div class="col-md-2" style="align-items: center; text-align:right;">
            stringCol
        </div>
        <div class="col-md-6">
            <input type="text" class="form-control" name="stringCol">
        </div>
    </div>

    <div class="d-flex col-md-6" style="align-items: center;">
        <div class="col-md-2" style="align-items: center; text-align:right;">
            intCol
        </div>
        <div class="col-md-6">
            <input type="text" class="form-control" name="intCol">
        </div>
    </div>

    <div class="d-flex col-md-6" style="align-items: center;">
        <div class="col-md-2" style="align-items: center; text-align:right;">
            decCol
        </div>
        <div class="col-md-6">
            <input type="text" class="form-control" name="decCol">
        </div>
    </div>

    <div class="d-flex col-md-6" style="align-items: center;">
        <div class="col-md-2" style="align-items: center; text-align:right;">
            dateCol
        </div>
        <div class="col-md-6">
            <input type="date" class="form-control" name="dateCol">
        </div>
    </div>

    <div class="d-flex col-md-6" style="align-items: center;">
        <div class="col-md-2" style="align-items: center; text-align:right;">
            dateTimeCol
        </div>
        <div class="col-md-6">
            <input type="datetime-local" class="form-control" name="dateTimeCol">
        </div>
        <div class="col-md-2">
            <button class="btn btn-primary" style="text-align:end;">확인</button>
        </div>
    </div>

</form>
<c:if test="${not empty msg}">
    <div class="text-primary">
        <p class="text-primary">${msg}</p>
    </div>
</c:if>
</body>
</html>
u
