package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import JpaUtil.JpaUtil;
import entidade.Usuario;

public class UsuarioDAOimpl implements UsuarioDAO {
	
		public void inserir(Usuario usuario) {
				
				EntityManager ent = JpaUtil.getEntityManager();
				EntityTransaction ts = ent.getTransaction();
				
				ts.begin();
				
				ent.persist(usuario);
				
				ts.commit();
				ent.close();
				
		}

		@Override
		public void remover(int id_usuario) {
					
					EntityManager ent = JpaUtil.getEntityManager();
					EntityTransaction ts = ent.getTransaction();
					
					ts.begin();
					
					ent.remove(id_usuario);
					
					ts.commit();
					ent.close();
		}

		@Override
		public void alterar(Usuario usuario) {
	
				
					EntityManager ent = JpaUtil.getEntityManager();
					EntityTransaction ts = ent.getTransaction();
					ts.begin();
					
					ent.merge(usuario);
					
					ts.commit();
					ent.close();
				
			
		}

		@Override
		public Usuario pesquisar(String email) {
			
			EntityManager ent = JpaUtil.getEntityManager();
			Usuario usuario = ent.find(Usuario.class, email);
			
			return usuario;
		}

		@Override
		public List<Usuario> listarTodos() {
			String sql = "FROM USUARIO U";
			
			List<Usuario> listarTodos = new ArrayList<Usuario>();
			
			EntityManager ent = JpaUtil.getEntityManager();
			EntityTransaction ts = ent.getTransaction();
			ts.begin();
			
			listarTodos = ent.createNamedQuery("FROM USUARIO U").getResultList();
			
			return listarTodos;
		}

}
