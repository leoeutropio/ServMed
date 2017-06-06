package dominio;

public class Medico extends Pessoa {

	String crm;
	String especializacao;
	String expediente;

	public Medico (){

	}

	public Medico (String crm, String especializacao, String expediente){
		super();
		this.crm = crm;
		this.especializacao = especializacao;
		this.expediente = expediente;
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

	public String getExpediente(){
		return this.expediente;
	}

	public void setExpediente(String expediente){
		this.expediente = expediente;
	}

}
