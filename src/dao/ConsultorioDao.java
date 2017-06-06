package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.Consultorio;

public class ConsultorioDao {
	List<Consultorio> consultorios;
	
	public ConsultorioDao(){
		this.consultorios = new ArrayList<Consultorio>();
	}
	
	
	public Consultorio searchConsultorio(Consultorio a){
		for(Consultorio aux:this.consultorios){
			if(aux.equals(aux))
				return aux;
		}
		return null;
	}
	
	public boolean addConsultorio(Consultorio a){
		if(searchConsultorio(a) == null){
			this.consultorios.add(a);
			return true;
		}
		return false;
	}
	
	public boolean removeConsultorio(Consultorio a){
		return this.consultorios.remove(searchConsultorio(a));
	}
}
