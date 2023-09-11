package com.harby.servletandjsp;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = {"/factorial"})
public class FactorialServlet extends HttpServlet {

    private String headerMessage;
    public void init() {
        headerMessage = "Factorial up to 10!";
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html><body>");
        out.println("<h1>" + headerMessage + "</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Number</th><th>Factorial</th></tr>");
        for (int i = 0; i <= 10; ++i) {
            out.println("<tr><td>" + i + "</td><td>" + factorial(i) + "</td></tr>");
        }
        out.println("</table>");
        out.println("</body></html>");
    }

    public int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public void destroy() {
    }

}
