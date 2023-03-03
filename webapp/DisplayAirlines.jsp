<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="orgg.simplilearn.lms.entity.Airlines"%>
    <%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid white;
  border-collapse: collapse;
}
th, td {
  background-color: #96D4D4;
}
</style>
</head>
<body>
<table>
 <tr>
 <th>Airline ID</th>
 <th>Airline Name</th>
 </tr>
 <% 
 List<Airlines> airlines=(List<Airlines>)request.getAttribute("airlines");
 for(Airlines air:airlines)
 {
 %>

	<tr> 
	<td><%=air.getairlineid() %> </td>
	<td><%=air.getAirlinename() %> </td>
	
	<%session.setAttribute("air",air.getairlineid());%>
	
	<%
}
	%>


</body>
</html>