<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <meta charset="UTF-8">
  <title>Edit Form</title>
</head>
<body>
<br>
<h1>&nbsp;Edit Form</h1>
<hr>
<form:form modelAttribute="shoppingVO" method="POST" action="../editok">
  <form:hidden path="itemID"/>
  <table id="edit" class="table table-bordered" style="width:600px; margin:15px">
    <tr><td>물품명:</td><td><form:input path="itemName"/></td></tr>
    <tr><td>구매처</td><td><form:input path="shoppingmall"/></td></tr>
    <tr><td>가격</td><td><form:input path="price"/></td></tr>
    <tr><td>갯수</td><td><form:input path="cnt" /></td></tr>
    <tr><td>할인가격</td><td><form:input path="discountPrice"/></td></tr>
    <tr><td>배송비</td><td><form:input path="delivery"/></td></tr>
  </table>
  <input type="submit" class="btn btn-dark" value="수정하기" style="margin-left: 10px" />
  <input type="button" class="btn btn-dark" value="취소하기" onclick="history.back()" />
</form:form>
</body>
</html>