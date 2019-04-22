/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoyectoLae.logic;

import PoyectoLae.servlets.InicioServlet;
import ProyectoLae.DatabaseX.DatabaseX;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicole
 */
public class FinalLogic  extends Logic {
    
    
    //

    public int insertNuevoRegistro(int cantidad, float precio, String idUsuario, int idProducto){
        
       DatabaseX database = getDatabase();
    
       
    float   totalOrder=cantidad*precio;
 
   
       
       String strSql = "INSERT INTO `store`.`orderinfo` (`totalOrder`, `idUsuario`, `Fecha`, `cantidadOrder`, `idProducto`) VALUES ('"+totalOrder+"', '"+idUsuario+"', '2019-12-12', '"+cantidad+"', '"+idProducto+"');";
       int iRows = database.executeNonQueryRows(strSql);
       return iRows;
    }
    
    
    
        public void borrarTodo(){
        
       DatabaseX database = getDatabase();
    
       
 
   
       
       String strSql = "DELETE FROM `store`.`carrito` WHERE (`idCarrito` < '2899999');";
       int iRows = database.executeNonQueryRows(strSql);
  
    }
    
}
