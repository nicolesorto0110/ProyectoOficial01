
package PoyectoLae.servlets;

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
 


@WebServlet(urlPatterns = {"/InicioServlet"})
public class InicioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            String strUsuario = request.getParameter("usuario");
            String strContra = request.getParameter("contrasena");
            int flag1=0;
            DatabaseX database = new DatabaseX();
           ResultSet Cresult = database.executeQuery("select * from proyectoprogra2oficial.usuario where usuario= '"+strUsuario+"'and contrasena='"+strContra+"';");
            

           String strUsername = "";
           String strContrasena = "";

            if(Cresult != null){
                try {
                    while(Cresult.next()){
                        flag1++;
                        strUsername = Cresult.getString("usuario");
                        strContrasena = Cresult.getString("contrasena");
                          System.out.println("kkkkkkkkkkkkkkkkkkk");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            System.out.println(strContrasena);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InicioServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InicioServlet at " + request.getContextPath() + "</h1>");
            out.println("<h1>usuario es: " + strUsername + "</h1>");
            out.println("<h1>contraseña es: " + strContrasena + "</h1><br><br>");
            
            if(flag1>0){
             out.println("<h1>Ahuevos chamaco entraste :)</h1>");
            }
            
            out.println("</body>");
            out.println("</html>");
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
