package dao;

import java.util.ArrayList;
import java.util.List;

import dominio.Consulta;

public class ConsultaDao {
	List<Consulta> consultas;
	
	public ConsultaDao(){
		this.consultas = new ArrayList<Consulta>();
	}
	
	public Consulta searchConsulta(Consulta a){
		for(Consulta aux:this.consultas){
			if(aux.equals(aux))
				return aux;
		}
		return null;
	}
	
	public boolean addConsulta(Consulta a){
		if(searchConsulta(a) == null){
			this.consultas.add(a);
			return true;
		}
		return false;
	}
	
	public boolean removeConsulta(Consulta a){
		return this.consultas.remove(searchConsulta(a));	}
	
	public void listConsulta(){
		for(Consulta aux: this.consultas){
			System.out.println("-------------------------");
			System.out.println(aux.getLocal());
			System.out.println(aux.getMedico());
			System.out.println(aux.getHorario());
			System.out.println(aux.getPaciente());
		}
	}

}
