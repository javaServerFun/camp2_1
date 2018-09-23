package pl.survival.camp2.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator", urlPatterns = "/calc")
public class Calculator extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String arga = request.getParameter("a");
        String argb = request.getParameter("b");
        int a = Integer.parseInt(arga);
        int b = Integer.parseInt(argb);
        writer.println("wynik=" + (a+b));

    }
}
