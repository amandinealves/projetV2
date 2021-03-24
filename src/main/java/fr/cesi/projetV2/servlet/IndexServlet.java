package fr.cesi.projetV2.servlet;

import fr.cesi.projetV2.business.Annonce;
import fr.cesi.projetV2.business.Entreprise;
import fr.cesi.projetV2.service.*;
import fr.cesi.projetV2.service.impl.EntrepriseServiceImpl;
import fr.cesi.projetV2.service.impl.EtudiantServiceImpl;
import fr.cesi.projetV2.service.impl.UtilisateurServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "IndexServlet", value = "/IndexServlet")
public class IndexServlet extends HttpServlet {
    private static UtilisateurService us;
    private static EtudiantService es;
    private static EntrepriseService ents;
    private static AnnonceService as;


    public IndexServlet() {
        super();
        us = new UtilisateurServiceImpl();
        es = new EtudiantServiceImpl();
        ents = new EntrepriseServiceImpl();
        as = new AnnonceServiceImpl();
    }


        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            System.out.println("doGETIndex");
            System.out.println(request.getSession().getAttribute("etudiant"));
            System.out.println(request.getSession().getAttribute("entreprise"));
            System.out.println("getattributeOK");
            //List<Annonce> annoncesEntUti = as.rechercherAnnonces();
            List<Entreprise> entreprises = ents.rechercherEntreprises();
            System.out.println(entreprises);
            request.getSession().setAttribute("entreprises",entreprises);
            request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
