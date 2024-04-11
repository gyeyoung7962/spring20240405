<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--url:주소를 생성하고 저장할수 있는 태그--%>
<%--여러곳에서 반복해서 쓰는 주소--%>
<%--request parameter를 추가--%>
<%--request parameter의 url Encoding--%>
<c:url value="https://search.naver.com/search.naver?" var="naverUrl">
    <c:param name="query" value="bts"/>
</c:url>
<a href="${naverUrl}">네이버</a>

<hr/>

<c:url value="https://search.daum.net/search" var="daumUrl">
    <c:param name="w" value="tot"/>
    <c:param name="DA" value="YZR"/>
    <c:param name="t__nil_searchbox" value="btn"/>
    <c:param name="q" value="에스파"/>
</c:url>

<a href="${daumUrl}">에스파 검색결과</a>


</body>
</html>
