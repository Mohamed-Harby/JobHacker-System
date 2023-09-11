package com.harby.servletandjsp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;

@WebServlet(value = {"/age-servlet"})
public class AgeServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String dateParam = req.getParameter("date");
        LocalDate date = LocalDate.parse(dateParam);
        LocalDate now = LocalDate.now();

        Period diff = Period.between(date, now);

        req.setAttribute("years", diff.getYears());
        req.setAttribute("months", diff.getMonths());
        req.setAttribute("days", diff.getDays());

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("age.jsp");
        requestDispatcher.forward(req, res);
    }

}
