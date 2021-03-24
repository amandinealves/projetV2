package fr.cesi.projetV2.servlet;

import fr.cesi.projetV2.service.AnnonceService;
import fr.cesi.projetV2.service.impl.AnnonceServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AnnonceServlet", value = "/AnnonceServlet")
public class AnnonceServlet extends HttpServlet {
    private AnnonceService as;

    public AnnonceServlet(){
        as = new AnnonceServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("annonce.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String objet = request.getParameter("OBJET");
        String lettreMotivation = request.getParameter("LETTRE_MOTIVATION");

        //as.ajouterAnnonce(objet,lettreMotivation);

        HttpSession	session = request.getSession();


    }
}
