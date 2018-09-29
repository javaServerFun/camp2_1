<%@ page import="java.math.BigDecimal" %>
<%@ page import="pl.survival.camp2.calc.CalculatorBean" %><%--
  Created by IntelliJ IDEA.
  User: javasurv
  Date: 9/23/18
  Time: 7:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSP Kalkulator</title>
</head>
<body>
    <h1>Kalkulator</h1>

    <form>
        <jsp:useBean id="calculator" class="pl.survival.camp2.calc.CalculatorBean"/>
        <c:set target="${calculator}" property="input" value="${param.input}"/>
        <c:set target="${calculator}" property="accumulator" value="${param.accumulator}"/>
        <c:set target="${calculator}" property="operation" value="${param.operation}"/>

        Rezultat:<output><c:out value="${calculator.accumulator}"/></output>
        <br/>
        <form action="?" method="GET">
            <label>Liczba:</label>
            <input type="number" name="input"/>
            <input type="hidden" name="accumulator" value="<c:out value='${calculator.accumulator}'/>"/>
            <input type="submit" value="+" name="operation"/>
            <input type="submit" value="-" name="operation"/>
            <input type="submit" value="*" name="operation"/>
            <input type="submit" value="/" name="operation"/>d
        </form>
    </form>
</body>
</html>
d