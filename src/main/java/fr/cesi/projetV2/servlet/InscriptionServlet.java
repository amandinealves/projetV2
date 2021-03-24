package fr.cesi.projetV2.servlet;

import fr.cesi.projetV2.business.Entreprise;
import fr.cesi.projetV2.business.Etudiant;
import fr.cesi.projetV2.business.Utilisateur;
import fr.cesi.projetV2.service.EntrepriseService;
import fr.cesi.projetV2.service.EtudiantService;
import fr.cesi.projetV2.service.UtilisateurService;
import fr.cesi.projetV2.service.impl.EntrepriseServiceImpl;
import fr.cesi.projetV2.service.impl.EtudiantServiceImpl;
import fr.cesi.projetV2.service.impl.UtilisateurServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "InscriptionServlet", value = "/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UtilisateurService us;
    private EtudiantService es;
    private EntrepriseService ents;

    public InscriptionServlet() {
        us = new UtilisateurServiceImpl();
        es = new EtudiantServiceImpl();
        ents = new EntrepriseServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String typeUti = request.getParameter("TYPEUTILISATEUR");
        System.out.println("TYPEUTILISATEUR == " + typeUti);
        us.ajouterUtilisateur(request.getParameter("EMAIL"), request.getParameter("MDP"),
                request.getParameter("ADRESSE"), request.getParameter("TEL"));
        Utilisateur utilisateur = us.recupererUtilisateurId(request.getParameter("EMAIL"));
        System.out.println(utilisateur.getIdUtilisateur());
        if (utilisateur != null){
            HttpSession	session = request.getSession();
            switch (typeUti) {
                case "1":
                    Etudiant etudiant = es.ajouterEtudiant(utilisateur.getIdUtilisateur());
                    session.setAttribute("etudiant",etudiant);
                     break;
                case "2":
                    Entreprise entreprise = ents.ajouterEntreprise(utilisateur.getIdUtilisateur());
                    session.setAttribute("entreprise",entreprise);
                    //response.sendRedirect("InscriptionEntrepriseServlet");
                    //request.getRequestDispatcher("inscriptionEntreprise.jsp").forward(request, response);
                    break;
            }
            response.sendRedirect("IndexServlet");
        }else{
            request.getRequestDispatcher("connexion.jsp").forward(request, response);
        }
    }
}
