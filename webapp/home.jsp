<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">
Hi,${sessionScope.user.username} Welcome to Learning Management System
 </h2>
 <h2 align="center">Add Data</h2>
 <p align="center">
<a href = addsubject.jsp>Add subjects</a><br>
<a href = addteacher.jsp>Add teachers</a><br>
<a href = addstudent.jsp>Add Students</a><br>
<a href = addacademicclass.jsp>Add Academic Class</a><br>
</p>
<h2 align="center">Delete Data</h2>
<p align="center" >
<a href = deletesubject.jsp>Delete subjects</a><br>
<a href = deleteteacher.jsp>Delete teachers</a><br>
<a href = deletestudent.jsp>Delete Students</a><br>
<a href = displaystudents.jsp>display</a><br>
<a href = deleteacademicclass.jsp>Delete Academic Class</a><br>
</p>
<h2 align="center">Update</h2>
<p align="center">

<a href = updateAcademicclass.jsp>Update Academic Class</a><br>
<a href = UpdateStudent.jsp>Update Student Class</a><br>
<a href = updatesubject.jsp>Update Subject Class</a><br>
<a href = updateteacher.jsp>Update Teacher Class</a><br>
</p>
<p style="color:red;">${requestScope.msg}</p>

</body>
</html>