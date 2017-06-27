package MB;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.PacienteDao;
import dominio.Paciente;

@Named(value = "controlePaciente")
@RequestScoped
public class PacienteMB {
	@EJB
	PacienteDao dao;

	private Paciente paciente = new Paciente();

	
	
	public Paciente getpaciente() {
		return paciente;
	}

	public void setpaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	private void clearObjects() {
		this.paciente = new Paciente();

	}
	
	
	public List<Paciente> getpacientes(){
		return dao.listarpaciente();
	}
	
	public List<Paciente> getListapacientes(){
		return this.getpacientes();
	}

	public void gravar(){
		
		dao.save(paciente);
		clearObjects();
		
		
	}

}
