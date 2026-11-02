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
import java.util.List;

@WebServlet("/DisplayAllCars")
public class DisplayAllCars extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-example");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Car> Car = entityManager.createQuery("from Car ", Car.class).getResultList();

        request.setAttribute("ListOfCars",Car);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("DisplayCar.jsp");
        requestDispatcher.forward(request,response);



    }
}
