<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="attr1" value="page value2" scope="page"/>
<div>
    <div>
        <%--        page value2--%>
        ${pageScope.attr1}
    </div>

    <div>
        <%--        request value1--%>
        ${requestScope.attr1}
    </div>
</div>