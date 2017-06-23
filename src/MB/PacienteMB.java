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
	
	private List<Paciente> listaMedicos = new ArrayList<>();
	private Paciente paciente = new Paciente();
	
	public List<Paciente> getListaMedicos() {
		return listaMedicos;
	}
	public void setListaMedicos(List<Paciente> listaMedicos) {
		this.listaMedicos = listaMedicos;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public String addNewPaciente() {
		dao.addPaciente(paciente);
		listaMedicos = dao.findPacientes();
		return "listademedicos";
	}
	
	public String removePaciente(){
		dao.remove(paciente);
		listaMedicos = dao.findPacientes();
		return "listademedicos";
	}
}
