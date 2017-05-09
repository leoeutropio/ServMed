package dao;

import pojo.Medico;
import java.util.ArrayList;
import java.util.List;

public class MedicoDao {
	public List<Medico> medicos;
	
	public MedicoDao(){
		this.medicos = new ArrayList<Medico>();
	}
	
	public MedicoDao(List<Medico> m){
		this.medicos = m;
	}
	
	public Medico searchByCRM(String crm){
		for(Medico aux:medicos){
			if(aux.getCrm() == crm){
				return aux;
			}
		}
		return null;
	}
	
	public boolean addMedico(Medico m){
		if(this.searchByCRM(m.getCrm()) != null){
			this.medicos.add(m);
			return true;
		}
		else
			return false;
	}
	
}
