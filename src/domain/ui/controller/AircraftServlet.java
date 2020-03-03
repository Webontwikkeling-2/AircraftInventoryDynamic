package domain.ui.controller;

import domain.db.AircraftDB;
import domain.model.Aircraft;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/AircraftServlet")
public class AircraftServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AircraftDB aircraftDB = new AircraftDB();



        request.setAttribute("aircrafts", aircraftDB.getAircrafts());
        request.setAttribute("meesteplaatsen", aircraftDB.getPlaneWithMostSeats());


        RequestDispatcher view = request.getRequestDispatcher("inventory.jsp");
        view.forward(request, response);
    }
}
