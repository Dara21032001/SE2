package com.example.se2_tut02.servlet;

import com.example.se2_tut02.dao.BookDAO;
import com.example.se2_tut02.entity.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletBook", value = "/")
public class ServletBook extends HttpServlet {
    private BookDAO bookDAO;

    @Override
    public void init() throws ServletException{
    bookDAO = new BookDAO();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    getBookList( request, response);
    }

    private  void getBookList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> bookList = bookDAO.getBookList();

        //push data from servlet(backend) to jsp (front-end)
        request.setAttribute("bookss", bookList);
        // render the jsp page to display table
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("booklist.jsp");
        requestDispatcher.forward(request, response);

    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//    }
}
