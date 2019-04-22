<%-- 
    Document   : store
    Created on : 03-22-2019, 09:57:15 AM
    Author     : Nicole
--%>

<%@page import="ProyectoLae.Objects.carritoObjeto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@page import="java.util.Iterator"%>
 
 <%@page import="ProyectoLae.Objects.StoreObjetos"%>
<%@page import="java.util.ArrayList"%>






<!DOCTYPE html>
<html>
    <head>
        <title>Tienda LAE</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">   
        <script src="Scripts/jquery-3.3.1.js" type="text/javascript"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" 
              
              integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
        <link href="Style/IndexStyleCss.css?v=12" rel="stylesheet" type="text/css"/>
        <script src="Scripts/scriptglobal.js?v=80" type="text/javascript"></script>
        
             <script type="text/javascript">
      
      
             <%
        ArrayList<carritoObjeto> CArray = 
                (ArrayList<carritoObjeto>)request.getSession().getAttribute("carritoo");
        
        
        if(CArray!=null){
        
        Iterator<carritoObjeto> iteArray = CArray.iterator();
        




 if(iteArray!=null)
            {
                //inicializo los vectores para agregarlos
           %>
  var checkoutDescription = [];
var checkoutPrecio = [];
 
var checkoutCantidades = [];  
var ids = [];                
               <%
                
                
                
                
                
                carritoObjeto CTemp;
                while(iteArray.hasNext())
                {
                    CTemp = iteArray.next();
                    

                   %>
                        checkoutPrecio.push('<%= CTemp.getM_precio() %>'); //push sirve para agregar info al array
                        
                       checkoutDescription.push('<%= CTemp.getM_nombreProducto()%>');
                      
                       checkoutCantidades.push('<%= CTemp.getM_cantidad() %>');
                       ids.push('<%= CTemp.getId()%>');
                       <%
                    
                }
                
            }else{
 
 
 
 

    %> 
var checkoutDescription = ["Unos Alexanderes de peluche par llevar", "Suvenirs de chuchitos", "Cuadros de la osa babu!"];
var checkoutPrecio = ["23.56", "12.50", "30"];
var checkoutCantidades = [2, 3, 5]; 
var ids = [1, 2, 3]; 
 
      
                 <%
                }     
                     
                     
}  else{

%>
var checkoutDescription = [];
var checkoutPrecio = [];
var checkoutCantidades = [];    
    <%

} 
              // int iRows = (int)request.getSession().getAttribute("rows");       
//if(){



//}


                   %>  
                     
                     
             
             
             
             </script>
        
        
        
        
        
    </head>
    <body onload="carritoCore();">
        
        
        <div id="carrito" name="carrito" style="    background-color: #ffffff5e;
    z-index: 999;
    display:none;
    /* margin-top: 189px; */
    height: 100%;
    position: fixed;
    width: 100%;">
            <div style="width: 600px;
    margin: 0 auto;">
                <i onclick="cerrarCarrito();" style="padding-top: 63px;
    margin-left: 600px;
    position: absolute;
    margin-top: -93px;
    font-size: 33px;" class="far fa-times-circle"></i>
            
         
    <div id="cuerpoCheckout"></div>
            <!-- columna de detalles-->
<!-- aqui v la onda esa si la bonita-->
       



<!--fin de la onda esta--></td>
</tr>
</tbody>
</table>
            </div>
<!--fin de la onda esta-->

        </div>   
        
        <table class="tablahome" border="0" >
            <tbody>
                <tr>
                <td colspan="4" class="azultabla">
                <!-- inicio del banner-->    
                <table class="logotable" >
                    <tbody>
                        <tr>
                        <td> <a href="index.jsp"> <img class="imagenBanner" src="/ProyectoOficial01/imagenes/inicio.png">
                        
                            </a>
                        
                        
                           
                        </td>
                        </tr>
                    </tbody>
                </table>
                <% 
String nombreUsr = (String)request.getSession().getAttribute("nombreUsr");    
                if(nombreUsr!=null){
                
                
                
                %>
                <div style="    position: absolute;
    margin-left: 30px;
    margin-top: -126px;
    color: white;
    font-size: 25px;">Hola <%=nombreUsr%>!</div>
    
    <%
    }
    %>
                <div style="    float: right;
    margin-bottom: 10px;
    margin-right: 10px;
    margin-top: -28px;
    width: 184px;">
                    <i onclick="carritoOpen();" style="color: white;
    
    position: absolute;
    font-size: 25px;<%
    
       String iRows = (String)request.getSession().getAttribute("user");
    %>
    margin-top: 9px;
    margin-right: 13px;" class="fas fa-shopping-cart"></i> <a style="   float: right;" href="InicioSesion.html" class="myButtonn">Iniciar Sesión </a>
                </div>
                
                
                  
                  
                <!--Fin del banner-->
                </td>
                </tr>

                <tr>
                <td>
                <div id="header">
                    <ul class="nav">

                     <li><a href="">Menú</a>
                      <ul>
                       <li><a href="">Tecnología</a>
                            <ul>
                               <li><a href="storeServlet?producto=computadoras&strFormId=0">Computadores</a></li>
                               <li><a href="storeServlet?producto=tablets">Tablets</a></li>
                               <li><a href="storeServlet?producto=telefonos">Telefonos</a></li>
                               <li><a href="storeServlet?producto=accesorios">Accesorios</a></li>
                            </ul>
                        </li>
                       <li><a href="storeServlet?producto=ropa">Ropa</a>
                            <ul>
                               <li><a href="storeServlet?producto=damas">Damas</a>
                                    <ul>
                                        <li><a href="storeServlet?producto=blusas">Blusas</a></li>
                                        <li><a href="storeServlet?producto=faldas">Faldas</a></li>
                                        <li><a href="storeServlet?producto=pantalones">Pantalones</a></li>
                                    </ul>
                               </li>
                               <li><a href="storeServlet?producto=caballeros">Caballeros</a>
                                    <ul>
                                        <li><a href="storeServlet?producto=camisas">Camisas</a></li>
                                        <li><a href="storeServlet?producto=shorts">Shorts</a></li>
                                        <li><a href="storeServlet?producto=pantalones">Pantalones</a></li>
                                    </ul>
                               </li>
                               <li><a href="storeServlet?producto=jovenes">Jóvenes</a>
                                    <ul>
                                        <li><a href="storeServlet?producto=camisas">Camisas</a></li>
                                        <li><a href="storeServlet?producto=blusas">Blusas</a></li>
                                        <li><a href="storeServlet?producto=shorts">Shorts</a></li>
                                        <li><a href="storeServlet?producto=pantalones">Pantalones</a></li>
                                    </ul>
                               </li>
                               <li><a href="storeServlet?producto=ninos">Niños</a></li>
                            </ul>
                       </li>
                       <li><a href="storeServlet?producto=libros">Libros</a>
                            <ul>
                               <li><a href="storeServlet?producto=ficcion">Ficción</a></li>
                               <li><a href="storeServlet?producto=juvenil">Juvenil</a></li>
                               <li><a href="storeServlet?producto=adultos">Adultos</a></li>
                               <li><a href="storeServlet?producto=ninos">Niños</a></li>
                            </ul>
                       </li>
                        <li><a href="storeServlet?producto=hogar">Hogar</a>
                            <ul>
                               <li><a href="storeServlet?producto=sala">Sala</a></li>
                               <li><a href="storeServlet?producto=cocina">Cocina</a></li>
                               <li><a href="storeServlet?producto=dormitorio">Dormitorio</a></li>
                               <li><a href="storeServlet?producto=jardin">Jardín</a></li>
                            </ul>
                        </li>
                      </ul>
                     </li>

                     <li><a href="storeServlet">Toda la tienda</a></li>
                      <li><a href="storeServlet">Contactanos</a></li>
                    </ul>
                </div>
                
                    </td>
                
                <td colspan="3">
                    
                    
                    <form  action="storeServlet" method="get">
                    
                    <input style="    float: right;
    height: 39px;
    width: 61px;
    margin-right: 23px; " type="submit" name="busqueda"value="Buscar">
                    <div style="width: 82%;">
                    <i class="fas fa-search iconobuscador"></i>
                    <input style="    width: 100%;
    padding-left: 46px;    height: 35px;"  type="text" class="form-control buscardorHome" name="producto" id="producto" >
                    
                    <input  type="hidden" class="formid" name="formid" id="formid" value="123456" >
                    
                   
                    </div>
                    </form>
                </td>
                </tr>
                
                
                
                
                <tr>
                    
                  
                    
                    <td colspan="3">
                        
                       <!-- Fin del Header-->   
                        
                        
                        
                        
                        
                   