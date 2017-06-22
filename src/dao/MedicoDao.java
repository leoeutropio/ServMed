package dao;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import dominio.Medico;


@Named
@RequestScoped
public class MedicoDao {
	public List<Medico> medicos;
	private EntityManager entityManager;
	
	
	public MedicoDao(){
		this.medicos = new ArrayList<Medico>();
	}
	
	public MedicoDao(List<Medico> m){
		this.medicos = m;
	}
	
	public Medico searchByCRM(String crm){
		for(Medico aux:medicos){
			if(aux.getCrm() == crm){
				return aux;
			}
		}
		return null;
	}
	
	public boolean addMedico(Medico m){
		if(this.searchByCRM(m.getCrm()) != null){
			this.medicos.add(m);
			return true;
		}
		else
			return false;
	}
	
	public List<Medico> findMedicos() {
		TypedQuery<Medico> query = entityManager.createNamedQuery("findAllMedicos", Medico.class);
		return query.getResultList();
	}
	
	public void list(){
		System.out.println("------Lista de Medicos----------------");
		for(Medico aux: this.medicos){
			System.out.println(">>>Nome: " + aux.getNome());
			System.out.println(">>>CPF: " + aux.getCrm());
			System.out.println(">>>Email: " + aux.getEmail());
			System.out.println(">>>Endereço: " + aux.getEndereco());
			System.out.println(">>>Telefone: " + aux.getTelefone());
		}
	}
	
	public boolean removeMedico(Medico aux){
		return this.medicos.remove(searchByCRM(aux.getCrm()));
	}
	
}
