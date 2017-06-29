package dominio;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@SequenceGenerator(name = "SEQ_CONSULTA", initialValue = 1, allocationSize = 1, sequenceName = "seq_consulta")
public class Consulta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONSULTA")
    @Column(name = "id_Cautela")
	private int id;
	
    Consultorio local;
    Medico medico;
    Paciente paciente;
   // @Temporal(TemporalType.DATE)
    Date horario;
    boolean agendada;
    String avaliacao;

    public Consulta(){}

    public Consulta(Consultorio local, Medico medico, Date horario, boolean agendada){
        this.local = local;
        this.medico = medico;
        this.horario = horario;
        this.agendada = agendada;
    }

    public String getLocal(){
        return this.local.getNome() + local.getEndereco();
    }
    public void setLocal(Consultorio local){
        this.local = local;
    }

   // public String getMedico(){
     //   return this.medico.getNome();
    //}
    public void setMedico(Medico medico){
        this.medico = medico;
    }
    public Date getHorario(){
        return this.horario;
    }
    public void setHorario(Date horario){
        this.horario = horario;
    }
    public boolean isAgendada(){
        return agendada;
    }
    public void setAgendad(boolean agendada){
        this.agendada = agendada;
    }
    public Paciente getPaciente(){
        return this.paciente;
    }
    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public void setAgendada(boolean agendada) {
		this.agendada = agendada;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
}