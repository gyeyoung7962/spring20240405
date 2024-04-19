<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

    <style>
        .active {
            background-color: blue;
            color: white;
        }

        a {
            text-decoration: none;
        }
    </style>
</head>
<body>

<div style="position: absolute; top:50%; left:50%; transform: translate(-50%, -50%);">
    <table class="table table-dark">
        <thead>
        <tr>
            <th>no</th>
            <th>id</th>
            <th>name</th>
            <th>contactName</th>
            <th>address</th>
            <th>city</th>
            <th>code</th>
            <th>country</th>
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
    <%--    <div>--%>
    <%--        <c:forEach begin="1" end="${lastPageNumber}" var="pageNumber">--%>
    <%--            <c:url var="link" value="/main27/sub1">--%>
    <%--                <c:param name="page" value="${pageNumber}"/>--%>
    <%--            </c:url>--%>
    <%--            <span>--%>
    <%--                 <a href="${link}">${pageNumber}</a>--%>
    <%--            </span>--%>
    <%--        </c:forEach>--%>
    <%--    </div>--%>

    <nav aria-label="...">
        <ul class="pagination">
            <c:if test="${currentPage != 1}">
                <c:url var="link" value="/main27/sub1">
                    <c:param name="page" value="1"/>
                </c:url>
                <li class="page-item" aria-current="page">
                    <span class="page-link"><a href="${link}">맨앞</a></span>
                </li>
            </c:if>


            <c:if test="${not empty prevPageNumber}">
                <c:url var="link" value="/main27/sub1">
                    <c:param name="page" value="${prevPageNumber}"/>
                </c:url>
                <li class="page-item" aria-current="page">
                    <span class="page-link"><a href="${link}">이전</a></span>
                </li>
            </c:if>
            <c:forEach begin="${beginPageNumber}" end="${endPageNumber}" var="pageNumber">
                <c:url var="link" value="/main27/sub1">
                    <c:param name="page" value="${pageNumber}"/>
                </c:url>
                <li class="page-item" aria-current="page">
                    <span class="page-link"><a class="${currentPage eq pageNumber ? 'active' : '' }"
                                               href="${link}">${pageNumber}</a></span>
                </li>
            </c:forEach>

            <c:if test="${not empty nextPageNumber}">
                <c:url var="link" value="/main27/sub1">
                    <c:param name="page" value="${nextPageNumber}"/>
                </c:url>
                <li class="page-item" aria-current="page">
                    <span class="page-link"><a href="${link}">다음</a></span>
                </li>
            </c:if>

            <c:if test="${currentPage != lastPageNumber}">
                <c:url var="link" value="/main27/sub1">
                    <c:param name="page" value="${lastPageNumber}"/>
                </c:url>
                <li class="page-item" aria-current="page">
                    <span class="page-link"><a href="${link}">맨뒤</a></span>
                </li>
            </c:if>
        </ul>
    </nav>
</div>
</body>
</html>
