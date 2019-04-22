package PoyectoLae.logic;

import PoyectoLae.servlets.InicioServlet;
import ProyectoLae.DatabaseX.DatabaseX;
import ProyectoLae.Objects.carritoObjeto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckoutLogic extends Logic 
{
    
  //  public String ConsultaNuevoCheckout ();
        public carritoObjeto inicioSesion(String strUsername, String strContrasena){
       String idd = "";
             String  precio= "";
             String  descripcion= "";
             String  cantidad= "";
             
           
              carritoObjeto carro = null;
        DatabaseX database = getDatabase();
        ResultSet Cresult = database.executeQuery("SELECT * FROM store.carrito;");
        if(Cresult != null){
                try {
                    while(Cresult.next()){
                           idd = Cresult.getString("imagen");
                         descripcion = Cresult.getString("descripcion");
                           cantidad = Cresult.getString("cantidad");
                             precio = Cresult.getString("precio");
                             
                             
                      
                   //    carro= new carritoObjeto(precio, descripcion, 0);
                     
                       
                        System.out.println("si hay un usuario");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return carro;
    }
        
        
        
    
}
