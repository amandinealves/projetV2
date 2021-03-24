package fr.cesi.projetV2.servlet;

import fr.cesi.projetV2.business.Etudiant;
import fr.cesi.projetV2.business.Utilisateur;
import fr.cesi.projetV2.service.EtudiantService;
import fr.cesi.projetV2.service.StatutService;
import fr.cesi.projetV2.service.UploadService;
import fr.cesi.projetV2.service.impl.StatutServiceImpl;
import fr.cesi.projetV2.service.impl.UploadServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

@WebServlet(name = "InscriptionEtudiantServlet", value = "/InscriptionEtudiantServlet")
public class InscriptionEtudiantServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private static StatutService ss;
    private static EtudiantService es;
    private static UploadService ups;

    public InscriptionEtudiantServlet() {
        ss = new StatutServiceImpl();
        ups = new UploadServiceImpl();

    }

//    private String getFileName(final Part part) {
//        final String partHeader = part.getHeader("content-disposition");
//       for (String content : part.getHeader("content-disposition").split(";")) {
//            if (content.trim().startsWith("filename")) {
//                return content.substring(
//                        content.indexOf('=') + 1).trim().replace("\"", "");
//            }
//        }
//        return null;
//    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
        if (request.getSession().getAttribute("utilisateur") == null) {
            request.setAttribute("error", "Erreur lors de l'inscription!");
            response.sendRedirect("InscriptionServlet");
        } else {
            request.setAttribute("statuts", ss.recupererStatuts());
            request.getRequestDispatcher("inscriptionEtudiant.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("NOM");
        String prenom = request.getParameter("PRENOM");
        String htmlDate = request.getParameter("DATE_NAISSANCE");
        Date dateNaissance = Date.valueOf(htmlDate);
        String ecole = request.getParameter("ECOLE");
        String diplome = request.getParameter("DIPLOME");
        String idStatut = request.getParameter("STATUT");
       // Long idStatut = Long.getLong(htmlStatut);
        String idUtilisateur = request.getParameter("ID_UTILISATEUR");
        //Long idUtilisateur = Long.getLong(htmlUti);

        Object test = request.getSession().getAttribute("utilisateur");

        System.out.println(nom +" "+ prenom +" "+ dateNaissance +" "+ ecole +" "+ diplome + "   " + idStatut + "  " + idUtilisateur + " " + test);

        //es.ajouterEtudiant(nom,prenom,dateNaissance,ecole,diplome,Long.parseLong(idStatut),Long.parseLong(idUtilisateur));

    }
}
