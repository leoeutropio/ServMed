package pojo;

public class Paciente extends Pessoa {

	String plano;

	public Paciente(){

	}

	public Paciente(String plano){
		super();
		this.plano = plano;

	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

}
