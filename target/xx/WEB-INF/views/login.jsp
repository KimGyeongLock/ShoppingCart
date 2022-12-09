<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/12/07
  Time: 2:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        img, label { display:inline-block; }
        label{ width: 130px }
        button { background-color:blue; color: white; font-size: 15px }
    </style>
</head>
<body>
<div style="width:100%; text-align: center; padding-top: 100px">
    <img src="../img/logo.png" height="100">
    <p style="color:lightgray">Made by 21900072 김기연 and 21900064 김경록</p>
    <hr>
    <form method="post" action="loginOk">
        <div><label>User ID: </label><br><input type="text" name="userid" /></div>
        <br>
        <div><label>Password: </label><br><input type="password" name="password" /></div>
        <br><button type="submit" class="btn btn-outline-primary">login</button>
    </form>
</div>

</body>
</html>
