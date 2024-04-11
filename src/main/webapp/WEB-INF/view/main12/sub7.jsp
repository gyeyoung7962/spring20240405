<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        .table {
            border: 1px solid black;
            border-collapse: collapse;
            width: 100%;
            text-align: center;
        }
    </style>
</head>
<body>
<table class="table">

    <thead>
    <tr>
        <th>No</th>
        <th>이름</th>
        <th>팀</th>
        <th>국적</th>
        <th>종목</th>
        <th>포지션</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${playerList}" var="player" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${player.name}</td>
            <td>${player.team}</td>
            <td>${player.country}</td>
            <td>${player.event}</td>

            <td>
                <c:forEach items="${player.positions}" var="pos" varStatus="status">

                    ${pos}
                    <c:if test="${!status.last}">
                        ,
                    </c:if>

                </c:forEach>
            </td>

        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>
