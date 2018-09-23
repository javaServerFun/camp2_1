package pl.survival.camp2.servlets;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@javax.servlet.annotation.WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);

        PrintWriter writer = response.getWriter();

        writer.println("Czas aktualny:" + LocalDateTime.now());
        writer.println("Twoje ip:" + request.getRemoteHost());//nie do końca można polegać
        writer.println("Accept nagłówek:" + request.getHeader("accept"));
    }
}
