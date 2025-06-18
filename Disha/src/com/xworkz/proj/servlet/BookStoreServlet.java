package com.xworkz.proj.servlet;

import com.xworkz.proj.dto.BookStoreDTO;
import com.xworkz.proj.service.BookStoreService;
import com.xworkz.proj.service.BookStoreServiceImplementation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register", loadOnStartup = 1)
public class BookStoreServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= req.getParameter("name");
        String mobile= req.getParameter("mobile");
        String email= req.getParameter("email");
        String bookid= req.getParameter("bookid");

        Double mobileNo= Double.parseDouble(mobile);
        int bookID= Integer.parseInt(bookid);


        BookStoreDTO bookStoreDTO = new BookStoreDTO(name,mobileNo,email,bookID);
        req.setAttribute("book",bookStoreDTO);
        System.out.println("book store dto is running"+bookStoreDTO);



        BookStoreService bookStoreService = new BookStoreServiceImplementation();
        bookStoreService.validationandsave(bookStoreDTO);


        RequestDispatcher requestDispatcher=req.getRequestDispatcher("registerResult.jsp");
        requestDispatcher.forward(req,resp);


    }
}