<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="orgg.simplilearn.lms.entity.Places"%>
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

 <th>Source</th>
 <th>Destination</th>
 <th>End Time</th>
 <th> Start time </th>
 </tr>
 <% 
 List<Places> places=(List<Places>)request.getAttribute("places");
 for(Places plac:places)
 {
 %>

	<tr> 
	<td><%=plac.getSource() %> </td>
	<td><%=plac.getDestination() %> </td>
	<td><%=plac.getEndtime() %> </td>
	<td><%=plac.getStarttime() %> </td>
	
	
	
	<%session.setAttribute("plac",plac.getTripid());%>
	
	</tr>
	
	<%
}
	%>

</body>
</html>