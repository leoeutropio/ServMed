package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Paciente extends Pessoa implements Serializable{
	@Column(name = "id_Paciente")
	private int id;
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
