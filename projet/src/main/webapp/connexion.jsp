<%--
  Created by IntelliJ IDEA.
  User: AALVES
  Date: 23/03/2021
  Time: 09:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <link href="https://getbootstrap.com/docs/5.0/examples/sign-in/signin.css"  rel="stylesheet" ></link>
    <title>Connexion JSP</title>
</head>
<body class="text-center">
<div>
    <c:if test="${not empty error}">
        <p>Une erreur a été rencontrée:"${error }"</p>
    </c:if>
</div>
<main class="form-signin">
    <form action="ConnexionServlet" method="post">
        <h1 class="h3 mb-3 fw-normal">Se connecter</h1>
        <div class="form-floating">
            <input type="email" id="EMAIL" name="EMAIL" placeholder="Saisir votre email" required>
        </div>
        <div  class="form-floating">
            <input type="password" id="MDP" name="MDP" placeholder="Saisir votre mot de passe" required>
        </div>
        <button type="submit" class="btn btn-lg btn-info btn-block">Se connecter</button>
        <a href="http://localhost:8080/projetV2_war/inscription.jsp" class="btn btn-lg btn-warning btn-block">S'inscrire</a>
    </form>
</main>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

</body>
</html>
