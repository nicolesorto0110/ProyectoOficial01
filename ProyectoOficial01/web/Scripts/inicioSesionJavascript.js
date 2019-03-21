$(document).ready(function(){
   $("#iniciar").validate({
       rules:{
           usuario: {
               required: true
           },
           contrasena: {
               required: true
          }
       }   
   });
   $('#iniciobtn').click(function(){
    $("#iniciar").submit();    
  });
});

