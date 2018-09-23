<%@ page import="java.math.BigDecimal" %>
<%@ page import="pl.survival.camp2.calc.CalculatorBean" %><%--
  Created by IntelliJ IDEA.
  User: javasurv
  Date: 9/23/18
  Time: 7:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP Kalkulator</title>
</head>
<body>
    <h1>Kalkulator</h1>

    <form>
        <%
            CalculatorBean calcBean = new CalculatorBean();
            calcBean.setInput(request.getParameter("input"));
            calcBean.setAccumulator(request.getParameter("accumulator"));

            calcBean.add();
        %>
        Rezultat:<output><%=calcBean.getAccumulator()%></output>
        <br/>
        <form action="?" method="GET">
            <label>Liczba:</label>
            <input type="number" name="input"/>
            <input type="hidden" name="accumulator" value="<%=calcBean.getAccumulator()%>"/>
            <input type="submit" value="+"/>
        </form>
    </form>
</body>
</html>
