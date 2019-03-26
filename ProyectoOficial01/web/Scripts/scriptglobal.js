/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//
$(document).ready(function()
{
    $('#checkout').click(function(){
    $("#formCheckout").submit();    
  });
});




//vector global
  var checkoutDescription = ["Unos Alexanderes de peluche par llevar", "Suvenirs de chuchitos", "Cuadros de la osa babu!"];
var checkoutPrecio = ["23.56", "12.50", "30"];
 
var checkoutCantidades = [2, 3, 5];  
 




function carritoCore(){

    
    var cuerpo="";
 var cantidad=checkoutDescription.length;
 
 cuerpo += "<table style='background-color: #2c2727;width: 600px;margin: 0 auto;margin-top: 63px;' border '1'><tbody><tr><td colspan='8'>   <div align='center'><img style='    height: 113px;' class='imagenBanner' src='/ProyectoOficial01/imagenes/detalle_2.png'> </div></td></tr>";
 for(i=0;i<cantidad;i++){
     
     
 cuerpo += "<tr><td><p>1</p></td><td><p>img</p></td><td colspan='2'><p class='detallesfont'>"+checkoutDescription[i]+"</p></td><td><p><i onclick='sum("+i+","+checkoutCantidades[i]+");' class='far fa-plus-square'></i></p></td><td><p class='detallesfont'>"+checkoutCantidades[i]+"</p></td><td><p><i  onclick='rest("+i+","+checkoutCantidades[i]+");' class='far fa-minus-square'>\n\
</i></p></td><td><p>$"+calculoItem(i)+"</p></td></tr>";
     
     
     
    // alert(cuerpo);
     
 }
 cuerpo+="<tr><td colspan='7'><p class='detallesfont' style=''font-size: 22px;  float: right;'><strong>Total:</strong></p></td><td><p class='detallesfont'>$"+totaleCarrito()+"</p></td></tr><tr><td style='text-align: center;' colspan='8'> <form id='formCheckout' action='CheckoutServlet'><input type='hidden' id='descripcion' name='descripcion'></input><a  id='checkout' name='checkout' class='procederBtn'>Checkout</a></form></td></tr></tbody></table>";
 document.getElementById("cuerpoCheckout").innerHTML = cuerpo;
    
}
function calculoItem(i){
    if(checkoutCantidades[i]==1){
        
      return  checkoutPrecio[i];
        
    }else{
      var sumo=  checkoutPrecio[i]*checkoutCantidades[i];
    return  sumo.toFixed(2);
    }
    
}
function totaleCarrito(){
        
           var sumo= 0;
 var cantidad=checkoutDescription.length;
  for(i=0;i<cantidad;i++){
      
    sumo += checkoutPrecio[i]*checkoutCantidades[i];
      
  }
  return sumo.toFixed(2);
    
}
function sum(indice,cantidad){
//alert("estas sumando en: "+indice);  
//checkoutDescription[indice]="jo jo jo";
var nuevoValor = cantidad+1;
var nuevototal=cantidad*checkoutPrecio[indice];
//checkoutPrecio[indice]=nuevototal.toFixed(2);
checkoutCantidades[indice]=nuevoValor;


//alert(indice);
//checkoutDescription[indice]=nuevoValor;
carritoCore();
//alert(checkoutCantidades[indice]);
    
}
function rest(indice,cantidad){
  var nuevoValor = cantidad-1;
  var nuevototal=cantidad*checkoutPrecio[indice];
//checkoutPrecio[indice]=nuevototal.toFixed(2);;
  //alert(indice);
checkoutCantidades[indice]=nuevoValor;
carritoCore();
   // alert("estas restando en: "+indice);   
    
    
}

function carritoOpen(){
    
 document.getElementById('carrito').style.display = 'block';
    
    
}
function cerrarCarrito(){
    
    document.getElementById('carrito').style.display = 'none'; 
    
}

