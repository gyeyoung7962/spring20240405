<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<style>
    .active {
        background-color: darkgreen;
    }
</style>
<body>
<table class="table table-dark">
    <thead>
    <tr>
        <th>id</th>
        <th>lastName</th>
        <th>firstName</th>
        <th>birthDate</th>
        <th>photo</th>
        <th>notes</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeesList}" var="list" varStatus="status">
        <tr>
            <td>${list.employeeId}</td>
            <td>${list.lastName}</td>
            <td>${list.firstName}</td>
            <td>${list.birthDate}</td>
            <td>${list.photo}</td>
            <td>${list.notes}</td>
        </tr>

    </c:forEach>
    </tbody>
</table>

<div style="text-align: center;">
    <c:if test="${currentPage > 1}">
        <span><a href="/main27/sub2?page=1">맨앞</a></span>
    </c:if>

    <c:if test="${currentStartPage > 10}">
        <span><a href="/main27/sub2?page=${prevPage}">이전</a></span>
    </c:if>
    <c:forEach begin="${currentStartPage}" end="${currentEndPage}" var="pageNumber">
        <span>
            <a class="${currentPage eq pageNumber ? 'active' : ''}"
               href="/main27/sub2?page=${pageNumber}">${pageNumber}</a>
        </span>
    </c:forEach>


    <c:if test="${currentEndPage < endPage}">
        <span><a href="/main27/sub2?page=${nextPage}">다음</a></span>
    </c:if>

    <c:if test="${currentEndPage < endPage}">
        <span><a href="/main27/sub2?page=${endPage}">맨뒤</a></span>
    </c:if>
</div>


</body>
</html>
