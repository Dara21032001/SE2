<%--
  Created by IntelliJ IDEA.
  User: TN
  Date: 2/18/2022
  Time: 10:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<h3 class="text text-success text-center"> Add Book</h3>
<form action="add" method="post">
<table class ="table table-bordered table-primary mt-3" style="width:700px" align="center">
    <tr class="" >
        <td><b>Title:</b> </td>
        <td><input type="text" name ="title" ></td>
    </tr>
    <tr >
        <td><b>Author:</b> </td>
        <td><input type ="text" name ="author" ></td>
    </tr>
    <tr >
        <td><b>Price:</b> </td>
        <td><input type ="text" name ="price" ></td>
    </tr>
    <tr >
        <td></td>
        <td align="center"><button class="btn btn-primary">Add</button></td>
    </tr>
</table>
</form>
</body>
</html>
