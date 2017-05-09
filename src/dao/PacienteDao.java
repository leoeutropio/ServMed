package dao;
import java.util.ArrayList;
import java.util.List;

import pojo.*;
public class PacienteDao {
	List<Paciente> clientes;
	
	public PacienteDao(){
		this.clientes = new ArrayList<Paciente>();
	}
	
	public PacienteDao(List<Paciente> c){
		this.clientes = c;
	}
	
	public void addPaciente(Paciente p){
		
	}
	
	public Paciente searchByPlano(Paciente p){
		for(Paciente aux:clientes){
			if(aux.getPlano() == p.getPlano()){
				return aux;
			}
		}
		return null;
	}
	
}
