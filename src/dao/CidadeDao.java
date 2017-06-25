package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import dominio.Cidade;

public class CidadeDao {
	private List<Cidade> cidades;
	private EntityManager entityManager;
	
	public CidadeDao(){
		this.cidades = new ArrayList<Cidade>();
	}
	
	public Cidade searchCidade(Cidade a){
		for(Cidade aux:this.cidades){
			if(a.equals(aux))
				return aux;
		}
		return null;
	}
	
	public boolean addCidade(Cidade a){
		if(searchCidade(a) == null){
			this.cidades.add(a);
			return true;
		}else{
			return false;			
		}
	}
	
	public boolean removeCidade(Cidade aux){
		return this.cidades.remove(searchCidade(aux));
	}
	
	public List<Cidade> findCidades() {
		TypedQuery<Cidade> query = entityManager.createNamedQuery("findAllCidades", Cidade.class);
		return query.getResultList();
	}
	
}
