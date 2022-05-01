package com.example.se2_tut02.dao;

import com.example.se2_tut02.dbconnect.DBConnect;
import com.example.se2_tut02.entity.Book;
import org.apache.taglibs.standard.lang.jstl.test.beans.Factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    Connection connection;

    public BookDAO() {

        connection = DBConnect.getConnection();
    }
    // return list of books
    public List<Book> getBookList() {
        List<Book> bookList = new ArrayList<>();
        String sql = "SELECT* From book";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String title = resultSet.getString(2);
                String author = resultSet.getString(3);
                Float price = resultSet.getFloat("price");
                Book book = new Book(id, title, author, price);
                bookList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    }
    //delete book
    public void deleteBook(String id){
        String sql = "DELETE FROM book where id =? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1 ,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //get book information
    public Book getBook(int id){
        Book book = null;
        String sql = "SELECT * from book WHERE id =?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
              // int  id = resultSet.getInt(1);
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                Float price = resultSet.getFloat("price");
                 book = new Book(id, title, author, price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
       return book;
    }
    //upgate book
    public void updateBook(String title, String author, float price, int id){
        String sql = "UPDATE book SET title=? , author =?, price=? where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,title);
            preparedStatement.setString(2,author);
            preparedStatement.setFloat(3,price);
            preparedStatement.setInt(4,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addBook(String title, String author, String price){
        String sql = "INSERT into book(title, author, price) values(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,title);
            preparedStatement.setString(2,author);
            preparedStatement.setString(3,price);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
