package br.com.fiap.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.xml.internal.ws.resources.HttpserverMessages;

import br.com.fiap.bean.Usuario;
import br.com.fiap.bo.UsuarioBO;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Logout
	
		//Recuperar a sess�o do usu�rio
		HttpSession session = req.getSession();
		//Invalidar a sess�o
		session.invalidate();
		
		//Redirecionar o usu�rio para alguma pagina
		req.getRequestDispatcher("login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Recuperar as informa��es da p�gina
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		//Instanciar o BO
		UsuarioBO bo = new UsuarioBO();
		
		//Chamar o m�todo logar
		Usuario usuario = bo.logar(email, senha);
		
		//Valida��o para mandar o usu�rio para algum lugar
		if (usuario == null){
			//Colocar uma mensagem de erro
			req.setAttribute("mensagem", "Usu�rio e/ou senha inv�lidos");
			//Redirecionar para o login
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}else{
			//Criar uma sess�o para o usu�rio
			HttpSession session = req.getSession();
			
			session.setAttribute("usuario", usuario.getNome() );
			
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
	}
}






