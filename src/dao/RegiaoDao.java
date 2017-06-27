package dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dominio.Regiao;
import dominio.Regiao;

public class RegiaoDao {
	@PersistenceContext(unitName="ServMed")
	private EntityManager manager;
	
	
	public Regiao save(Regiao regiao){
		try{
			manager.persist(regiao);
			System.out.println("regiao persistida com sucesso!");
		}catch(Exception e){
			e.printStackTrace();
		}
		return regiao;
	}
	
	public List<Regiao> listarregiao(){
		TypedQuery<Regiao> query = manager.createQuery("Selected c from regiao c", Regiao.class);
		List<Regiao> regiaos = query.getResultList();
		return regiaos;
	}
	
	public Regiao searchById(Integer id){
		Regiao regiao = manager.find(Regiao.class, id);
		return regiao;
	}
	
	public Regiao editar(Regiao regiao){
		try{
			System.out.println("Regiao atualizada com sucesso!");
			manager.merge(regiao);
		}catch(Exception e){
			e.printStackTrace();
		}
		return regiao;
	}
	
	public Regiao remove(Regiao regiao){
		manager.remove(manager.merge(regiao));
		return regiao;
	}
}
