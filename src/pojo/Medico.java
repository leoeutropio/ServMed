package pojo;

public class Medico {
	String nome;
	String crm;
	String especializacao;
	String email;
	String expediente;
	String endereco;
	int cpf;
	int idade;
	int telefone;
	
	
	public Medico (){
		
	}
	
	public Medico (String nome, String crm, String especializacao, String email, String expediente,
			int idade, int telefone,int cpf){
		this.nome = nome;
		this.crm = crm;
		this.especializacao = especializacao;
		this.email = email;
		this.expediente = expediente;
		this.idade = idade;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
}
