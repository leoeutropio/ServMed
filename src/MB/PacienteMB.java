package MB;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.PacienteDao;
import dominio.Paciente;

@Named(value = "controlePaciente")
@RequestScoped
public class PacienteMB {
	@Inject PacienteDao dao;
	
	private List<Paciente> listaPacientes = new ArrayList<>();
	private Paciente paciente = new Paciente();
	
	public List<Paciente> getListaMedicos() {
		listaPacientes = dao.findPacientes();
		return listaPacientes;
	}
	public void setListaMedicos(List<Paciente> listaPacientes) {
		this.listaPacientes = listaPacientes;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public String addNewPaciente() {
		dao.addPaciente(paciente);
		listaPacientes = dao.findPacientes();
		return "listadepacientes";
	}
	
	public String removePaciente(){
		dao.remove(paciente);
		listaPacientes = dao.findPacientes();
		return "listadepacientes";
	}
}
