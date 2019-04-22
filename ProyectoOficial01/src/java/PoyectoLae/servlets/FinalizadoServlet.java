/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoyectoLae.servlets;

import PoyectoLae.logic.FinalLogic;
import PoyectoLae.logic.StoreServlet;
import ProyectoLae.Objects.StoreObjetos;
import ProyectoLae.Objects.carritoObjeto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nicole
 */
@WebServlet(name = "Finalizado", urlPatterns = {"/Finalizado"})
public class FinalizadoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            FinalLogic CLogic = new FinalLogic();
            
             StoreServlet CLogico = new StoreServlet();
              ArrayList<carritoObjeto> carrito =CLogico.getAllCarrito();
       
        
              
             String idUsser = (String)request.getSession().getAttribute("user");  
                   //   ArrayList<StoreObjetos> CArray = 
             //   (ArrayList<StoreObjetos>)request.getSession().getAttribute("productos");
             Iterator<carritoObjeto> iteArray = carrito.iterator();
      
              
               carritoObjeto CTemp;
                while(iteArray.hasNext())
                {
                    CTemp = iteArray.next();
CLogic.insertNuevoRegistro(CTemp.getM_cantidad(), CTemp.getM_precio(),idUsser , CTemp.getId());   
                    
                }
                CLogic.borrarTodo();
                 response.sendRedirect("compra_completada.jsp");
                
                   // CLogic.insertNuevoRegistro(cantidad, precio, idUsuario, id);
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
