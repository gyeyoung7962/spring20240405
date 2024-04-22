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
<div class="d-flex" style="border: 1px solid black;">
    <form action="">
        <div class="d-flex col-md-6" style="align-items: center;">
            <div class="col-md-3" style="align-items: center; text-align:right;">
                번호
            </div>
            <div class="col-md-5">
                <input type="text" name="id" placeholder="번호" class="form-control" value="${id}">
            </div>

            <div class="col-md-4">
                <input type="submit" value="조회" class="btn btn-primary">
            </div>
        </div>
    </form>
    <c:if test="${not empty message}">
        <p class="text-primary">${message}</p>
    </c:if>


</div>


<div class="col-md-6"></div>
<table class="table table-dark">
    <thead class="table-primary">
    <tr>
        <th class="col-1">id</th>
        <th class="col-2">lastName</th>
        <th class="col-2">firstName</th>
        <th class="col-2">birthDate</th>
        <th class="col-2">photo</th>
        <th class="col-2">notes</th>
        <th class="col-2">확인</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <c:if test="${list == null}">
            <td colspan="7">조회가 불가능합니다</td>
        </c:if>
        <form action="/main31/sub2/update" method="post">
            <input type="hidden" name="id" value="${list.employeeId}">
            <td>
                <input type="text" name="employeeId" value="${list.employeeId}" readonly>
            </td>
            <td>
                <input type="text" name="lastName" value="${list.lastName}">
            </td>
            <td>
                <input type="text" name="firstName" value="${list.firstName}">
            </td>
            <td>
                <input type="text" name="birthDate" value="${list.birthDate}">
            </td>
            <td>
                <input type="text" name="photo" value="${list.photo}">
            </td>
            <td>
                <input type="text" name="notes" value="${list.notes}">
            </td>
            <td>
                <button class="btn btn-success">수정버튼</button>
            </td>
        </form>
    </tr>
    </tbody>
</table>

</body>
</html>
