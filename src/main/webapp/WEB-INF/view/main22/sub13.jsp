<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty message}">
    <div style="background-color: pink">로그인 실패</div>
</c:if>
<form action="/main22/sub14" method="post">
    <div>
        <input type="text" name="id"/>
    </div>
    <div>
        <input type="text" name="password"/>
    </div>

    <div>
        <input type="submit" value="로그인"/>
    </div>
</form>

</body>
</html>
