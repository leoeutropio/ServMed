package MB;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import dao.ConsultaDao;
import dao.ConsultorioDao;
import dao.MedicoDao;
import dao.PacienteDao;
import dominio.Consulta;
import dominio.Consultorio;
import dominio.Medico;
import dominio.Paciente;

@Named(value = "controleConsulta")
@RequestScoped
public class ConsultaMB implements Serializable {
	@EJB
	ConsultaDao dao;
	
	@EJB
	ConsultorioDao cdao;
	@EJB
	MedicoDao mdao;
	@EJB
	PacienteDao pdao;
	
	private Integer consultorioId;
	private Integer medicoId;
	private Integer PacienteId;

	private Consulta consulta = new Consulta();
	private List<Consulta> cunsultalist = new ArrayList<>();
	private Consultorio consultorio = new Consultorio();
	private Medico medico = new Medico();
	private Paciente paciente = new Paciente();

	public Integer getConsultorioId(){
		return consultorioId;
	}

	public ConsultaDao getDao() {
		return dao;
	}

	public void setDao(ConsultaDao dao) {
		this.dao = dao;
	}

	public ConsultorioDao getCdao() {
		return cdao;
	}

	public void setCdao(ConsultorioDao cdao) {
		this.cdao = cdao;
	}

	public MedicoDao getMdao() {
		return mdao;
	}

	public void setMdao(MedicoDao mdao) {
		this.mdao = mdao;
	}

	public PacienteDao getPdao() {
		return pdao;
	}

	public void setPdao(PacienteDao pdao) {
		this.pdao = pdao;
	}

	public Integer getMedicoId() {
		return medicoId;
	}

	public void setMedicoId(Integer medicoId) {
		this.medicoId = medicoId;
	}

	public Integer getPacienteId() {
		return PacienteId;
	}

	public void setPacienteId(Integer pacienteId) {
		PacienteId = pacienteId;
	}

	public List<Consulta> getCunsultalist() {
		return cunsultalist;
	}

	public void setCunsultalist(List<Consulta> cunsultalist) {
		this.cunsultalist = cunsultalist;
	}

	public Consultorio getConsultorio() {
		return consultorio;
	}

	public void setConsultorio(Consultorio consultorio) {
		this.consultorio = consultorio;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public void setConsultorioId(Integer consultorioId) {
		this.consultorioId = consultorioId;
	}
	
	
	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public void remover(Consulta consulta){
		dao.remove(consulta);
	}
	public void clearObjects(){
		this.consulta = new Consulta();
	}
	
	public void addConsultorio(){
		this.consultorio = cdao.searchById(consultorioId);
		this.consulta.setLocal(consultorio);
		
	}
	
	public void addMedico(){
		this.medico = mdao.searchById(medicoId);
		this.consulta.setMedico(medico);
	}
	
	public void addPaciente(){
		this.paciente = pdao.searchById(PacienteId);
		this.consulta.setPaciente(paciente);
	}
	
	public void gravar(){
		addConsultorio();
		addMedico();
		addPaciente();
		dao.save(this.consulta);
		clearObjects();
	}
	
}
