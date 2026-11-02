<%@ page import="com.Car" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Car</title>
</head>
<body>
<h1>Update Car Details</h1>

<%
    Car car = (Car) request.getAttribute("Car");
%>

<form action="SaveUpdatedCar" method="post">
    <input type="number" value="<%=car.getCarId()%>" name="carId" readonly="true" placeholder="Enter CarId"><br>
    <input type="text" value="<%=car.getCarModel()%>" name="carModel" placeholder="Enter CarModel"><br>
    <input type="text" value="<%=car.getCarBrand()%>" name="carBrand" placeholder="Enter CarBrand"><br>
    <input type="text" value="<%=car.getCarColor()%>" name="carColor" placeholder="Enter CarColor"><br>
    <input type="number" value="<%=car.getCarPrice()%>" name="carPrice" placeholder="Enter CarPrice"><br>
    <button type="submit">Update</button>
</form>

</body>
</html>

