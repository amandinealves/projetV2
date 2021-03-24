<%--
  Created by IntelliJ IDEA.
  User: AALVES
  Date: 24/03/2021
  Time: 09:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Annonce Entreprise</title>
    <form class="form-group" action="AnnonceServlet" method="post">

        <div class="form-group row">
            <div class="col">
                <label for="OBJET">Objet :</label>
                <input type="text" class="form-control" name="OBJET" id="OBJET" placeholder="Entrez votre email" required>
            </div>
        </div>
        <div class="form-group row">
            <div class="col">
                <label for="LETTRE_MOTIVATION">Lettre motivation :</label>
                <textarea class="form-control" name="LETTRE_MOTIVATION" id="LETTRE_MOTIVATION" rows="15"></textarea>
            </div>
        </div>
        <button type="submit" class="btn btn-lg btn-info btn-block">Envoyer Candidature</button>
    </form>
</head>
<body>

</body>
</html>
