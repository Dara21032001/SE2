package com.example.se2_tut02.servlet;

import com.example.se2_tut02.dao.BookDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletDelete", value = "/delete")
public class ServletDelete extends HttpServlet {
    private BookDAO bookDAO;

    @Override
    public void init() throws ServletException{
        bookDAO = new BookDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String id = request.getParameter("id");
    bookDAO.deleteBook(id);
    response.sendRedirect("");
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
