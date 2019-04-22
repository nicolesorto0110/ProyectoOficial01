/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoyectoLae.logic;
import ProyectoLae.Objects.StoreObjetos;
import ProyectoLae.DatabaseX.DatabaseX;
import ProyectoLae.Objects.carritoObjeto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicole
 */
public class StoreServlet  extends Logic {
    

    
    
      public void borrarCarritoProducto(String id){
  
  DatabaseX database = getDatabase();
    
 String strSql = "DELETE FROM `store`.`carrito` WHERE (`idCarrito` = '"+id+"');";
       int iRows = database.executeNonQueryRows(strSql);
       System.out.println(strSql);
  
  }  
    



  public void updateCarritoProducto(String id,String canti){
  
  DatabaseX database = getDatabase();
    
 String strSql = "UPDATE `store`.`carrito` SET `cantidad` = '"+canti+"' WHERE (`idCarrito` = '"+id+"');";
       int iRows = database.executeNonQueryRows(strSql);
       System.out.println(strSql);
  
  }  
    
    


    
  public void agregarCarrito(String id,String precio){
  
  DatabaseX database = getDatabase();
    
 String strSql = "INSERT INTO `store`.`carrito` (`cantidad`, `precio`, `idProducto`) VALUES ('1', '"+precio+"', '"+id+"');";
       int iRows = database.executeNonQueryRows(strSql);
       
  
  }  
    
    
    
    //Aqui va el vector del carrito :)
    
    public ArrayList<carritoObjeto> getAllCarrito() 
    {
        //select * from travelsys.client;
          DatabaseX database = getDatabase();
        String strSql = "select * from store.carrito sc inner join store.producto sp where sc.idProducto=sp.id";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<carritoObjeto> CArray = null;
        
        if(CResult!=null)
        {
         int m_cantidad;
         String m_imagen;
         String m_nombreProducto;
         int m_id;
         float m_precio;
          carritoObjeto CTemp;
          CArray = new ArrayList<>();
           //   ArrayList<StoreObjetos> CArrayt = null;
            try 
            {
                while(CResult.next())
                {
                    m_id=CResult.getInt("idCarrito");
                    m_imagen = CResult.getString("Imagen");
                    m_nombreProducto = CResult.getString("NombreProducto");
                    m_cantidad = CResult.getInt("cantidad");
                    m_precio = CResult.getFloat("Precio");
                    m_imagen= CResult.getString("Imagen");
                    
    
    CTemp= new  carritoObjeto(m_imagen, m_nombreProducto, m_cantidad, m_precio, m_id);
                    
                    
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
  //aqui finaliza el vector del carrito
    
    
    
    
    
    public ArrayList<StoreObjetos> getAllStore() 
    {
        //select * from travelsys.client;
          DatabaseX database = getDatabase();
        String strSql = "SELECT * FROM store.producto;";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<StoreObjetos> CArray = null;
        
        if(CResult!=null)
        {
           
     String m_nombreProducto;
     String m_descripcion;
     int m_existencia;
     float m_precio;  
     String m_imagen;  
     int m_subCategoria;
          int m_id;  
            StoreObjetos CTemp;
          CArray = new ArrayList<>();
           //   ArrayList<StoreObjetos> CArrayt = null;
            try 
            {
                while(CResult.next())
                {
                    m_id=CResult.getInt("id");;
                    m_nombreProducto = CResult.getString("NombreProducto");
                    m_descripcion = CResult.getString("Descripcion");
                    m_existencia = CResult.getInt("existencia");
                    m_precio = CResult.getFloat("Precio");
                    m_imagen= CResult.getString("Imagen");
                    m_subCategoria= CResult.getInt("idSubcategoria");
                             
  CTemp = new StoreObjetos(m_nombreProducto, m_descripcion, m_existencia, m_precio, m_imagen, m_subCategoria,m_id);
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
    
    
    
    
    
      public ArrayList<StoreObjetos> busquedaCategoria(String variable) 
    {
        
        
        //select * from travelsys.client;
          DatabaseX database = getDatabase();
String strSql = "select * from store.producto sp inner join store.categoria sc where sp.idSubcategoria=sc.id and categoria ='"+variable+"'";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<StoreObjetos> CArray = null;
        
        if(CResult!=null)
        {
           
     String m_nombreProducto;
     String m_descripcion;
     int m_existencia;
     float m_precio;  
     String m_imagen;  
     int m_subCategoria;
          int m_id;  
            StoreObjetos CTemp;
          CArray = new ArrayList<>();
           //   ArrayList<StoreObjetos> CArrayt = null;
            try 
            {
                while(CResult.next())
                {
                    m_id=CResult.getInt("id");;
                    m_nombreProducto = CResult.getString("NombreProducto");
                    m_descripcion = CResult.getString("Descripcion");
                    m_existencia = CResult.getInt("existencia");
                    m_precio = CResult.getFloat("Precio");
                    m_imagen= CResult.getString("Imagen");
                    m_subCategoria= CResult.getInt("idSubcategoria");
                             
  CTemp = new StoreObjetos(m_nombreProducto, m_descripcion, m_existencia, m_precio, m_imagen, m_subCategoria,m_id);
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
      
      
      
      
      
      
      
      
   public ArrayList<StoreObjetos> busquedabarra(String variable) 
    {
        
        
        //select * from travelsys.client;
          DatabaseX database = getDatabase();
String strSql = "select * from store.producto sp inner join store.categoria sc where sp.idSubcategoria=sc.id and NombreProducto LIKE '%"+variable+"%'  ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<StoreObjetos> CArray = null;
        
        if(CResult!=null)
        {
           
     String m_nombreProducto;
     String m_descripcion;
     int m_existencia;
     float m_precio;  
     String m_imagen;  
     int m_subCategoria;
          int m_id;  
            StoreObjetos CTemp;
          CArray = new ArrayList<>();
           //   ArrayList<StoreObjetos> CArrayt = null;
            try 
            {
                while(CResult.next())
                {
                    m_id=CResult.getInt("id");;
                    m_nombreProducto = CResult.getString("NombreProducto");
                    m_descripcion = CResult.getString("Descripcion");
                    m_existencia = CResult.getInt("existencia");
                    m_precio = CResult.getFloat("Precio");
                    m_imagen= CResult.getString("Imagen");
                    m_subCategoria= CResult.getInt("idSubcategoria");
                             
  CTemp = new StoreObjetos(m_nombreProducto, m_descripcion, m_existencia, m_precio, m_imagen, m_subCategoria,m_id);
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
