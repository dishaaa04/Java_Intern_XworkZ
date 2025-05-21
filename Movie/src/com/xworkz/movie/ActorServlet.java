package com.xworkz.movie;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ActorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String language = req.getParameter("language");
        String salary = req.getParameter("salary");
        String blockbusters = req.getParameter("blockbusters");
        String flops = req.getParameter("flops");
        String upcomingMovie = req.getParameter("upcomingMovie");
        String producer = req.getParameter("producer");
        String director = req.getParameter("director");
        String budget = req.getParameter("budget");

        req.setAttribute("name", name);
        req.setAttribute("language", language);
        req.setAttribute("salary", salary);
        req.setAttribute("blockbusters", blockbusters);
        req.setAttribute("flops", flops);
        req.setAttribute("upcomingMovie", upcomingMovie);
        req.setAttribute("producer", producer);
        req.setAttribute("director", director);
        req.setAttribute("budget", budget);

        RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
        dispatcher.forward(req, resp);
    }
}
