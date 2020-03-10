<%@ page import="domain.db.AircraftDB" %>
<%@ page import="domain.model.Aircraft" %>
<%@ page import="ui.controller.AircraftServlet" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.lang.reflect.Array" %>
<%@ page import="java.util.Collections" %><%--
  Created by IntelliJ IDEA.
  User: ItsZeppo
  Date: 26/02/2020
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="nl">
<head>
    <meta charset="UTF-8">
    <title>Aircraft Inventory</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
<header>
    <h1>Aircraft Inventory</h1>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li class="active"> <a href="AircraftServlet">View Inventory</a></li>
            <li><a href="add.jsp">Add a plane</a></li>
        </ul>
    </nav>
</header>
<main id="inventory">
    <article>
        <h2>Inventory</h2>
        <table>
            <thead>
            <tr>
                <th>Name</th>
                <th>Registration Nr</th>
                <th>Nr of seats</th>
                <th>Weight(tons)</th>
            </tr>
            </thead>
            <tbody>

            <% for (Aircraft aircraft : (ArrayList<Aircraft>) request.getAttribute("aircrafts")){ %>

            <tr>
                <td><%=aircraft.getName()%></td>
                <td><%=aircraft.getRegistrationNr()%></td>
                <td><%=aircraft.getNrOfSeats()%></td>
                <td><%=aircraft.getWeight()%></td>
            </tr>
            <% } %>
            </tbody>
        </table>
        <p>
            <a href="add.jsp"><button type="button">Add a plane</button></a>
        </p>
        <p id="Antoord">Het vliegtuig met het meest aantal plaatsen: <%=request.getAttribute("meesteplaatsen")%></p>

    </article>
</main>
<footer>

    <address><p>Made by:</p> Hendrik Rummens</address>
    <address><p>Contact</p> <a href="hendrik.rummens@student.ucll.be">hendrik.rummens@student.ucll.be</a></address>
    <address><p>Course</p> Webontwikkeling 2</address>
</footer>


</body>
</html>
