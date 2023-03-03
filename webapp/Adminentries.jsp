<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h1 style="text-align:center;">Please add the details </h1>
<Table style="width:100%">
<tr style="height:150px">

<h1>
<th >Airline details</th>
<th>Flight details</th>
<th>Places details</th>
<th>show data</th>
</h1>
<h2>
<a href="Adminpassword.jsp">Change Password</a> </h2> <br>
</tr>
<tr style="height:100px"> 

<td><a href="AddAirlines.jsp">Add Airlines</a> <br> </td>
 <td> <a href="Addflights.jsp">Add Flights</a> <br></td>
 <td> <a href="Addplaces.jsp">Add Places</a><br></td>
 <td> <a href="./displayflight">Display Flights</a><br></td>
 </tr>
 <tr style="height:100px">
  
  <td>  <a href="updateairlines.jsp">Update Airlines</a></td>
   <td><a href="update.jsp">Update flights</a><br></td>
    <td><a href="updateplaces.jsp">Update Places</a></td>
     <td> <a href="./displayair">Display Airline</a><br></td>
    </tr>
    <tr style="height:100px">
    <td><a href="DeleteAirlines.jsp">Delete Airlines</a></td>
    <td> <a href="Deleteflights.jsp">Delete Flights</a></td>
    <td><a href="Deleteplaces.jsp">Delete Places</a></td>
    <td> <a href="./displayplaces">Display Places</a><br></td>
    </tr>
    
    </Table>
    <br>
  <b>  <a href="index.jsp">Go To Home Page</a></b><br>
  <p style="color:red;">${requestScope.msg}</p>


</body>
</html>