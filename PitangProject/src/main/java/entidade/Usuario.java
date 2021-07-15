package entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")

public class Usuario {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_USUARIO")
	@SequenceGenerator(name = "ID_USUARIO", sequenceName = "ID_USUARIO", initialValue= 1, allocationSize = 1)
	@Column(name = "ID_USUARIO", nullable = false)
	private int id_usuario;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	@Column(name = "SENHA", nullable = false)
	private String senha;
	
	@Column(name = "TELEFONE", nullable = false)
	private String telefone;
	

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
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
