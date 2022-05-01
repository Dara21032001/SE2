package com.example.se2_tut02.servlet;

import com.example.se2_tut02.dao.BookDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletAdd", value = "/add")
public class ServletAdd extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
    private BookDAO bookDAO;
    public void init() throws ServletException{
        bookDAO = new BookDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String title = request.getParameter("title");
    String author= request.getParameter("author");
    String price = request.getParameter("price");
    bookDAO.addBook(title,author,price);

    }
}
