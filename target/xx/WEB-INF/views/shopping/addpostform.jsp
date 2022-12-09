<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <meta charset="UTF-8">
  <title>Insert title here</title>
</head>
<body>
<br>
<h1>&nbsp;Add New Post</h1>
<hr>
<form action="addok" method="post">
  <table id="edit" class="table table-bordered" style="width:600px; margin:15px">
    <tr><td>구매물품:</td><td><input type="text" name="ItemName"/></td></tr><!--ItemName type="text"-->
    <tr><td>구매처:</td><td>
      <select name="Shoppingmall">
        <option value="Naver">네이버</option>
        <option value="Coupang">쿠팡</option>
        <option value="Gmarket">G마켓</option>
        <option value="11street">11번가</option>
        <option value="other">그 외</option>
      </select>
    </td></tr><!--Shoppingmall type="select"-->
    <tr><td>가격:</td><td><input type="text" name="price"/></td></tr><!--Price type="text"-->
    <tr><td>수량:</td><td><input type="number" name="cnt" /></td></tr><!--cnt type="number"-->
    <tr><td>할인가격:</td><td><input type="number" name="discountPrice"/></td></tr>
    <tr><td>배달비:</td><td><input type="number" name="delivery"/></td></tr>
  </table>
  <button type="button" class="btn btn-dark" onclick="location.href='list'" style="margin-left: 10px">목록보기</button>
  <input type="submit" class="btn btn-dark" value="등록하기" />
  <button type="reset" class="btn btn-dark">초기화</button>
</form>

</body>
</html>