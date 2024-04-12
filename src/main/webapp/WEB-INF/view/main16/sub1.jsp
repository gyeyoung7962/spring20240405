<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--경로 : /로 시작하지않으면 상대경로(현재경로기준)--%>
<c:import url="navbar1.jsp"/>

<%--경로 : /로 시작하면 절대경로 webapp 폴더 기준--%>
<c:import url="/WEB-INF/view/main16/navbar1.jsp"/>


<%--상대경로--%>
<c:import url="../../fragment/footer1.jsp"/>

<%--절대경로--%>
<c:import url="/WEB-INF/fragment/footer1.jsp"/>
</body>
</html>
