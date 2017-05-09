package dao;
import java.util.ArrayList;
import java.util.List;

import pojo.*;
public class PacienteDao {
	public List<Paciente> clientes;
	
	public PacienteDao(){
		this.clientes = new ArrayList<Paciente>();
	}
	
	public PacienteDao(List<Paciente> c){
		this.clientes = c;
	}
	
	public boolean addPaciente(Paciente p){
		if(this.searchByPlano(p.getPlano()) != null){
			this.clientes.add(p);
			return true;
		}
		else
			return false;
	}
	
	public Paciente searchByPlano(String p){
		for(Paciente aux:clientes){
			if(aux.getPlano() == p){
				return aux;
			}
		}
		return null;
	}
	
	public void remove(Paciente p){
		this.clientes.remove(searchByPlano(p.getPlano()));
	}
	
}
