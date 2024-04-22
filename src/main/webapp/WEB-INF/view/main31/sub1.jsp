<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="">
    <input type="text" name="id">
    <button>조회</button>
</form>
<hr/>
<c:if test="${not empty message}">
    <p>${message}</p>
</c:if>
<form action="/main31/sub1/update" method="post">
    <input type="hidden" name="id" value="${customer.customerId}">
    <div>
        번호
        <input type="text" name="customerId" value="${customer.customerId}">
    </div>
    <div>
        이름
        <input type="text" name="customerName" value="${customer.customerName}">
    </div>
    <div>
        계약명
        <input type="text" name="contactName" value="${customer.contactName}">
    </div>
    <div>
        주소
        <input type="text" name="address" value="${customer.address}">
    </div>
    <div>
        도시
        <input type="text" name="city" value="${customer.city}">
    </div>
    <div>
        코드
        <input type="text" name="postalCode" value="${customer.postalCode}">
    </div>
    <div>
        나라
        <input type="text" name="country" value="${customer.country}">
    </div>
    <div>
        <button>확인</button>
    </div>
</form>
</body>
</html>
