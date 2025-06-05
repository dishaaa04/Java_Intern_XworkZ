package com.chronogrid.servlets;

import com.chronogrid.model.Task;
import com.chronogrid.util.TaskScheduler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/task")
public class TaskServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String command = req.getParameter("command");

        Task task = new Task();
        task.setName(name);
        task.setCommand(command);

        TaskScheduler scheduler = new TaskScheduler();
        scheduler.schedule(task);

        resp.sendRedirect("tasks.jsp");
    }
}
