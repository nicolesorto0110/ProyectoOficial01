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
        ResultSet Cresult = database.executeQuery("select * from proyectoprogra2oficial.usuario where usuario= '"+strUsername+"'and contrasena='"+strContrasena+"';");
        if(Cresult != null){
                try {
                    while(Cresult.next()){
                      
                        idd = Cresult.getString("usuario");
                       
                        System.out.println("si hay un usuario");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return idd;
    }
}
