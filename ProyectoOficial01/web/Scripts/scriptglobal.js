/* 
 * 
 * 
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 
 function elimirfila(id,fila){
     
 //    alert("sipo"+id+" fila:"+fila);
 
     
     //borro con esto
    checkoutDescription.splice(fila, 1);
checkoutPrecio.splice(fila, 1);
 
checkoutCantidades.splice(fila, 1);
ids.splice(fila, 1);
$.ajax({
    type: 'GET',
    url: 'eventosServlet',
     data: {"idEliminar" : id, "formid" :"borrar"},
    success: function(msg) {
      alert("eliminado");
      carritoCore();//muestro el carrito
    }
});
 }



function generalert(){
    
    alert("si funcionara!");
    
    
}
function verificar(valor){
	if(valor==""||valor==null){
		return false;

	}else{
		return true;
	}
}

 

function agarralo2(){
  
    var nombres = document.getElementById("nombres").value;
    var apellidos = document.getElementById("apellidos").value;
    var email = document.getElementById("email").value;
  
    var direccionfisica = document.getElementById("direccionfisica").value;
    var ciudad = document.getElementById("ciudad").value;
    var departamento = document.getElementById("departamento").value;
    
    
    
    if(verificar(nombres)&&verificar(apellidos)&&verificar(email)&&verificar(direccionfisica)&&verificar(ciudad)&&verificar(departamento)){
          
        
var checkoutDescription = [];
var checkoutPrecio = [];
 
var checkoutCantidades = [];  
var ids = []; 


checkoutCantidades.length = 0;
ids.length = 0;
checkoutPrecio.length = 0;
checkoutDescription.length = 0;

        $("#formCheckoutUltimo").submit(); 
   // alert("hoooooooo"); 
    }else{
        
      alert("Toos los capos son obligatorios");   
        
    }
    

}
function agarralo(){
  
    
    
    $("#formCheckout").submit(); 
   // alert("hoooooooo");
}

//
$(document).ready(function()
{
    $('#checkout2').click(function(){
        
        alert("yooooooo");
        
    //$("#formCheckout").submit();    
  });
});


 


//vector global





function carritoCore(){

    
 var cuerpo="";
 var cantidad=checkoutDescription.length;
 
 cuerpo += "<table style='background-color: #2c2727;width: 600px;\n\
margin: 0 auto;margin-top: 63px;' border '1'><tbody><tr><td colspan='8'>   \n\
<div align='center'><img style='    height: 113px;' class='imagenBanner' \n\
src='/ProyectoOficial01/imagenes/detalle_2.png'> </div></td></tr>";
 for(i=0;i<cantidad;i++){
     
     
 cuerpo += "<tr><td><p>1</p></td><td><p>img</p></td><td colspan='2'>\n\
<p class='detallesfont'>"+checkoutDescription[i]+"</p></td><td><p>\n\
<i onclick='sum("+i+","+checkoutCantidades[i]+","+ids[i]+");' class='far fa-plus-square'></i></p>\n\
</td><td><p class='detallesfont'>"+checkoutCantidades[i]+"</p></td>\n\
<td><p><i  onclick='rest("+i+","+checkoutCantidades[i]+","+ids[i]+");' class='far fa-minus-square'>\n\
</i></p></td><td><p>$"+calculoItem(i)+"</p>   <input onclick='elimirfila("+ids[i]+","+i+");' style='    width: 100%;' type='submit' value='Eliminar'/></td></tr>";
     

    // alert(cuerpo);
     
 }
 cuerpo+="<tr><td colspan='7'><p class='detallesfont' style=''font-size: 22px; \n\
 float: right;'><strong>Total:</strong></p></td><td><p class='detallesfont'>$"+totaleCarrito()+"</p></td>\n\
</tr><tr><td style='text-align: center;' colspan='8'> \n\
\n\
<form id='formCheckout' action='CheckoutServlet'>\n\
<input type='hidden' id='descripcion' name='descripcion' value='"+checkoutDescription+"'></input>\n\
\n\<input type='hidden' id='descripcion' name='descripcion' value='"+checkoutPrecio+"'></input>\n\
\n\<input type='hidden' id='precio' name='precio' value='"+checkoutCantidades+"'></input>\n\
<a onclick='agarralo();'  id='cantidades' name='cantidades' \n\
class='procederBtn'>Checkout</a></form></td></tr></tbody></table>";
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
function sum(indice,cantidad,ids){
//alert("estas sumando en: "+indice);  
//checkoutDescription[indice]="jo jo jo";
var nuevoValor = cantidad+1;
var nuevototal=cantidad*checkoutPrecio[indice];
//checkoutPrecio[indice]=nuevototal.toFixed(2);
checkoutCantidades[indice]=nuevoValor;


$.ajax({
    type: 'GET',
    url: 'eventosServlet',
     data: {"idchange" : ids, "catChange" :nuevoValor, "formid" :"actualizar"},
    success: function(msg) {
      alert("change");
    }
});



//alert(indice);
//checkoutDescription[indice]=nuevoValor;
carritoCore();
//alert(checkoutCantidades[indice]);
    
}
function rest(indice,cantidad,ids){
  var nuevoValor = cantidad-1;
  var nuevototal=cantidad*checkoutPrecio[indice];
//checkoutPrecio[indice]=nuevototal.toFixed(2);;
  //alert(indice);
checkoutCantidades[indice]=nuevoValor;

$.ajax({
    type: 'GET',
    url: 'eventosServlet',
     data: {"idchange" : ids, "catChange" :nuevoValor, "formid" :"actualizar"},
    success: function(msg) {
      alert("change");
    }
});
carritoCore();
   // alert("estas restando en: "+indice);   
    
    
}

function carritoOpen(){
    
 document.getElementById('carrito').style.display = 'block';
    
    
}
function cerrarCarrito(){
    
    document.getElementById('carrito').style.display = 'none'; 
    
}

   