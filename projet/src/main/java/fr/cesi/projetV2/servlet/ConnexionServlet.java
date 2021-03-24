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

@WebServlet(name = "ConnexionServlet", value = "/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UtilisateurService us;
    private EtudiantService es;
    private EntrepriseService ents;

    /**
     * Default constructor.
     */
    public ConnexionServlet() {
        // TODO Auto-generated constructor stub
        us = new UtilisateurServiceImpl();
        es = new EtudiantServiceImpl();
        ents = new EntrepriseServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("connexion.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("EMAIL");
        String mdp = request.getParameter("MDP");
        Utilisateur utilisateur = us.rechercherUtilisateur(email, mdp);
        if(utilisateur == null) {
            request.setAttribute("error", "Mot de passe ou identifiant incorrect");
            request.getRequestDispatcher("connexion.jsp").forward(request, response);
        }else {
            System.out.println("Connexion");
            HttpSession	session = request.getSession();
            Etudiant etudiant = es.rechercherEtudiantParIDUti(utilisateur.getIdUtilisateur());
            System.out.println("etudiant");
            Entreprise entreprise = ents.rechercherEntrepriseParIDUti(utilisateur.getIdUtilisateur());
            System.out.println("entreprise");
            //session.setAttribute("id-etudiant",etudiant.getIdEtudiant());
            //session.setAttribute("id-entreprise",entreprise.getIdEntreprise());
            if(etudiant != null){
                session.setAttribute("etudiant",etudiant);
            }else{
                if(entreprise != null){
                    session.setAttribute("entreprise",entreprise);
                }
            }
            response.sendRedirect("IndexServlet");
        }
    }
}
