package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dominio.Pessoa;
import dominio.Pessoa;

@Stateless
public class PessoaDao {
	@PersistenceContext(unitName="ServMed")
	private EntityManager manager;
	
	
	public Pessoa save(Pessoa pessoa){
		try{
			manager.persist(pessoa);
			System.out.println("pessoa persistida com sucesso!");
		}catch(Exception e){
			e.printStackTrace();
		}
		return pessoa;
	}
	
	public List<Pessoa> listarpessoa(){
		TypedQuery<Pessoa> query = manager.createQuery("Selected c from pessoa c", Pessoa.class);
		List<Pessoa> pessoas = query.getResultList();
		return pessoas;
	}
	
	public Pessoa searchById(Integer id){
		Pessoa pessoa = manager.find(Pessoa.class, id);
		return pessoa;
	}
	
	public Pessoa editar(Pessoa pessoa){
		try{
			System.out.println("Pessoa atualizada com sucesso!");
			manager.merge(pessoa);
		}catch(Exception e){
			e.printStackTrace();
		}
		return pessoa;
	}
	
	public Pessoa remove(Pessoa pessoa){
		manager.remove(manager.merge(pessoa));
		return pessoa;
	}

}
