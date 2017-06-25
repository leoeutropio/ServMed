package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import dominio.Consultorio;

public class ConsultorioDao {
	List<Consultorio> consultorios;
	private EntityManager entityManager;
	
	public ConsultorioDao(){
		this.consultorios = new ArrayList<Consultorio>();
	}
	
	
	public Consultorio searchConsultorio(Consultorio a){
		for(Consultorio aux:this.consultorios){
			if(aux.equals(aux))
				return aux;
		}
		return null;
	}
	
	public List<Consultorio> findConsultorios() {
		TypedQuery<Consultorio> query = entityManager.createNamedQuery("findAllConsultorios", Consultorio.class);
		return query.getResultList();
	}
	
	public boolean addConsultorio(Consultorio a){
		if(searchConsultorio(a) == null){
			this.consultorios.add(a);
			return true;
		}
		return false;
	}
	
	public boolean removeConsultorio(Consultorio a){
		return this.consultorios.remove(searchConsultorio(a));
	}
}
