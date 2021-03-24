<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Page d'inscription étudiant</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<h3>Inscription à finaliser</h3>
	<input type="text" class="form-control"  id="ID_UTILISATEUR" name="ID_UTILISATEUR" value="${utilisateur.idUtilisateur}" >

	<form class="form-group" action="InscriptionEtudiantServlet" method="post">
		<div class="form-group row">
			<div class="col">
					<label for="NOM">Nom :</label> <input type="text"
					class="form-control" name="NOM" id="NOM" placeholder="Entrez votre nom"
					required>
			</div>
			<div class="col">
				<label for="PRENOM">Prénom :</label> <input type="text"
					class="form-control" name="PRENOM" id="PRENOM"
					placeholder="Entrez votre prénom" required>
			</div>
		</div>
		<div class="form-group row">
			<div class="col">
				<label for="DATE_NAISSANCE">Date naissance :</label> <input
					type="date" id="DATE_NAISSANCE" name="DATE_NAISSANCE"
					class="form-control">
			</div>
			<div class="col">
				<label for="ECOLE">Ecole :</label> <input type="text"
					class="form-control" name="ECOLE" id="ECOLE"
					placeholder="Saisir école alternance" required>
			</div>
		</div>
		<div class="form-group row">
			<div class="col">
				<label for="DIPLOME">Diplôme :</label> <input type="text"
					class="form-control" name="DIPLOME" id="DIPLOME"
					placeholder="Saisir diplôme alternance" required>
			</div>
			<div class="col">
			
				<label for="STATUT">Statut :</label> <select id="STATUT"
					class="form-control" name="STATUT">
					<option value="">-Sélectionner votre situation -</option>
				<c:forEach items="${statuts}" var="statut">
					<option value="${statut.idStatut}">${statut.description}</option>
				</c:forEach>
			</select>
			</div>
		</div>
		<div class="form-group row">
			<div class="col">
				<label for="LABEL_CV">CV :</label>
				<%--				destination=  LABEL_CV--%>
				<label class="form-label" for="CV" id="LABEL_CV">Default file input example</label>
				<%--				file = CV--%>
				<input type="file" class="form-control" id="CV" name="CV"/>
			</div>
		</div>


		<div class="form-group row">
			<div class="col">
				<label for="LABEL_LETTRE_MOTIVATION">Lettre de motivation :</label>
				<label class="form-label" for="LETTRE_MOTIVATION" id="LABEL_LETTRE_MOTIVATION"
					   name="LABEL_LETTRE_MOTIVATION">Default file input example</label>
				<input type="file" class="form-control" id="LETTRE_MOTIVATION" name="LETTRE_MOTIVATION"/>
			</div>
		</div>

        <div>
            <button type="submit" class="btn btn-info btn-lg btn-block">Valider Inscription</button>
        </div>
    </form>
</body>
</html>