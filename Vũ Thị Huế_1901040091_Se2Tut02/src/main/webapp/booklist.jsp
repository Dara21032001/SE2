<%--
  Created by IntelliJ IDEA.
  User: TN
  Date: 2/17/2022
  Time: 12:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--jstl--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>
<%--    bootstrap--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<%--    script--%>
    <script>
        function showMessage(id){
            var option = confirm("Are you sure to delete this book");
            if(option===true){
                window.location.href = "delete?id="+id;
            }
        }
    </script>
</head>
<body>
<h1 style="background-color: black"><span style="color:white; margin-right: 1200px">BookList</span><a href="AddBook.jsp"> <button class="btn" style="color:white"><h2>AddBook</h2></button></a></h1>
<div class ="container col-md-8 mt-4">
<h3 class ="text text-success text-center">Book List</h3>
    <table class ="table table-bordered text-center mt-3">
        <thead>
        <tr class="table-success" >
            <th>Book ID</th>
            <th>Book Title</th>
            <th>Book Author</th>
            <th>Book Price</th>
            <th>Action</th>
        </tr>
        </thead>
        <c:forEach var ="book" items="${bookss}">
            <tr >
                <td><c:out value="${book.id}" /> </td>
                <td><c:out value="${book.title}" /></td>
                <td><c:out value="${book.author}" /></td>
                <td><c:out value="${book.price}" /></td>
                <td><a href="edit?id=${book.id}" class ="btn btn-success">Edit</a><a href="#" onclick="showMessage(${book.id})" class="btn btn-danger">Delete</a> </td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
