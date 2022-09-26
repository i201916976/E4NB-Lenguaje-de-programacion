<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" >
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body class="container" background=imagenes/fondo.JPG  style="position:relative;height: 600;width: 500; opacity:100%">
<!--START FORM-->
<form class="form" action="Servlets" method="POST">
<br><br><br><br><br><br><div class="m-0 row justify-content-center"  style="position:center; opacity: 80%">
<div class="col-auto bg-primary p-5 text-center "  >
<h1>Registro de cuenta</h1>
<h5>Alumno: </h5><input type="text" required="required" name="nombre" value="${param.nombre}" /> 
<h5>Apellido: </h5><input type="text" required="required" name="apellido" value="${param.apellido}"/> 
<h5>Usuario: </h5><input type="text" required="required" name="usuario" value="${param.usuario}"/> 
<h5>Correo: </h5><input type="email" required="required" name="email" value="${param.email}"/> 
<h5>Contraseña: </h5><input type="password" required="required" name="contraseña"/> 
<h5>Fecha de Nacimiento:  </h5><input type="date" required="required" name="fecha"/> 
<br>
<br><button type="reset" class="btn btn-warning">Limpiar</button>
<button type="submit" class="btn btn-dark">Registrar</button>
<div><footer><p>${mensaje}</p> </footer></div>
</div>
</div>
</form>
</body>
</html>