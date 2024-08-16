<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>MY DATABASE</title>
    <link rel="stylesheet" type="text/css" href="../style.css">
</head>
<body>
<h1>MY DATABASE</h1>
<form action="Data" method="get">
    <label for="fname">Enter first name:</label>
    <input type="text" id="fname" name="fname" required>
    <br><br>
    <label for="sname">Enter last name:</label>
    <input type="text" id="sname" name="sname" required>
    <br><br>
    <button type="submit" name="operation" value="save">SAVE!</button>
</form>
</body>
</html>
