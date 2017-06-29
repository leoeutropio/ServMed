package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dominio.Paciente;

@Dependent
@Stateless
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
	
	public Paciente editar(Paciente paciente){
		try{
			System.out.println("Paciente atualizada com sucesso!");
			manager.merge(paciente);
		}catch(Exception e){
			e.printStackTrace();
		}
		return paciente;
	}
	
	public Paciente remove(Paciente paciente){
		manager.remove(manager.merge(paciente));
		return paciente;
	}
}
