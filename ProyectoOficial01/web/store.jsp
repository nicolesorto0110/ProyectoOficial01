<%-- 
    Document   : store
    Created on : 04-01-2019, 03:35:07 PM
    Author     : nicole
--%>
<%@page import="java.util.Iterator"%>
 
 <%@page import="ProyectoLae.Objects.StoreObjetos"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
      <jsp:include page="header.jsp" /> 
         <%
        ArrayList<StoreObjetos> CArray = 
                (ArrayList<StoreObjetos>)request.getSession().getAttribute("productos");
        Iterator<StoreObjetos> iteArray = CArray.iterator();
    %> 
    
    
    
        <%
            
            
            int flag=0;
            if(iteArray!=null)
            {
                StoreObjetos CTemp;
                while(iteArray.hasNext())
                {
                    CTemp = iteArray.next();
                    
if(flag==0){
    
    flag++;
     %>
       <table style="    margin: 0 auto;">
<tbody>
<tr>
    <td>
  <!-- item1 -->       
  
  <table>
<tbody>
<tr>
<td colspan="3">   <img style="    width: 385px;" class="bannerpromo"  src="imagenes/store/<%= CTemp.getM_imagen()%>" alt=""/>
                        </td>
 
</tr>
<tr>
    <td colspan="3"><div style="    width: 385px;;"><p style="    width: 385px;
    color: white;
    height: 44px;"><%= CTemp.getM_nombreProducto() %></p></div></td>
</tr>
<tr>
<td>&nbsp;</td>
<td style="text-align: center;"><a style="" href="storeServlet?add=<%= CTemp.getM_id() %>&prrecio=<%= CTemp.getM_precio()%>" class="myButtonn">Add to Cart</a></td>
<td>&nbsp;</td>
</tr>
</tbody>
</table>      
  <!-- item1 fin -->
    </td>       
     <%        
    

}

else if(flag==1){
    
    flag++;
%>
  
<td>

      <!-- item2 -->       
  <table>
<tbody>
<tr>
<td colspan="3">   <img style="    width: 385px;;" class="bannerpromo"  src="imagenes/store/<%= CTemp.getM_imagen()%>" alt=""/>
                        </td>
 
</tr>
<tr>
<td colspan="3"><div style="    width: 385px;;"><p style="    width: 385px;
    color: white;
    height:44px;"><%= CTemp.getM_nombreProducto() %></p></div></td>
</tr>
<tr>
<td>&nbsp;</td>
<td style="text-align: center;"><a style="  " href="storeServlet?add=<%= CTemp.getM_id() %>&prrecio=<%= CTemp.getM_precio()%>" class="myButtonn">Add to Cart</a></td>
<td>&nbsp;</td>
</tr>
</tbody>
</table>
        
  <!-- item2 fin -->

</td>

<%
}

else if(flag==2){
    
    flag=0;
%>


   
<td>

      <!-- item3 -->       
  <table>
<tbody>
<tr>
<td colspan="3">   <img style="    width: 385px;" class="bannerpromo"  src="imagenes/store/<%= CTemp.getM_imagen()%>" alt=""/>
                        </td>
 
</tr>
<tr>
    <td colspan="3"><div style="    width: 385px;;"><p style="    width: 385px;
    color: white;
    height:    44px;"><%= CTemp.getM_nombreProducto() %></p></div></td>
</tr>
<tr>
<td>&nbsp;</td>
<td style="text-align: center;"><a style=" " href="storeServlet?add=<%= CTemp.getM_id() %>&prrecio=<%= CTemp.getM_precio()%>" class="myButtonn">Add to cart</a></td>
<td>&nbsp;</td>
</tr>
</tbody>
</table>
        
  <!-- item3 fin -->

</td>
</tr>
</tbody>
</table>

<%

}

        %>
    
    
    
      
      
      
      
        <%
                }
            }
        %>  
      
<jsp:include page="footer.jsp" /> 
