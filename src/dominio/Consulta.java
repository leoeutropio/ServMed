package dominio;

import java.sql.Date;

public class Consulta{
    Consultorio local;
    Medico medico;
    Paciente paciente;
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

    public String getMedico(){
        return this.medico.getNome();
    }
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

    
}