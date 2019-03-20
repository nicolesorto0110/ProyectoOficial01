function registrar(){
    
             
    
    var nombre = document.getElementById('nombres').value;
    var apellidos = document.getElementById('apellidos').value;
    var email = document.getElementById('email').value;
    var dias = document.getElementById('dias').value;
    var mes = document.getElementById('mes').value;
    var ano = document.getElementById('ano').value;
    var contrasena = document.getElementById('contrasena').value;
    var confirm = document.getElementById('confirm').value;
    var username = document.getElementById('username').value;
    
    //alert("hola buuuu "+nombre + mes+"el dia es: "+dias);
    location.href="/ProyectoOficial01/RegistroServlet?nombre="+nombre+"&apellidos="+apellidos+"&username="+username+"&email="+email+"&dias="+dias+"&mes="+mes+"&ano="+ano+"&contrasena="+contrasena+"&confirm="+confirm;
    //http://localhost:33090/ProyectoOficial01/InicioServlet?usuario=878787&contrasena=989898&iniciar=Ingresar
    //http://localhost:33090/ProyectoOficial01//InicioServlet?usuario=878787&contrasena=989898&iniciar=Ingresar
    
}
 