package MB;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.ConsultorioDao;
import dominio.Consultorio;

@Named(value = "controleConsultorio")
@RequestScoped
public class ConsultorioMB {
	@Inject ConsultorioDao dao;
	
	private List<Consultorio> listaConsultorios = new ArrayList<>();
	private Consultorio consultorio = new Consultorio();
	
	public List<Consultorio> getListaConsultorios() {
		listaConsultorios = dao.findConsultorios();
		return listaConsultorios;
	}
	public void setListaConsultorios(List<Consultorio> listaConsultorios) {
		this.listaConsultorios = listaConsultorios;
	}
	public Consultorio getConsultorio() {
		return consultorio;
	}
	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}
	
	public String addNewConsultorio() {
		dao.addConsultorio(consultorio);
		listaConsultorios = dao.findConsultorios();
		return "listadeconsultorios";
	}
	
	public String removeConsultorio(){
		dao.removeConsultorio(consultorio);
		listaConsultorios = dao.findConsultorios();
		return "listadeconsultorios";
	}
}
