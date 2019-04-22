<%-- 
    Document   : facturacion
    Created on : 04-22-2019, 05:07:48 AM
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
    <head>  <script src="Scripts/jquery-3.3.1.js" type="text/javascript"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" 
             <link href="Style/IndexStyleCss.css?v=11" rel="stylesheet" type="text/css"/>
        <script src="Scripts/scriptglobal.js?v=77" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                        checkoutPrecio.push('<%= CTemp.getM_precio() %>');
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
        <title>JSP Page</title>
    </head>
    <body onload=" window.print();">
        <script type="text/javascript">
             
             
             
             $(document).ready(function()
{
    
    var cuerpo="";
 var cantidad=checkoutDescription.length;
 
 cuerpo += "<table style='background-color: #f6f7f9;width: 600px;margin: 0 auto;margin-top: 63px;' border '1' ><tbody><tr><td colspan='4'><div align='center'><img style=''    height: 113px;' class='imagenBanner' src='/ProyectoOficial01/imagenes/detalle_2.png'></div></td></tr>";
 for(i=0;i<cantidad;i++){
     
     
 cuerpo += "<tr><td><p>"+checkoutCantidades[i]+"</p></td><td  colspan='2'><p>"+checkoutDescription[i]+"</p></td><td><p  >$"+calculoItem(i)+"</p></td></tr>";
     
     
     
    // alert(cuerpo);
     
 }<%  String iRows2 = (String)request.getSession().getAttribute("user");%>
 cuerpo+="<tr><td>&nbsp;</td><td colspan='2'><p   style='      font-size: 22px;  float: right;'><strong>Total:</strong></p></td><td><p >$"+totaleCarrito()+"</p></td></tr><tr><td colspan='4' style='text-align: center;'>Gracias por su compra!</td></tr></tbody></table>";
 document.getElementById("jeje").innerHTML = cuerpo;
   //alert(checkoutDescription);
});
         </script>
          <div id="jeje"></div>
    </body>
</html>
