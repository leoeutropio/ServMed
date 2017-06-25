package MB;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.ConsultaDao;
import dominio.Consulta;

@Named(value = "controleConsulta")
@RequestScoped
public class ConsultaMB {
	@Inject ConsultaDao dao;
	
	private List<Consulta> listaConsultas = new ArrayList<>();
	private Consulta consulta = new Consulta();
	
	public List<Consulta> getListaConsultas() {
		listaConsultas = dao.findConsultas();
		return listaConsultas;
	}
	public void setListaConsultas(List<Consulta> listaConsultas) {
		this.listaConsultas = listaConsultas;
	}
	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	
	public String addNewConsulta() {
		dao.addConsulta(consulta);
		listaConsultas = dao.findConsultas();
		return "listadeconsultas";
	}
	
	public String removeConsulta(){
		dao.removeConsulta(consulta);
		listaConsultas = dao.findConsultas();
		return "listadeconsultas";
	}
	
}
