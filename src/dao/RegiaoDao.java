package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import dominio.Regiao;

public class RegiaoDao {
	public List<Regiao> local;
	private EntityManager entityManager;
	
	public RegiaoDao(){
		this.local = new ArrayList<Regiao>();
	}
	
	public RegiaoDao(List<Regiao> local){
		this.local = local;
	}
	
	public boolean addRegiao(Regiao add){
		if(searchRegiao(add) == null){
			local.add(add);
			return true;
		}
		return false;
	}
	
	public List<Regiao> findRegioes() {
		TypedQuery<Regiao> query = entityManager.createNamedQuery("findAllRegioes", Regiao.class);
		return query.getResultList();
	}
	
	public boolean removeRegiao(Regiao local){
		if(searchRegiao(local) == null){
			return false;
		}
		this.local.remove(searchRegiao(local));
		return true;
	}
	
	public Regiao searchRegiao(Regiao local){
		for(Regiao aux: this.local){
			if(aux == local){
				return aux;
			}
		}
		return null;
	}
}
