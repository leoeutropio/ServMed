package MB;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.ConsultaDao;
import dominio.Consulta;

@Named(value = "controleConsulta")
@RequestScoped
public class ConsultaMB {
	@EJB
	ConsultaDao dao;

	private Consulta cunsulta = new Consulta();

	
	
	public Consulta getConsulta() {
		return cunsulta;
	}

	public void setcunsulta(Consulta cunsulta) {
		this.cunsulta = cunsulta;
	}

	private void clearObjects() {
		this.cunsulta = new Consulta();

	}
	
	
	public List<Consulta> getcunsultas(){
		return dao.listarConsulta();
	}
	
	public List<Consulta> getListacunsultas(){
		return this.getcunsultas();
	}

	public void gravar(){
		
		dao.save(cunsulta);
		clearObjects();
		
		
	}

	
}
