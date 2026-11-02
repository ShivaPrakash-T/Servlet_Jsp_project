package com;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/SaveUpdatedCar")
public class SaveUpdatedCar extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int carId = Integer.parseInt(request.getParameter("carId"));
        String carModel = request.getParameter("carModel");
        String carBrand = request.getParameter("carBrand");
        String carColor = request.getParameter("carColor");
        int carPrice = Integer.parseInt(request.getParameter("carPrice"));

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        Car car = entityManager.find(Car.class, carId);
        transaction.begin();;
        car.setCarModel(carModel);
        car.setCarBrand(carBrand);
        car.setCarColor(carColor);
        car.setCarPrice(carPrice);
        transaction.commit();
        response.sendRedirect("DisplayAllCars");


    }
}
