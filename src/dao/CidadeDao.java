package dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dominio.Cidade;

@Stateless
public class CidadeDao {
	@PersistenceContext(unitName="ServMed")
	private EntityManager manager;
	
	
	public Cidade save(Cidade cidade){
		try{
			manager.persist(cidade);
			System.out.println("cidade persistida com sucesso!");
		}catch(Exception e){
			e.printStackTrace();
		}
		return cidade;
	}
	
	public List<Cidade> listarCidade(){
		TypedQuery<Cidade> query = manager.createQuery("Selected c from Cidade c", Cidade.class);
		List<Cidade> cidades = query.getResultList();
		return cidades;
	}
	
	public Cidade searchById(Integer id){
		Cidade cidade = manager.find(Cidade.class, id);
		return cidade;
	}
	
	public Cidade editar(Cidade cidade){
		try{
			System.out.println("Cidade atualizada com sucesso!");
			manager.merge(cidade);
		}catch(Exception e){
			e.printStackTrace();
		}
		return cidade;
	}
	
	public Cidade remove(Cidade cidade){
		manager.remove(manager.merge(cidade));
		return cidade;
	}
}
