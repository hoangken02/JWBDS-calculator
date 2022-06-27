<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h1>Calculator
</h1>
<form action="/calculator" method="get">
    <label>First Number: </label>
    <input type="text" id="firstNumber" name="firstNumber"><br>
    <label>Second Number: </label>
    <input type="text" id="secondNumber" name="secondNumber"><br>
    <input type="submit" name="operator" value="+" placeholder="Addition">
    <input type="submit" name="operator" value="-" placeholder="Subtraction">
    <input type="submit" name="operator" value="*" placeholder="Multiplication">
    <input type="submit" name="operator" value="/" placeholder="Division">
    <p>Result: </p>

    <c:if test='${requestScope["result"] != null}'>
        <p>${result}</p>
    </c:if>

</form>
</body>
</html>