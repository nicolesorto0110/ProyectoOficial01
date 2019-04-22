package PoyectoLae.logic;

import PoyectoLae.servlets.InicioServlet;
import ProyectoLae.DatabaseX.DatabaseX;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InicioLogic extends Logic 
{
    public String inicioSesion(String strUsername, String strContrasena){
       String idd = "";
        DatabaseX database = getDatabase();
        ResultSet Cresult = database.executeQuery("select * from store.usuario where correo= '"+strUsername+"'and contrasena='"+strContrasena+"';");
        if(Cresult != null){
                try {
                    while(Cresult.next()){
                      
                        idd = Cresult.getString("id");
                       
                        System.out.println("si hay un usuario");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return idd;
    }
    
    
    
    
        public String obtenerNombre(String id){
       String idd = "";
        DatabaseX database = getDatabase();
        ResultSet Cresult = database.executeQuery("SELECT * FROM store.infousuario where idUsuario='"+id+"';");
        if(Cresult != null){
                try {
                    while(Cresult.next()){
                      
                        idd = Cresult.getString("Nombres");
                      
                       // System.out.println("si hay un usuario");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return idd;
    }
        
               public String obtenerApellido(String id){
       String idd = "";
        DatabaseX database = getDatabase();
        ResultSet Cresult = database.executeQuery("SELECT * FROM store.infousuario where idUsuario='"+id+"';");
        if(Cresult != null){
                try {
                    while(Cresult.next()){
                      
                        idd = Cresult.getString("Apellidos");
                      
                       // System.out.println("si hay un usuario");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return idd;
    }
               
               
                              public String obtenerDireccion(String id){
       String idd = "";
        DatabaseX database = getDatabase();
        ResultSet Cresult = database.executeQuery("SELECT * FROM store.infousuario where idUsuario='"+id+"';");
        if(Cresult != null){
                try {
                    while(Cresult.next()){
                      
                        idd = Cresult.getString("DireccionFisica");
                      
                       // System.out.println("si hay un usuario");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return idd;
    }
                              
                              
       public String obtenerEmail(String id){
       String idd = "";
        DatabaseX database = getDatabase();
        ResultSet Cresult = database.executeQuery("SELECT * FROM store.usuario where id='"+id+"';");
        if(Cresult != null){
                try {
                    while(Cresult.next()){
                      
                        idd = Cresult.getString("correo");
                      
                       // System.out.println("si hay un usuario");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return idd;
    }
              public String obtenerCiudad(String id){
       String idd = "";
        DatabaseX database = getDatabase();
        ResultSet Cresult = database.executeQuery("SELECT * FROM store.infousuario where idUsuario='"+id+"';");
        if(Cresult != null){
                try {
                    while(Cresult.next()){
                      
                        idd = Cresult.getString("Ciudad");
                      
                       // System.out.println("si hay un usuario");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return idd;
    }
       
              public String obtenerDepto(String id){
       String idd = "";
        DatabaseX database = getDatabase();
        ResultSet Cresult = database.executeQuery("SELECT * FROM store.infousuario where idUsuario='"+id+"';");
        if(Cresult != null){
                try {
                    while(Cresult.next()){
                      
                        idd = Cresult.getString("Departamento");
                      
                       // System.out.println("si hay un usuario");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return idd;
    }
       
       
             
}
