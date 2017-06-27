package MB;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.ConsultorioDao;
import dominio.Consultorio;

@Named(value = "controleConsultorio")
@RequestScoped
public class ConsultorioMB {
	@EJB
	ConsultorioDao dao;

	private Consultorio consultorio = new Consultorio();

	
	
	public Consultorio getconsultorio() {
		return consultorio;
	}

	public void setconsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

	private void clearObjects() {
		this.consultorio = new Consultorio();

	}
	
	
	public List<Consultorio> getconsultorios(){
		return dao.listarconsultorio();
	}
	
	public List<Consultorio> getListaconsultorios(){
		return this.getconsultorios();
	}

	public void gravar(){
		
		dao.save(consultorio);
		clearObjects();
		
		
	}

}
