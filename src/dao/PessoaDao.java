package dao;
import java.util.ArrayList;
import java.util.List;

import dominio.Pessoa;

public class PessoaDao {
	public List<Pessoa> pessoas;
	
	
	public PessoaDao(){
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public PessoaDao(List<Pessoa> p){
		this.pessoas = p;
	}
	
	public boolean addPessoa(Pessoa p){
		if(this.searchByCPF(p.getCpf()) != null){
			this.pessoas.add(p);
			return true;
		}
		else
			return false;
	}
	
	public Pessoa searchByName(String n){
		for(Pessoa aux:pessoas){
			if(aux.getNome() == n){
				return aux; 
			}
		}
		return null;
	}
	
	public Pessoa searchByCPF(String cpf){
		for(Pessoa aux:pessoas){
			if(aux.getCpf() == cpf){
				return aux; 
			}
		}
		return null;
	}
	
	public void list(){
		System.out.println("------Lista de Pessoas----------------");
		for(Pessoa aux: this.pessoas){
			System.out.println(">>>Nome: " + aux.getNome());
			System.out.println(">>>CPF: " + aux.getCpf());
			System.out.println(">>>Email: " + aux.getEmail());
			System.out.println(">>>Endereço: " + aux.getEndereco());
			System.out.println(">>>Telefone: " + aux.getTelefone());
		}
	}
	
	public boolean remove(Pessoa p){
		return this.pessoas.remove(searchByCPF(p.getCpf()));
	}
	
	public void atualizarEmail(Pessoa p ,String email){
		this.searchByCPF(p.getCpf()).setEmail(email);
	}
	
	public void atualizarNome(Pessoa p ,String nome){
		this.searchByCPF(p.getCpf()).setNome(nome);
	}
	
	public void atualizarTelefone(Pessoa p ,String tel){
		this.searchByCPF(p.getCpf()).setTelefone(tel);
	}
	
	public void atualizarEndereco(Pessoa p ,String end){
		this.searchByCPF(p.getCpf()).setEndereco(end);
	}

}
