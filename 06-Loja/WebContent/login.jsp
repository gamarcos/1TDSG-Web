<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>

<div class="container">	
	<h1>Entre!</h1>
	<div>${mensagem }</div>
	<form action="loginServlet" method="post">
		<div class="form-group">
			<label for="email">E-mail</label>
			<input type="text" name="email" class="form-control" id="email">
		</div>
		<div class="form-group">
			<label for="senha">Senha</label>
			<input type="password" name="senha" class="form-control" id="senha">
		</div>
		<div class="form-group">
			<a href="cadastro-usuario.jsp">Registre-se!</a>
			<input type="submit" value="Entrar" class="btn btn-primary">
		</div>
	</form>
</div>

</body>
</html>