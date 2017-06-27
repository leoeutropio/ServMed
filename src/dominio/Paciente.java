package dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SEQ_PACIENTE", initialValue = 1, allocationSize = 1, sequenceName = "seq_paciente")
public class Paciente extends Pessoa implements Serializable{
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PACIENTE")
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
