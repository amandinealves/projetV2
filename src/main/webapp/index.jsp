<%--
  Created by IntelliJ IDEA.
  User: AALVES
  Date: 23/03/2021
  Time: 19:22
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
     <title>Index</title>

</head>
<body>
<nav class="navbar navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand">Projet Java</a>
        <h3 class="nav-link active" id="EMAIL" name="EMAIL">
            <c:if test="${not empty etudiant}">
                ${etudiant.utilisateur.email}
            </c:if>
            <c:if test="${not empty entreprise}">
                    ${entreprise.utilisateur.email}
            </c:if>
            </h3>
        <form class="d-flex" action="DeconnexionServlet" method="post">
           <button id="DECONNEXION" class="btn btn-outline-danger" type="submit">Se déconnecter</button>
        </form>
    </div>
</nav>

<container>
    <c:if test="${not empty etudiant.idEtudiant}">
        <h3>Liste des entreprises proposant une alternance</h3>
    <c:forEach items="${entreprises}" var="entreprise">
        <div class="row">
            <div class="col-sm-6">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">
                            <c:if test="${not empty entreprise.raisonSociale}">
                                ${entreprise.raisonSociale}
                            </c:if>
                        </h5>
                        <p class="card-text">
                            <c:if test="${not empty entreprise.domaineActivite}">
                                ${entreprise.domaineActivite}
                            </c:if>
                        </p>
                        <p class="card-text">
                            <c:if test="${not empty entreprise.siteEntreprise}">
                                ${entreprise.siteEntreprise}
                            </c:if>
                        </p>

                            <a id="CONTACTER" class="btn btn-primary" href="http://localhost:8080/projetV2_war/annonce.jsp">Contacter</a>

                    </div>
                </div>
            </div>
        </c:forEach>
            </c:if>
<c:if test="${not empty entreprise.idEntreprise}">
    <h3>Listes des candidatures </h3>
<c:forEach items="${annoncesEntUti}" var="annonce">

            <div class="row">
                <div class="col-sm-6">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title">
                                ${anonce.objet}
                            </h5>
                            <p class="card-text">
                                ${annonce.lettreMotivation}
                            </p>
                            <p class="card-text">
                                ${annonce.Etudiant}
                            </p>
                        </div>
                    </div>
                </div>
            </div>
            </c:forEach>
            </c:if>
</container>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>

</body>
</html>
