<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:import url="../../fragment/navbar3.jsp">
    <c:param name="current" value="sub3"/>
</c:import>

<div>
    <form action="">
        <div>
            아이디:
            <input type="text" name="id">
        </div>
        <div>
            <button>로그인</button>
        </div>
    </form>
</div>
</body>
</html>
