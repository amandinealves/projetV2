<%--
  Created by IntelliJ IDEA.
  User: AALVES
  Date: 23/03/2021
  Time: 09:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">

    <title>Inscription</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

</head>
<body>
<div>
    <div>
        <!-- <img src="img/scrum-image.png" style="width: 300px;display: block;margin: auto;margin-bottom: 40px;" />-->
        <h1>Pas encore inscrit ? Inscrivez-vous!</h1>
        <div>
            <% if (request.getAttribute("error") != null) {%>
            <div class="error">
                Une erreur a été rencontrée:
                <%=request.getAttribute("error")%>
            </div>
            <%}%>
        </div>
        <form class="form-group" action="InscriptionServlet" method="post">
            <div class="form-group row">
                <div class="col">
                    <label for="TYPEUTILISATEUR">Vous êtes :</label> <select
                        id="TYPEUTILISATEUR" name="TYPEUTILISATEUR" class="form-control required">
                    <option value="1">Etudiant</option>
                    <option value="2">Entreprise</option>
                </select>
                </div>
            </div>
            <div id="ENTREPRISE" style="display: none">
                <div class="form-group row">
                    <div class="col">
                        <label for="RAISON_SOCIALE">Raison Sociale :</label>
                        <input type="text"
                               class="form-control" name="RAISON_SOCIALE" id="RAISON_SOCIALE"
                               placeholder="Entrez votre raison sociale"
                               required>
                    </div>
                    <div class="col">
                        <label for="DOMAINE_ACTIVITE">Domaine activité :</label> <input type="text"
                                                                    class="form-control" name="DOMAINE_ACTIVITE" id="DOMAINE_ACTIVITE"
                                                                    placeholder="Entrez votre domaine d'activité" required>
                    </div>
                </div>
                <div class=""form-group row"">
                    <div class="col">
                        <label for="SITE_ENTREPRISE">Domaine activité :</label> <input type="text"
                                                                                        class="form-control" name="SITE_ENTREPRISE" id="SITE_ENTREPRISE"
                                                                                        placeholder="Entrez votre site" required>
                    </div>
                </div>
            </div>
            <div id="ETUDIANT">
                <div class="form-group row">
                    <div class="col">
                        <label for="NOM">Nom :</label> <input type="text"
                                                              class="form-control" name="NOM" id="NOM"
                                                              placeholder="Entrez votre nom"
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
                </div>
            </div>

            <div class="form-group row">
                <div class="col">
                    <label for="EMAIL">Email :</label> <input type="email"
                                                              class="form-control" name="EMAIL" id="EMAIL"
                                                              placeholder="Entrez votre email" required>
                </div>
                <div class="col">
                    <label for="MDP">Mot de passe :</label> <input type="password"
                                                                   class="form-control" name="MDP" id="MDP"
                                                                   placeholder="Entrez votre mdp"
                                                                   required>

                </div>
            </div>
            <div class="form-group row">
                <div class="col">
                    <label for="ADRESSE">Adresse :</label>
                    <textarea class="form-control" rows="3" name="ADRESSE" id="ADRESSE"
                              placeholder="Entrez votre adresse">
					</textarea>
                </div>
                <div class="col">
                    <label for="TEL">N° Tel :</label> <input type="text"
                                                             class="form-control" name="TEL" id="TEL"
                                                             placeholder="Entrez votre n° tel">
                </div>
            </div>
            <button type="submit" class="btn btn-info btn-lg btn-block">S'inscrire</button>
        </form>
    </div>
</div>
<script>
    $('#TYPEUTILISATEUR').on('change',function(){
        if($(this).val()=='1'){
            $('#ETUDIANT').show();
            $('#ENTREPRISE').hide();
        }else{
            $('#ENTREPRISE').show();
            $('#ETUDIANT').hide();
        }
    })
</script>

</body>
</html>
