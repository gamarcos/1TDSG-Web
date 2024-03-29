package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;
import br.com.fiap.bean.Usuario;

public class UsuarioBO {

	private static List<Usuario> lista = new ArrayList<Usuario>();
	
	public void cadastrar(Usuario usuario, String repitaSenha) throws Exception{
		if (!usuario.getSenha().equals(repitaSenha)){
			throw new Exception("Senha n�o s�o iguais");
		}
		lista.add(usuario);
	}
	
	public Usuario logar(String email, String senha){
		for (Usuario usuario : lista) {
			if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha))
				return usuario;
		}
		return null;
	}
	
}
