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

@WebServlet("/DeleteCar")
public class DeleteCarServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int carId = Integer.parseInt(request.getParameter("carId"));
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        Car car = entityManager.find(Car.class, carId);
        transaction.begin();
        entityManager.remove(car);
        transaction.commit();

        response.sendRedirect("DisplayAllCars");


    }

}
