package dao;

import java.util.List;

import entidade.Usuario;

public interface UsuarioDAO {
	
	public void inserir(Usuario usuario);
	
	public void alterar(Usuario usuario);
	
	public Usuario pesquisar(String email);
	
	public List<Usuario> listarTodos();
	
	public Usuario remover(int id_usuario);



	
	

	
	
}
