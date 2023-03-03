<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<H1>Hi,${sessionScope.User.name} Welcome to Booking system</H1>
<h1>Please select the payment method</h1>
  <label for="Payment">Choose a Payment Method:</label>
  <select name="Payment" id="Payment">
    <option value="internet banking">Internet Banking</option>
    <option value="Card">Card</option>
   </select>
   </br>
   <a href="submit.jsp">Submit</a>
</body>
</html>