<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./register" method="post">
   UserName<input type="text" name="username"><br>
   Password<input type="text" name="password"><br>
   UserType<select name="usertype">
     <option value="admin">Administrator</option>
     <option value="user">User</option>
     </select>
   <br>
     <input type="submit" Value="Register">
  
</form>
</body>
</html>