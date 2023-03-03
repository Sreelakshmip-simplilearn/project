<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="orgg.simplilearn.lms.entity.Flights"%>
    <%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
 <tr>
 <th>Flightid</th>
 <th>Source</th>
 <th>Destination</th>
 <th>Flight Name</th>
 <th> Date </th>
 <th> Booking</th>
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
	<td><a href="UserLogin.jsp">Book Now</a>
	<%session.setAttribute("flig",flig.getFlightid());%>
	
	</tr>
	
	<%
}
	%>
 <a href="UserLogin.jsp">Book Flights</a>
</body>
</html>