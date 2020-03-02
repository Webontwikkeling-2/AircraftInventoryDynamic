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

        Aircraft test1 = new Aircraft("Airbus A380", "F-WWOW", 544, 275);
        Aircraft test2 = new Aircraft("Boeing 737 MAX", "DF-OQS", 220, 100);
        Aircraft test3 = new Aircraft("Boeing 747-8", "TS-OPQ", 467, 442);
        Aircraft test4 = new Aircraft("Boeing 767-300F", "OP-QOR", 351, 204);
        Aircraft test5 = new Aircraft("Airbus A330", "LQ-ARF", 290, 181);


        aircraftDB.add(test1);
        aircraftDB.add(test2);
        aircraftDB.add(test3);
        aircraftDB.add(test4);
        aircraftDB.add(test5);

        request.setAttribute("aircrafts", aircraftDB.getAircrafts());
        request.setAttribute("meesteplaatsen", aircraftDB.getPlaneWithMostSeats());


        RequestDispatcher view = request.getRequestDispatcher("inventory.jsp");
        view.forward(request, response);
    }
}
