<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h1>Caculator</h1>
<form action="/calculate" method="post">
    <input type="text" name="firstNumber" value="${firstNumber}" placeholder="Số thứ nhất" size="15">
    <input type="text" name="secondNumber" value="${secondNumber}" placeholder="Số thứ hai" size="15"><br><br>

    <input type="submit" name="operation" value="addition">
    <input type="submit" name="operation" value="subtract">
    <input type="submit" name="operation" value="multiply">
    <input type="submit" name="operation" value="divide">
</form>

<p>Kết quả:
    <c:choose>
        <c:when test="${result != null}">
            <c:out value="${result}"/>
        </c:when>
        <c:otherwise>
        </c:otherwise>
    </c:choose>
</p>

<c:if test="${result != null && (result.toString().contains('Không thể') || result.toString().contains('Vui lòng') || result.toString().contains('Đã xảy ra lỗi'))}">
    <p style="color: red;">${result}</p>
</c:if>

</body>
</html>