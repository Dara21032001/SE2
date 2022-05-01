package com.example.se2_tut02.servlet;

import com.example.se2_tut02.dao.BookDAO;
import com.example.se2_tut02.entity.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletEdit", value = "/edit")
public class ServletEdit extends HttpServlet {
    private BookDAO bookDAO;
    public void init() throws ServletException{
         bookDAO = new BookDAO();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int id = Integer.parseInt(request.getParameter("id"));
    Book book =  bookDAO.getBook(id);
    request.setAttribute("book",book);
    request.getRequestDispatcher("EditBook.jsp").forward(request,response);
    }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int id = Integer.parseInt(request.getParameter("id"));
    String title = request.getParameter("title");
    String author = request.getParameter("author");
    Float price = Float.valueOf(request.getParameter("price"));
    bookDAO.updateBook(title,author,price,id);
    response.sendRedirect("");
   }
}
