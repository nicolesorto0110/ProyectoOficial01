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
                    <img style="    height: 113px;" class="imagenBanner" src="/ProyectoOficial01/imagenes/inicio.png">
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
    <td> <label>Nombre de Usuario:</label> <br>
            <input type="text" id="username" name="username"/>
    </td>
    <td><label>Telefono:</label><br>
        <input type="text" id="telefono" name="telefono"/>
    </td>
 </tr>

 <tr>
    <td><label>Email:</label> <br>
            <input type="text" id="email" name="email"/>
    </td>
    <td><label>Género:</label><br>
            <select name="genero" id="genero">
                <option value="Masculino">Masculino</option>
                <option value="Femenino">Femenino</option>
            </select>
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
<td colspan="2"> <label>Fecha de Nacimiento:</label><br>
            
            <select name="dias" id="dias" style="    width: 148px;">
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
            
            <select name="mes" id="mes" style="    width: 147px;">
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
          
            <select id="ano" name="ano" style="    width: 148px;">
                <option value="2019">01</option>
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
            </select></td>
 
</tr>

<tr>   
    <td> <label>Contraseña:</label> <br>
            <input type="password" id="contrasena" name="contrasena"/>
    </td>
    <td> <label>Confirmar contraseña:</label> <br>
            <input type="password" id="confirm" name="confirm"/>
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



        
        </td>
<td><!-- columna de detalles-->
  <table>
<tbody>
<tr>

<td colspan="3">   <div align="center">
                    <img style="    height: 113px;" class="imagenBanner" src="/ProyectoOficial01/imagenes/inicio.png">
                    </div></td>
</tr>
<tr>
 
    <td colspan="2"><p>Unos Alexanderes de peluche para llevar</p></td>
    <td><p>$23.56</p></td>
</tr>
<tr>
<td>&nbsp;</td>
<td><p>Total:</p></td>
<td><p>$23.56</p></td>
</tr>
<tr>

<td colspan="3">&nbsp;</td>
</tr>
</tbody>
</table>
<!--fin de la onda esta--></td>
</tr>
</tbody>
</table>




<jsp:include page="footer.jsp" /> 
