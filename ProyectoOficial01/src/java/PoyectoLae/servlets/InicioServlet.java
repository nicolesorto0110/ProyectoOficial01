
package PoyectoLae.servlets;

import PoyectoLae.logic.InicioLogic;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 


@WebServlet(urlPatterns = {"/InicioServlet"})
public class InicioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String strUsername = request.getParameter("usuario");
            String strContrasena = request.getParameter("contrasena");
            
            InicioLogic logic = new InicioLogic();
            String iddLogu = logic.inicioSesion(strUsername, strContrasena);
       
       
       if(iddLogu == null||iddLogu == ""){
  

                 //  request.getSession().setAttribute("user", strUsername);
              response.sendRedirect("NuevoRegistro.html"); 
       
       }else{ 
           
           
 
         
           
           
       String nombre = logic.obtenerNombre(iddLogu);
       String apellidoUser = logic.obtenerApellido(iddLogu);
        String emailUser = logic.obtenerEmail(iddLogu);
         String direccionUser = logic.obtenerDireccion(iddLogu);
          String ciudadUser = logic.obtenerCiudad(iddLogu);
           String departamentoUser = logic.obtenerDepto(iddLogu);
       
        request.getSession().setAttribute("nombreUsr", nombre);
        
                request.getSession().setAttribute("direccionUser", direccionUser);
                        request.getSession().setAttribute("apellidoUser", apellidoUser);
                                request.getSession().setAttribute("emailUser", emailUser);
                                        request.getSession().setAttribute("ciudadUser", ciudadUser);
                                                request.getSession().setAttribute("departamentoUser", departamentoUser);
                        
                             request.getSession().setAttribute("user", iddLogu);
              response.sendRedirect("index.jsp");
       
       
       
       }
            
     
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
