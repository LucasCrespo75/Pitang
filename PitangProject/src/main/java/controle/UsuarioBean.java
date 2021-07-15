package controle;

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
	
	public String entrar() {
		
		Usuario usuarioDentro = null;
		
		this.listarTodos = this.dao.listarTodos();
		
		for(Usuario usuarioPesquisa : listarTodos) {
			
			if(usuarioPesquisa.getEmail().equals(this.email)
				&& usuarioPesquisa.getSenha().equals(this.senha) 
				&& usuarioPesquisa.getTelefone().equals(this.telefone));
			
		
		usuarioDentro = usuarioPesquisa;
		}
		
	if(usuarioDentro != null) {
		return "entrarParaCadastro.xhtml";
	}else {
		return "";
	}
	}
	
	public void cadastroUsuario() {
		
		Usuario usuarioNovo = new Usuario();
		
		usuarioNovo.setNome(this.nome);
		usuarioNovo.setEmail(this.email);
		usuarioNovo.setSenha(this.senha);
		usuarioNovo.setTelefone(this.telefone);
		
		boolean achou = false;
		
		this.listarTodos = this.dao.listarTodos();
		for(Usuario usuarioPesquisa : listarTodos) {
			if(usuarioPesquisa.getEmail().equals(this.email)) {
						achou = true;
	     }
	
	}
	if(achou) {
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Email existente!!!"));
		
		
	}else {
		System.out.println("SUCESSO!!");
		this.dao.inserir(usuarioNovo);
		this.usuario = new Usuario();

		}
}
	public void alterarUsuario() {
		
		Usuario usuarioNovo = new Usuario();
		
		usuarioNovo.setNome(this.getNome());
		usuarioNovo.setEmail(this.getEmail());
		usuarioNovo.setSenha(this.getSenha());
		usuarioNovo.setTelefone(this.getTelefone());
		
		boolean achou = false;
		
		this.listarTodos = this.dao.listarTodos();
		for(Usuario usuarioPesquisa : listarTodos) {
			if(usuarioPesquisa.getEmail().equals(this.email)) {
				achou = true;
		}
	}

	if(achou) {
		FacesContext.getCurrentInstance()
		.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "Email não cadastrado!!!"));
	}else {
		System.out.println("Alterado com sucesso!!");
		this.dao.alterar(usuario);
		this.dao.inserir(usuarioNovo);
		this.usuario = new Usuario();
	}
}

	public void removerUsuario() {

		Usuario user = new Usuario();
		user.add("");

		user.delete("email"); // Retorna false. Nenhum elemento "bar" foi encontrado para deletar.
		user.delete("email"); // Retorna true. remoção bem sucedida.
		user.has("email");    // Retorna false. O elemento "foo" não está mais presente.
		
		
		
	}
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListarTodos() {
		return listarTodos;
	}

	public void setListarTodos(List<Usuario> listarTodos) {
		this.listarTodos = listarTodos;
	}

	public UsuarioDAO getDao() {
		return dao;
	}

	public void setDao(UsuarioDAO dao) {
		this.dao = dao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}


	


	
