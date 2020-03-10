<%-- Created by IntelliJ IDEA. --%>
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
      <li class="active" ><a href="index.jsp">Home</a></li>
      <li><a href="AircraftServlet">View Invenntory</a> </li>
      <li><a href="add.jsp">Add a plane</a></li>
    </ul>
  </nav>
</header>
<main id="index">
  <article>
    <h2>Home</h2>
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. A doloribus in ipsa itaque minus nihil recusandae soluta totam veritatis voluptate. A corporis dolorum eligendi nulla quas rem ullam voluptas, voluptates?</p>
    <p><a href="AircraftServlet"><button type="button">View Inventory</button></a></p>
  </article>
</main>
<footer>

  <address><p>Made by:</p> Hendrik Rummens</address>
  <address><p>Contact</p> <a href="hendrik.rummens@student.ucll.be">hendrik.rummens@student.ucll.be</a></address>
  <address><p>Course</p> Webontwikkeling 2</address>
</footer>

</body>
</html>