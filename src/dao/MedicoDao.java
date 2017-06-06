package dao;

import pojo.Medico;
import pojo.Pessoa;

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
	
	public void list(){
		System.out.println("------Lista de Medicos----------------");
		for(Medico aux: this.medicos){
			System.out.println(">>>Nome: " + aux.getNome());
			System.out.println(">>>CPF: " + aux.getCrm());
			System.out.println(">>>Email: " + aux.getEmail());
			System.out.println(">>>Endereço: " + aux.getEndereco());
			System.out.println(">>>Telefone: " + aux.getTelefone());
		}
	}
	
	public boolean removeMedico(Medico aux){
		return this.medicos.remove(searchByCRM(aux.getCrm()));
	}
	
}
