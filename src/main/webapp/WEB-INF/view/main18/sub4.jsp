<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:import url="/WEB-INF/fragment/navbar5.jsp">
    <c:param name="current" value="cart"/>
</c:import>

<c:if test="${empty sessionScope.cart}" var="emptyCart">
    장바구니가 비었습니다
</c:if>

<c:if test="${!emptyCart}">

    <table>
        <thead>
        <tr>
            <th>상품명</th>
            <th>개수</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${cart}" var="item">
            <tr>
                <td>${item.key}</td>
                <td>${item.value}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>

</body>
</html>
