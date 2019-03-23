<%-- 
    Document   : store
    Created on : 03-22-2019, 09:57:15 AM
    Author     : Nicole
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tienda LAE</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">    
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" 
              integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
        <link href="Style/IndexStyleCss.css?v=4" rel="stylesheet" type="text/css"/>
        <script src="Scripts/scriptglobal.js?v=46" type="text/javascript"></script>
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
                        <td> <img class="imagenBanner" src="/ProyectoOficial01/imagenes/inicio.png">
                        
                        
                        
                        
                       
                        </td>
                        </tr>
                    </tbody>
                </table>
                
                
                <div style="    float: right;
    margin-bottom: 10px;
    margin-right: 10px;
    margin-top: -28px;
    width: 184px;">
                    <i onclick="carritoOpen();" style="color: white;
    
    position: absolute;
    font-size: 25px;
    margin-top: 9px;
    margin-right: 13px;" class="fas fa-shopping-cart"></i> <a style="   float: right;" href="InicioSesion.html" class="myButtonn">Iniciar Sesión</a>
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
                               <li><a href="/ProyectoOficial01/store?producto=computadoras">Computadores</a></li>
                               <li><a href="">Tablets</a></li>
                               <li><a href="">Telefonos</a></li>
                               <li><a href="">Accesorios</a></li>
                            </ul>
                        </li>
                       <li><a href="">Ropa</a>
                            <ul>
                               <li><a href="">Damas</a>
                                    <ul>
                                        <li><a href="">Blusas</a></li>
                                        <li><a href="">Faldas</a></li>
                                        <li><a href="">Pantalones</a></li>
                                    </ul>
                               </li>
                               <li><a href="">Caballeros</a>
                                    <ul>
                                        <li><a href="">Camisas</a></li>
                                        <li><a href="">Shorts</a></li>
                                        <li><a href="">Pantalones</a></li>
                                    </ul>
                               </li>
                               <li><a href="">Jóvenes</a>
                                    <ul>
                                        <li><a href="">Camisas</a></li>
                                        <li><a href="">Blusas</a></li>
                                        <li><a href="">Shorts</a></li>
                                        <li><a href="">Pantalones</a></li>
                                    </ul>
                               </li>
                               <li><a href="">Niños</a></li>
                            </ul>
                       </li>
                       <li><a href="">Libros</a>
                            <ul>
                               <li><a href="">Ficción</a></li>
                               <li><a href="">Juvenil</a></li>
                               <li><a href="">Adultos</a></li>
                               <li><a href="">Niños</a></li>
                            </ul>
                       </li>
                        <li><a href="">Hogar</a>
                            <ul>
                               <li><a href="">Sala</a></li>
                               <li><a href="">Cocina</a></li>
                               <li><a href="">Dormitorio</a></li>
                               <li><a href="">Jardín</a></li>
                            </ul>
                        </li>
                      </ul>
                     </li>


                    </ul>
                </div>
                
                    </td>
                
                <td colspan="3">
                    <div style="width: 100%;">
                    <i class="fas fa-search iconobuscador"></i>
                    <input  type="email" class="form-control buscardorHome" id="exampleInputEmail22" ></div>
                </td>
                </tr>
                
                
                
                
                <tr>
                    
                  
                    
                    <td colspan="3">
                        
                       <!-- Fin del Header-->   
                        
                        
                        
                        
                        
                   