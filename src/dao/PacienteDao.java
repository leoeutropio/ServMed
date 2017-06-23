package dao;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import dominio.*;
public class PacienteDao {
	public List<Paciente> clientes;
	private EntityManager entityManager;
	
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
	
	public List<Paciente> findPacientes() {
		TypedQuery<Paciente> query = entityManager.createNamedQuery("findAllPacientes", Paciente.class);
		return query.getResultList();
	}
	
	public void list(){
		System.out.println("------Lista de Pacientes----------------");
		for(Paciente aux: this.clientes){
			System.out.println(">>>Nome: " + aux.getNome());
			System.out.println(">>>CPF: " + aux.getCpf());
			System.out.println(">>>Email: " + aux.getEmail());
			System.out.println(">>>Endereço: " + aux.getEndereco());
			System.out.println(">>>Telefone: " + aux.getTelefone());
		}
	}
	
	public boolean remove(Paciente p){
		return this.clientes.remove(searchByPlano(p.getPlano()));
	}
	
}
