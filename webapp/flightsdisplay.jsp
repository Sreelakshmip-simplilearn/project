<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="orgg.simplilearn.lms.entity.Flights"%>
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
 <th>Flightid</th>
 <th>Source</th>
 <th>Destination</th>
 <th>Flight Name</th>
 <th> Date </th>
 <th> Price </th>
 
 </tr>
 <% 
 List<Flights> flights=(List<Flights>)request.getAttribute("flights");
 for(Flights flig:flights)
 {
 %>

	<tr> 
	<td><%=flig.getFlightid() %> </td>
	<td><%=flig.getSource() %> </td>
	<td><%=flig.getDestination() %> </td>
	<td><%=flig.getFlightname() %> </td>
	<td><%=flig.getDate() %></td>
	<td><%=flig.getPrice() %></td>
	
	<%session.setAttribute("flig",flig.getFlightid());%>
	
	</tr>
	
	<%
}
	%>

</body>
</html>