<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="LightBlue">
<h1>                  FLY AWAY                </h1>
<h2> Search Flights</h2>
<form action="./searchflights" method="post">
<table>
   <tr>source<input type="text" name="source"></tr>
   <tr>destination<input type="text" name="destination"><br></tr>
  <tr> Date<input type="text" name="Date"></tr>
    <tr>Airlines<input type="text" name="Airlines"></tr>
    </table>
   <br>
      <a href="./search">Search Flights</a><br>
      <a href="./Adminlogin.jsp">Admin Login</a>
     </form>

   <p style="color:red;">${requestScope.msg}</p>
</body>
</html>