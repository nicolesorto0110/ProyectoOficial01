package PoyectoLae.logic;

import PoyectoLae.servlets.InicioServlet;
import ProyectoLae.DatabaseX.DatabaseX;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroLogic extends Logic 
{
    public int insertNuevoRegistro(String strUsername, String strContrasena, String strEmail){
        
       DatabaseX database = getDatabase();
    
       String strSql = "INSERT INTO proyectoprogra2oficial.usuario (id, usuario, contrasena, correo)VALUES(0,'"+strUsername+"','"+strContrasena+"', '"+strEmail+"');";
       int iRows = database.executeNonQueryRows(strSql);
       return iRows;
    }
    public int insertNuevoRegistro2(int idUsername, String strNombres, String strApellidos, String strTelefono, String strDireccionFisica, String strCiudad, String strDepartamento, String strGenero, String strFechaNacimiento){
       
       DatabaseX database2 = getDatabase();
        
       String strSql2 = "INSERT INTO proyectoprogra2oficial.infousuario(id,idUsuario,Nombres,Apellidos,Telefono,DireccionFisica,Ciudad,Departamento,Genero,FechaNacimiento)VALUES(0,"+idUsername+",'"+strNombres+"','"+strApellidos+"','"+strTelefono+"','"+strDireccionFisica+"','"+strCiudad+"','"+strDepartamento+"','"+strGenero+"','"+strFechaNacimiento+"');";
       int iRows2 = database2.executeNonQueryRows(strSql2);
       return iRows2;
    }
    
    
    public int consultaIdUsername (String correo){
    int idd=0;
      DatabaseX database = new DatabaseX();
           ResultSet Cresult = database.executeQuery("select * from proyectoprogra2oficial.usuario where correo= '"+correo+"';");
            
      if(Cresult != null){
                try {
                    while(Cresult.next()){
                      
                        idd = Cresult.getInt("id");
                        
                          System.out.println("si hay un usuario");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(InicioServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    return idd;
    }
}
