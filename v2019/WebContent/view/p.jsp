<%-- 
    Document   : p.jsp
    Created on : 31/05/2018, 07:02:08 PM
    Author     : alum.fial1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<h1>Perfil Usuario</h1>
	<hr>
	<div style="max-width: 400px;">
		<div class="form-group">
			<label>Apellidos:</label> <input type="text" class="form-control"
				id="apell">
		</div>
		<div class="form-group">
			<label>Nombres:</label> <input type="text" class="form-control"
				id="nom">
		</div>
		<div class="form-group">
			<label>Rol:</label> <select id="rol" class="form-control">
				<option>Seleccionar</option>
			</select>
		</div>
		<div class="form-group">
			<label>Usuario:</label> <input type="text" class="form-control"
				id="user">
		</div>
		<div class="form-group">
			<label>Clave:</label> <input type="password" class="form-control"
				id="pass" value="yyyy">
		</div>
	</div>
</body>
</html>
