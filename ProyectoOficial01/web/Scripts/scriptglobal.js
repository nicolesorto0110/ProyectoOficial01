/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */







function carritoCore(){
  var checkoutDescription = ["Unos Alexanderes de peluche par llevar", "Suvenirs de chuchitos", "Cuadros de la osa babu!"];
var checkoutPrecio = ["23.56", "12.50", "30"];
var checkoutCantidades = ["2", "5", "30"];  
    
    var cuerpo="";
 var cantidad=checkoutDescription.length;
 
 cuerpo += "<table style='background-color: #2c2727;width: 600px;margin: 0 auto;margin-top: 63px;' border '1'><tbody><tr><td colspan='8'>   <div align='center'><img style='    height: 113px;' class='imagenBanner' src='/ProyectoOficial01/imagenes/detalle_2.png'> </div></td></tr>";
 for(i=0;i<cantidad;i++){
     
     
 cuerpo += "<tr><td><p>1</p></td><td><p>img</p></td><td colspan='2'><p class='detallesfont'>"+checkoutDescription[i]+"</p></td><td><p><i class='far fa-plus-square'></i></p></td><td><p class='detallesfont'>"+checkoutPrecio[i]+"</p></td><td><p><i class='far fa-minus-square'>\n\
</i></p></td><td><p>$"+checkoutCantidades[i]+"</p></td></tr>";
     
     
     
    // alert(cuerpo);
     
 }
 cuerpo+="<tr><td colspan='7'><p class='detallesfont' style=''font-size: 22px;  float: right;'><strong>Total:</strong></p></td><td><p class='detallesfont'>$23.56</p></td></tr><tr><td colspan='8'>&nbsp;</td></tr></tbody></table>";
 document.getElementById("cuerpoCheckout").innerHTML = cuerpo;
    
}


function carritoOpen(){
    
 document.getElementById('carrito').style.display = 'block';
    
    
}
function cerrarCarrito(){
    
    document.getElementById('carrito').style.display = 'none'; 
    
}

