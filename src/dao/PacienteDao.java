package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dominio.*;

public class PacienteDao {
	@PersistenceContext(unitName="ServMed")
	private EntityManager manager;
	
	
	public Paciente save(Paciente paciente){
		try{
			manager.persist(paciente);
			System.out.println("paciente persistida com sucesso!");
		}catch(Exception e){
			e.printStackTrace();
		}
		return paciente;
	}
	
	public List<Paciente> listarpaciente(){
		TypedQuery<Paciente> query = manager.createQuery("Selected c from paciente c", Paciente.class);
		List<Paciente> pacientes = query.getResultList();
		return pacientes;
	}
	
	public Paciente searchById(Integer id){
		Paciente paciente = manager.find(Paciente.class, id);
		return paciente;
	}	
}
