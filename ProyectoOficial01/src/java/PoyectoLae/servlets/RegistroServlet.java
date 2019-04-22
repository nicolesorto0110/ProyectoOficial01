package PoyectoLae.servlets;

import PoyectoLae.logic.RegistroLogic;
import ProyectoLae.DatabaseX.DatabaseX;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/RegistroServlet"})
public class RegistroServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String strNombres = request.getParameter("nombres");
            String strApellidos = request.getParameter("apellidos");
            String strEmail = request.getParameter("email");
            String strGenero = request.getParameter("genero");
            String strDias = request.getParameter("dias");
            String strMes = request.getParameter("mes");
            String strAno = request.getParameter("ano");
            String strContrasena = request.getParameter("contrasena");
            String strConfirm = request.getParameter("confirm");
            String strUsername = request.getParameter("username");
            String strTelefono = request.getParameter("telefono");
            String strDireccionFisica = request.getParameter("direccionfisica");
            String strCiudad = request.getParameter("ciudad");
            String strDepartamento = request.getParameter("departamento");
            
      
            String strFechaNacimiento = "2018-12-1";//strAno+"-"+strMes+"-"+strDias;
            
            RegistroLogic logic = new RegistroLogic();
            int iRows = logic.insertNuevoRegistro(strUsername, strContrasena, strEmail);
            
            int idd=logic.consultaIdUsername(strEmail);
            int iRows2 = logic.insertNuevoRegistro2(idd, strNombres, strApellidos, strTelefono, strDireccionFisica, strCiudad, strDepartamento, strGenero, strFechaNacimiento);
                            
       request.getSession().setAttribute("user", strEmail);
              response.sendRedirect("index.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
