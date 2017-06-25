package MB;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.RegiaoDao;
import dominio.Regiao;

@Named(value = "controleRegiao")
@RequestScoped
public class RegiaoMB {
	@Inject RegiaoDao dao;
	
	private List<Regiao> listaRegioes = new ArrayList<>();
	private Regiao regiao = new Regiao();
	
	public List<Regiao> getListaRegioes() {
		listaRegioes = dao.findRegioes();
		return listaRegioes;
	}
	public void setListaRegioes(List<Regiao> listaRegioes) {
		this.listaRegioes = listaRegioes;
	}
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
	
	public String addNewRegiao() {
		dao.addRegiao(regiao);
		listaRegioes = dao.findRegioes();
		return "listaderegioes";
	}
	
	public String removeRegiao(){
		dao.removeRegiao(regiao);
		listaRegioes = dao.findRegioes();
		return "listaderegioes";
	}
	
}
