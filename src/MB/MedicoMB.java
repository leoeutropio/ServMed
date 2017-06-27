package MB;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import dominio.Medico;

import dao.MedicoDao;

@Named(value = "controleMedico")
@RequestScoped
public class MedicoMB {
	@EJB
	MedicoDao dao;

	private Medico medico = new Medico();

	
	
	public Medico getmedico() {
		return medico;
	}

	public void setmedico(Medico medico) {
		this.medico = medico;
	}

	private void clearObjects() {
		this.medico = new Medico();

	}
	
	
	public List<Medico> getmedicos(){
		return dao.listarmedico();
	}
	
	public List<Medico> getListamedicos(){
		return this.getmedicos();
	}

	public void gravar(){
		
		dao.save(medico);
		clearObjects();
		
		
	}

}
