package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/UpdateCar")

public class UpdateCarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int carId = Integer.parseInt(request.getParameter("carId"));
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Car car = entityManager.find(Car.class, carId);

        request.setAttribute("Car",car);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("UpdateCar.jsp");
        requestDispatcher.forward(request,response);
    }

}
