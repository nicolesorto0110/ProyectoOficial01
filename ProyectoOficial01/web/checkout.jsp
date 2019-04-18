<%-- 
    Document   : checkout
    Created on : 03-22-2019, 10:17:21 AM
    Author     : Nicole
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<jsp:include page="header.jsp" /> 



<table>
<tbody>
<tr>
    <td<!-- columna de checkout-->
        
        
        
        
   <table style="    width: 100%;
">
<tbody>
<tr>
    <td>
     <form id="registrar" name="registrar" method="get" action="RegistroServlet">
    <table style="margin:0 auto; padding-top: 49px;">
        <tbody>
            <tr>
                <td colspan="2"> 

                    <div align="center">
                    <img style="  width: 415px;  height: 113px;" class="imagenBanner" src="/ProyectoOficial01/imagenes/informacion_1.png">
                    </div>
                    </td>


            </tr>
<tr>
      <td><label>Nombres:</label> <br>
          <input   type="text" id="nombres" name="nombres"/>
      </td>
      <td> <label>Apellidos:</label> <br>
          <input type="text" id="apellidos" name="apellidos"/>
      </td>
</tr>

  <tr>
      <td><label>Email:</label> <br>
            <input type="text" id="email" name="email"/>
    </td>
    <td><label>Telefono:</label><br>
        <input type="text" id="telefono" name="telefono"/>
    </td>
 </tr>

 

<tr>
    <td colspan="2">
        <label>Direccion Fisica:</label><br>
        <input style="width: 446px;" type="text" id="direccionfisica" name="direccionfisica"/>
        
    </td>
</tr>

<tr>
    <td>
        <label>Ciudad:</label><br>
        <input type="text" id="ciudad" name="ciudad"/>
    </td>
    <td>
        <label>Departamento;</label><br>
        <input type="text" id="departamento" name="departamento"/>
    </td>
</tr>

<tr>
    <td colspan="2"> <br><hr><br></td>
 
</tr>

<tr>   
    <td> <label>Numero de Tarjeta</label> <br>
            <input type="password" id="contrasena" name="contrasena"/>
    </td>
    <td> <label>Tipo de Tarjeta:</label> <br>
        <select id="tipoTarjeta" name="tipoTarjeta">
    
            <option value="visa">Visa</option>
            <option value="master card">Master Card</option>
    </select>
    </td>
</tr>
<tr>
    <td colspan="2">
        
        
        
<label>Fecha de expiración</label> <br>
 <select name="dias" id="dias">
                <option value="1">01</option>
                <option value="2">02</option>
                <option value="3">03</option>
                <option value="4">04</option>
                <option value="5">05</option>
                <option value="6">06</option>
                <option value="7">07</option>
                <option value="8">08</option>
                <option value="9">09</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
                <option value="13">13</option>
                <option value="14">14</option>
                <option value="15">15</option>
                <option value="16">16</option>
                <option value="17">17</option>
                <option value="18">18</option>
                <option value="19">19</option>
                <option value="20">20</option>
                <option value="21">21</option>
                <option value="22">22</option>
                <option value="23">23</option>
                <option value="24">24</option>
                <option value="25">25</option>
                <option value="26">26</option>
                <option value="27">27</option>
                <option value="28">28</option>
                <option value="29">29</option>
                <option value="30">30</option>
                <option value="31">31</option>
            </select>
            
            <select name="mes" id="mes" >
                <option value="01">Enero</option>
                <option value="02">Febrero</option>
                <option value="03">Marzo</option>
                <option value="04">Abril</option>
                <option value="05">Mayo</option>
                <option value="06">Junio</option>
                <option value="07">Julio</option>
                <option value="08">Agosto</option>
                <option value="09">Septiembre</option>
                <option value="10">Octubre</option>
                <option value="11">Noviembre</option>
                <option value="12">Diciembre</option>
            </select>
    </td>
    
    
</tr>
<tr>
    
    <td  colspan="2">
        
        
        
        
    </td>
    
</tr>

<tr>
 
    <td colspan="2" style="text-align: center;">  
        <!--<input type="submit" id="registro" name="registrar" value="Registrar"/>-->
        <a style="     margin-top: 21px;   text-align: center;" id="registrobtn" class="myButtons" >
            Registrar
        </a>
    </td>
</tr>
</tbody>
</table>
         
      
</form>
        
        
        
        
        
    </td>
</tr>
</tbody>
</table>

  
    <%
           
    //  String[] descripcion = request.getParameterValues("descripcion");
 //for (int i = 0; i < descripcion.length; i++) {
   //   out.print("<p>" + descripcion[i] + "</p>");
   
 
 
 
 
/*

   for (int i = 0; i < descripcion .length; i++) {
      String car = descripcion [i];
      System.out.println("car name::"+car);
   }
            */%>

        
        </td>
<td><!-- columna de detalles-->
  
    
    
    
       <script type="text/javascript">
             
             
             
             $(document).ready(function()
{
    
    var cuerpo="";
 var cantidad=checkoutDescription.length;
 
 cuerpo += "<table style='background-color: #2c2727;width: 600px;margin: 0 auto;margin-top: 63px;' border '1' ><tbody><tr><td colspan='4'><div align='center'><img style=''    height: 113px;' class='imagenBanner' src='/ProyectoOficial01/imagenes/detalle_2.png'></div></td></tr>";
 for(i=0;i<cantidad;i++){
     
     
 cuerpo += "<tr><td><p>4</p></td><td  colspan='2'><p>"+checkoutDescription[i]+"</p></td><td><p  >$"+calculoItem(i)+"</p></td></tr>";
     
     
     
    // alert(cuerpo);
     
 }
 cuerpo+="<tr><td>&nbsp;</td><td colspan='2'><p   style='      font-size: 22px;  float: right;'><strong>Total:</strong></p></td><td><p >$"+totaleCarrito()+"</p></td></tr><tr><td colspan='4' style='text-align: center;'><a   class='procederBtn'>Proceder con la compra</a></td></tr></tbody></table>";
 document.getElementById("jeje").innerHTML = cuerpo;
   //alert(checkoutDescription);
});
         </script>
         <div id="jeje"></div>
    <br><br><br>
  












<jsp:include page="footer.jsp" /> 
