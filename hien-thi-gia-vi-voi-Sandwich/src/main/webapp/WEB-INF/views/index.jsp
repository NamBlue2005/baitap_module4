<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chọn Gia Vị Sandwich</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="post">
    <input type="checkbox" id="lettuce" name="condiment" value="Lettuce">
    <label for="lettuce">Lettuce</label><br>

    <input type="checkbox" id="tomato" name="condiment" value="Tomato">
    <label for="tomato">Tomato</label><br>

    <input type="checkbox" id="mustard" name="condiment" value="Mustard">
    <label for="mustard">Mustard</label><br>

    <input type="checkbox" id="sprouts" name="condiment" value="Sprouts">
    <label for="sprouts">Sprouts</label><br><br>

    <input type="submit" value="Save">
</form>
</body>
</html>