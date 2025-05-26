<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Gia Vị Đã Chọn</title>
</head>
<body>
<h1>Gia Vị Đã Chọn</h1>

<c:if test="${not empty selectedCondiments}">
  <ul>
    <c:forEach var="item" items="${selectedCondiments}">
      <li>${item}</li>
    </c:forEach>
  </ul>
</c:if>
<c:if test="${not empty message}">
  <p>${message}</p>
</c:if>

<br>
<a href="/">Quay lại</a>
</body>
</html>