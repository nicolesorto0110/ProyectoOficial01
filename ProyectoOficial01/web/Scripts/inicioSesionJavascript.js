$(document).ready(function(){
   $("#iniciar").validate({
       rules:{
           usuario: {
               required: true
           },
           contrasena: {
               required: true,
               min: 8
          }
       }   
   });
});

