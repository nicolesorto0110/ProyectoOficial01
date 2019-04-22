/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Nicole
 */
@WebServlet(name = "storeServlet", urlPatterns = {"/storeServlet"})
public class storeServlet extends HttpServlet {

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
           
            //1 o null es para toda busqueda
            //2 es para producto especifico
            //3es para busqueda de barra
            
            
            
            String strFormId = request.getParameter("formid");
            String idproducto=request.getParameter("producto");
            String add=request.getParameter("add");
             String prrecio=request.getParameter("prrecio");
             
             
       
             
             
             
             
             
            
          if(add!=null&&prrecio!=null){
          
           StoreServlet CLogic = new StoreServlet();
                CLogic.agregarCarrito(add, prrecio);
                System.out.println("Agreganduuu");
                
                
                /*Agregare esto para que se muestre algo en la tienda*/
                
              
                ArrayList<StoreObjetos> CArray =CLogic.getAllStore();
                  request.getSession().setAttribute("productos", CArray);
                                    // ArrayList<StoreObjetos> CArray =CLogic.getAllStore();
                    ArrayList<carritoObjeto> carrito =CLogic.getAllCarrito();
                  request.getSession().setAttribute("carritoo", carrito);
              response.sendRedirect("store.jsp");
             
          }else{   
            
            
            
               if(idproducto==null&&strFormId==null){
                   
            StoreServlet CLogic = new StoreServlet();
                ArrayList<StoreObjetos> CArray =CLogic.getAllStore();
                  request.getSession().setAttribute("productos", CArray);
                                    // ArrayList<StoreObjetos> CArray =CLogic.getAllStore();
                    ArrayList<carritoObjeto> carrito =CLogic.getAllCarrito();
                  request.getSession().setAttribute("carritoo", carrito);
              response.sendRedirect("store.jsp");
              }else{
                   
                   
                   if(strFormId==null){
                     StoreServlet CLogic = new StoreServlet();
                   ArrayList<StoreObjetos> CArray =CLogic.busquedaCategoria(idproducto);
                  request.getSession().setAttribute("productos", CArray);
                                    // ArrayList<StoreObjetos> CArray =CLogic.getAllStore();
                    ArrayList<carritoObjeto> carrito =CLogic.getAllCarrito();
                  request.getSession().setAttribute("carritoo", carrito);
                response.sendRedirect("store.jsp");
                   }else{
                       
                       StoreServlet CLogic = new StoreServlet();
                   ArrayList<StoreObjetos> CArray =CLogic.busquedabarra(idproducto);
                  request.getSession().setAttribute("productos", CArray);
                                    // ArrayList<StoreObjetos> CArray =CLogic.getAllStore();
                    ArrayList<carritoObjeto> carrito =CLogic.getAllCarrito();
                  request.getSession().setAttribute("carritoo", carrito);
                response.sendRedirect("store.jsp");
                   
                   
                   }
               }
            
            }//fin del add
            
            
            
            
            
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
