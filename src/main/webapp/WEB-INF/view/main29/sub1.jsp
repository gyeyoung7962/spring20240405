<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>no</th>
        <th>id</th>
        <td>customerName</td>
        <td>contactName</td>
        <td>address</td>
        <td>city</td>
        <td>code</td>
        <td>country</td>
    </tr>
    </thead>

    <tbody>


    <c:forEach items="${customerList}" var="list" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${list.customerId}</td>
            <td>${list.customerName}</td>
            <td>${list.contactName}</td>
            <td>${list.address}</td>
            <td>${list.city}</td>
            <td>${list.postalCode}</td>
            <td>${list.country}</td>
        </tr>
    </c:forEach>

    <%--    <c:url var="link" value="/main29/sub1">--%>
    <%--        <c:param name="page" value=""/>--%>
    <%--    </c:url>--%>
    </tbody>
</table>

<div>
    <c:if test="${currentPage >= 10}">
        <c:url var="link" value="/main29/sub1">
            <c:param name="page" value="${prevPage}"/>
        </c:url>
        <a href="${link}">이전</a>
    </c:if>


    <c:forEach begin="${currentStart}" end="${currentEnd}" var="pageNumber">
        <c:url var="link" value="/main29/sub1">
            <c:param name="page" value="${pageNumber}"/>
        </c:url>
        <span>
            <a href="${link}">${pageNumber}</a>
        </span>
    </c:forEach>

    <c:if test="${currentEnd < endPage}">
        <c:url var="link" value="/main29/sub1">
            <c:param name="page" value="${nextPage}"/>
        </c:url>
        <a href="${link}">다음</a>
    </c:if>
</div>
</body>
</html>
