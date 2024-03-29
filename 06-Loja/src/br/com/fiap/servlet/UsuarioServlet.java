package br.com.fiap.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bean.Usuario;
import br.com.fiap.bo.UsuarioBO;

@WebServlet("/usuarioServlet")
public class UsuarioServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Recupera as informa��es da p�gina
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		String repitaSenha = req.getParameter("repita");
		
		//Chama o BO para cadastrar
		Usuario usuario = new Usuario(nome,email,senha);
		UsuarioBO bo = new UsuarioBO();
		
		try{
			bo.cadastrar(usuario, repitaSenha);
			//Adiciona uma mensagem
			req.setAttribute("mensagem", "Usu�rio cadastrado!");
			//Redireciona para um JSP
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		
		}catch(Exception e){			
			e.printStackTrace();
			//Adiciona uma mensagem
			req.setAttribute("mensagem", e.getMessage());
			//Redireciona para um JSP
			req.getRequestDispatcher("cadastro-usuario.jsp").forward(req, resp);
		}
	}
		
}
