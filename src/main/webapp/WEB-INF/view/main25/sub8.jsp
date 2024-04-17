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
        <div class="d-flex col-md-6"
             style="align-items: center; margin-top: 30px; display: flex; justify-content: center;">
            <div class="col-md-2" style="align-items: center; text-align:right;">
                이름
            </div>
            <div class="col-md-3">
                <input type="text" name="name" placeholder="조회할 이름을 입력하세요" class="form-control" value="${name}">
            </div>

            <div class="col-md-4">
                <%--                <input type="submit" value="조회" class="btn btn-primary">--%>
                <%--                form 내의 button요소는 submit을 쓰지않아도 된다--%>
                <button class="btn btn-primary">조회</button>
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
        <th class="col-1">lastName</th>
        <th class="col-2">firstName</th>
        <th class="col-2">birthDate</th>
        <th class="col-2">photo</th>
        <th class="col-2">notes</th>
    </tr>
    </thead>
    <tbody>
    <c:if test="${not empty list}">
        <c:forEach items="${list}" var="list" varStatus="status">
            <tr>
                <td style="text-align: center;">${status.count}</td>
                <td>${list.employeeId}</td>
                <td>${list.lastName}</td>
                <td>${list.firstName}</td>
                <td>${list.birthDate}</td>
                <td>${list.photo}</td>
                <td>${list.notes}</td>
            </tr>

        </c:forEach>
    </c:if>
    <c:if test="${empty list}">
        <tr>
            <td colspan="7" style="text-align: center; background-color: bisque;">
                <div style="text-align: center; align-content: center;">
                    <p class="text-danger">직원이 없습니다</p>
                </div>
            </td>
        </tr>
    </c:if>
    </tbody>
</table>
<div class="col-md-3"></div>
</body>
</html>
