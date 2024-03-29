<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>					
<script type="text/javascript" src="js/bootstrap.min.js"></script>						

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="home.jsp">FIAP Store</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="cadastro-cliente.jsp">Cadastro de Cliente</a></li>
        <li><a href="clienteServlet?acao=listar">Lista de Clientes</a></li>
        <li><a href="cadastro-produto.jsp">Cadastro de Produto</a></li>
        <li><a href="produtoServlet">Listar Produto</a></li>        
      </ul>    
      <c:if test="${empty usuario }"> 
	      <ul class="nav navbar-nav navbar-right">
	      	<li><a href="cadastro-usuario.jsp">Registre-se!</a></li>
	      	<li><a href="login.jsp">Login</a></li>
	      </ul>     
      </c:if>
      <c:if test="${not empty usuario }">
	      <ul class="nav navbar-nav navbar-right">
	    		<li class="dropdown">
	    			<a href="#" class="dropdown-toggle"	
	    			data-toggle="dropdown" role="button"
	    			 aria-haspopup="true" 
	    			aria-expanded="false">${usuario } 
	    			<span class="caret"></span></a>
	    			<ul class="dropdown-menu">
	    				<li><a href="loginServlet">Sair</a></li>
	    			</ul>
	    		</li>
	      </ul>
      </c:if>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>






