package PoyectoLae.logic;

import PoyectoLae.servlets.InicioServlet;
import ProyectoLae.DatabaseX.DatabaseX;
import ProyectoLae.Objects.RegistroObject;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroLogic extends Logic 
{
    public int insertNuevoRegistro(String strUsername, String strContrasena, String strEmail){
        
       DatabaseX database = getDatabase();
    
       String strSql = "INSERT INTO store.usuario (id, usuario, contrasena, correo)VALUES(0,'"+strUsername+"','"+strContrasena+"', '"+strEmail+"');";
       int iRows = database.executeNonQueryRows(strSql);
       return iRows;
    }
    public int insertNuevoRegistro2(int idUsername, String strNombres, String strApellidos, String strTelefono, String strDireccionFisica, String strCiudad, String strDepartamento, String strGenero, String strFechaNacimiento){
       
       DatabaseX database2 = getDatabase();
        
       String strSql2 = "INSERT INTO store.infousuario(id,idUsuario,Nombres,Apellidos,Telefono,DireccionFisica,Ciudad,Departamento,Genero,FechaNacimiento)VALUES(0,"+idUsername+",'"+strNombres+"','"+strApellidos+"','"+strTelefono+"','"+strDireccionFisica+"','"+strCiudad+"','"+strDepartamento+"','"+strGenero+"','"+strFechaNacimiento+"');";
       int iRows2 = database2.executeNonQueryRows(strSql2);
       return iRows2;
    }
    
    
    public int consultaIdUsername (String correo){
    int idd=0;
      DatabaseX database = new DatabaseX();
           ResultSet Cresult = database.executeQuery("select * from store.usuario where correo= '"+correo+"';");
            
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
    
    
    
    
    public ArrayList<RegistroObject> getAllInfoUser(String id) 
    {
        
        
        //select * from travelsys.client;
          DatabaseX database = getDatabase();
String strSql = "SELECT * FROM store.usuario su inner join store.infousuario si where su.id=si.idUsuario and su.id='"+id+"';";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<RegistroObject> CArray = null;
        
        if(CResult!=null)
        {
           
       String m_strNombre;
     String m_strApellido;
     String m_strEmail;
     String m_strGenero;

     String m_strContrasena;
     String m_strConfirm;
     
     
     
              String direccion;
     String ciudad;
        String departamento;
     
            RegistroObject CTemp;
          CArray = new ArrayList<>();
           //   ArrayList<StoreObjetos> CArrayt = null;
            try 
            {
                while(CResult.next())
                {
              
                    m_strNombre = CResult.getString("Nombres");
                    m_strApellido = CResult.getString("Apellidos");
                    m_strGenero = CResult.getString("Genero");
                    m_strEmail= CResult.getString("correo");
                    m_strContrasena = CResult.getString("contrasena");
                    direccion= CResult.getString("direccion");
                    ciudad= CResult.getString("ciudad");
                        departamento= CResult.getString("departamento");
                             
  CTemp = new RegistroObject(m_strNombre, m_strApellido, m_strEmail, m_strGenero, 0, 0, 0, m_strContrasena, "", direccion, ciudad, departamento);
        CArray.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
           //     Logger.getLogger(ClientLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CArray;
        
    }   
    
    
    
}
