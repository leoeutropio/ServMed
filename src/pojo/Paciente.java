package pojo;

public class Paciente {
	String nome;
	String plano;
	String email;
	int cpf;
	int idade;
	int telefone;
	
	public Paciente(){
		
	}
	
	public Paciente(String nome, String plano, int idade){
		this.nome = nome;
		this.plano = plano;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
