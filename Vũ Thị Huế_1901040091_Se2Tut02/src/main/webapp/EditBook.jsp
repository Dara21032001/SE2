<%--
  Created by IntelliJ IDEA.
  User: TN
  Date: 2/18/2022
  Time: 10:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language=
        "java" %>
<html>
<head>
    <title>Edit Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<h1 class="text text-success text-center" style="margin-top: 50px ; margin-bottom: 40px"> Edit Book</h1>
<form action="edit" method="post">
<table class ="table table-bordered table-primary mt-3" style="width:700px" align="center">
    <tr >
        <td><b>ID:</b> </td>
        <td><input type="text" name ="id" value="${book.id}" readonly /></td>
    </tr>
    <tr >
        <td><b>Title:</b> </td>
        <td><input type="text" name ="title" value="${book.title}" /></td>
    </tr>
    <tr >
        <td><b>Author:</b> </td>
        <td><input type ="text" name ="author" value="${book.author}" /></td>
    </tr>
    <tr >
        <td><b>Price:</b> </td>
        <td><input type ="text" name ="price" value="${book.price}" /></td>
    </tr>
    <tr >
        <td></td>
        <td align="center"><button class="btn btn-primary">Edit</button></td>
    </tr>
</table>
</form>
</body>
</html>
