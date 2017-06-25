package MB;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.CidadeDao;
import dominio.Cidade;

@Named(value = "controleCidade")
@RequestScoped
public class CidadeMB {
	@Inject CidadeDao dao;
	
	private List<Cidade> listaCidades = new ArrayList<>();
	private Cidade cidade = new Cidade();
	
	public List<Cidade> getListaCidades() {
		listaCidades = dao.findCidades();
		return listaCidades;
	}
	public void setListaCidades(List<Cidade> listaCidades) {
		this.listaCidades = listaCidades;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String addNewCidade() {
		dao.addCidade(cidade);
		listaCidades = dao.findCidades();
		return "listadecidades";
	}
	
	public String removeCidade(){
		dao.removeCidade(cidade);
		listaCidades = dao.findCidades();
		return "listadecidades";
	}
	
}
