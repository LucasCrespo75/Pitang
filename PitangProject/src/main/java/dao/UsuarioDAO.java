package dao;

import java.util.List;

import entidade.Usuario;

public interface UsuarioDAO {
	
	public void inserir(Usuario usuario);
	
	public void alterar(Usuario usuario);
	
	public Usuario pesquisar(int id_usuario);
	
	public List<Usuario> listarTodos();
	
	public void remover(int id_usuario);



	
	

	
	
}
