package PoyectoLae.servlets;

import PoyectoLae.logic.StoreServlet;
import ProyectoLae.Objects.StoreObjetos;
import ProyectoLae.Objects.carritoObjeto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CheckoutServlet", urlPatterns = {"/CheckoutServlet"})
public class CheckoutServlet extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            
            
            
            
            
//int idd=logic.consultaIdUsername(strEmail);
//int iRows2 = logic.insertNuevoRegistro2(idd, strNombres, strApellidos, strTelefono, strDireccionFisica, strCiudad, strDepartamento, strGenero, strFechaNacimiento);
                    
              StoreServlet CLogic = new StoreServlet();
      ArrayList<StoreObjetos> CArray =CLogic.getAllStore();
                  request.getSession().setAttribute("productos", CArray);
                                    // ArrayList<StoreObjetos> CArray =CLogic.getAllStore();
                    ArrayList<carritoObjeto> carrito =CLogic.getAllCarrito();
                  request.getSession().setAttribute("carritoo", carrito);
                  
                  
                  
                  
                  
            response.sendRedirect("checkout.jsp");//redireccion
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
