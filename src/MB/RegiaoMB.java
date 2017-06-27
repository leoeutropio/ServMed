package MB;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.RegiaoDao;
import dominio.Regiao;

@Named(value = "controleRegiao")
@RequestScoped
public class RegiaoMB {
	@EJB
	RegiaoDao dao;

	private Regiao regiao = new Regiao();

	
	
	public Regiao getregiao() {
		return regiao;
	}

	public void setregiao(Regiao regiao) {
		this.regiao = regiao;
	}

	private void clearObjects() {
		this.regiao = new Regiao();

	}
	
	
	public List<Regiao> getregiaos(){
		return dao.listarregiao();
	}
	
	public List<Regiao> getListaregiaos(){
		return this.getregiaos();
	}

	public void gravar(){
		
		dao.save(regiao);
		clearObjects();
		
		
	}

	
}
