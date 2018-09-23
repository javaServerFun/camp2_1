package pl.survival.camp2.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator", urlPatterns = "/pl/survival/camp2/calc")
public class Calculator extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        String arga = request.getParameter("a");
        String argb = request.getParameter("b");
        try {
            int a = Integer.parseInt(arga);
            int b = Integer.parseInt(argb);
            writer.println("wynik=" + (a + b));
            writer.println("<br/><a href='/index.html'>powrót</a>");
        } catch (NumberFormatException nfe) {
            writer.println("Błędne dane");
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }

    }
}
