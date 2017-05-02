
public class Medico {
	String nome;
	String crm;
	String especializacao;
	
	public Medico (){
		
	}
	
	public Medico (String nome, String crm, String especializacao){
		this.nome = nome;
		this.crm = crm;
		this.especializacao = especializacao;
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
