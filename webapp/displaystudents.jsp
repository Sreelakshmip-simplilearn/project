
<%@page import="java.util.*"%>
<%@page import="org.simplilearn.lms.entity.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
List<Student> students=(List<Student>)request.getAttribute("students");

%>
 <table>
 <tr>
 <td>stid</td>
 <td>Name</td>
 </tr>
 <% 
for(Student student:students)
	{
		%>
	<tr> 
	<td><%=student.getStid() %> </td>
	<td><%=student.getName() %> </td>
	<%
	session.setAttribute("stid",student.getStid());
		%>
	
	</tr>
	
	<%
}
	%>
	<a href="home.jsp">Go to Home Page</a>
	
</table>
</body>
</html>
