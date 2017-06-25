package MB;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import dominio.Medico;

import dao.MedicoDao;

@Named(value = "controleMedico")
@RequestScoped
public class MedicoMB {
	@Inject MedicoDao dao;

	private List<Medico> listaMedicos = new ArrayList<>();
	private Medico medico = new Medico();
	
	public List<Medico> getMedicos() {
		listaMedicos = dao.findMedicos();
		return listaMedicos;
	}
	public void setMedicos(List<Medico> medicos) {
		this.listaMedicos = medicos;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	public String addNewMedico() {
		dao.addMedico(medico);
		listaMedicos = dao.findMedicos();
		return "listademedicos";
	}
	
	public String removeMedico(){
		dao.removeMedico(medico);
		listaMedicos = dao.findMedicos();
		return "listademedicos";
	}
}
