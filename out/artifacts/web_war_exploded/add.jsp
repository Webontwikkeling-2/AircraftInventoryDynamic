<%--
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
            <li><a href="AircraftServlet">View Invenntory</a></li>
            <li class="active"><a href="add.jsp">Add a plane</a></li>
        </ul>
    </nav>
</header>
<main id="add">
    <article>
        <form method="post" name="nieuw_form" action="AircraftServlet" novalidate>
            <fieldset>
                <legend>New Plane</legend>
                <label for="Name">Name*</label>
                <input name="Name" type="text" id="Name" required>
                <label for="RegNr">Registration Nr*</label>
                <input name="RegNr" type="text" id="RegNr" required>
                <label for="Nr of seats">Nr of seats*</label>
                <input name="Nr of seats" type="text" id="Nr of seats" required>
                <label for="Weight">Weight*</label>
                <input name="Weight" type="text" id="Weight" required>
                <input type="submit" value="Send" id="bewaar">
            </fieldset>
        </form>
    </article>
</main>
<footer>

    <address><p>Made by:</p> Hendrik Rummens</address>
    <address><p>Contact</p> <a href="hendrik.rummens@student.ucll.be">hendrik.rummens@student.ucll.be</a></address>
    <address><p>Course</p> Webontwikkeling 2</address>
</footer>


</body>
</html>
