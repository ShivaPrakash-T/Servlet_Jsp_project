<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="com.Car" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
    List<Car> cars = (List<Car>) request.getAttribute("ListOfCars");
    %>
    <table border="5px">
       <tr>
<h1>
          <th>carId</th>
          <th>carModel</th>
          <th>carBrand</th>
          <th>carColor</th>
          <th>carPrice</th>
          <th>Update</th>
          <th>Delete</th>
</h1>
       </tr>
       <%
       for(Car car : cars) {
       %>
       <tr>
          <td><%=car.getCarId()%></td>
          <td><%=car.getCarModel()%></td>
          <td><%=car.getCarBrand()%></td>
          <td><%=car.getCarColor()%></td>
          <td><%=car.getCarPrice()%></td>
          <td><a href="UpdateCar?carId=<%=car.getCarId()%> ">Update</a></td>
          <td><a href="DeleteCar?carId=<%=car.getCarId()%>">Delete</a></td>

       </tr>
       <%
       }
       %>

    </table>
<h2 ><a href="index.jsp">Go Back To DashBoard</a></h2>



</body>
</html>
