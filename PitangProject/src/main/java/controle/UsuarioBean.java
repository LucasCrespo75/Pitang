import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dao.UsuarioDAO;
import dao.UsuarioDAOimpl;
import entidade.Usuario;

@ManagedBean(name = "UsuarioBean")
@SessionScoped
public class UsuarioBean {
	
	private Usuario usuario;
	private List<Usuario> listarTodos;
	private UsuarioDAO dao;
	private String nome;
	private String email;
	private String senha;
	private String telefone;
	
	
	public UsuarioBean() {
		
		this.listarTodos = new ArrayList<Usuario>();
		this.usuario = new Usuario();
		this.dao = new UsuarioDAOimpl();
		
		this.listarTodos = this.dao.listarTodos();
		
	}
	
	public void entrar() {
		
		Usuario usuarioDentro = null;
		
		this.listarTodos = this.dao.listarTodos();
		
		for(Usuario usuarioPesquisa : listarTodos) {
			
			if(usuarioPesquisa.getEmail().equals(this.email)
				&& usuarioPesquisa.getSenha().equals(this.senha) 
				&& usuarioPesquisa.getTelefone().equals(this.telefone));
			
		
		usuarioDentro = usuarioPesquisa;
		}
		
	//if(usuarioDentro != null) {
//		return "entrarParaCadastro.xhtml";
	//}else {
		//return "algumLugar.xhtml";
	}
}
	
