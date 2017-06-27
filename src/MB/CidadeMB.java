package MB;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.CidadeDao;
import dominio.Cidade;

@Named(value = "controleCidade")
@RequestScoped
public class CidadeMB {
	
	@EJB
	CidadeDao dao;

	private Cidade cidade = new Cidade();

	
	
	public Cidade getCidade() {
		return cidade;
	}

	public void setcidade(Cidade cidade) {
		this.cidade = cidade;
	}

	private void clearObjects() {
		this.cidade = new Cidade();

	}
	
	
	public List<Cidade> getcidades(){
		return dao.listarCidade();
	}
	
	public List<Cidade> getListacidades(){
		return this.getcidades();
	}

	public void gravar(){
		
		dao.save(cidade);
		clearObjects();
		
	}

	
}
