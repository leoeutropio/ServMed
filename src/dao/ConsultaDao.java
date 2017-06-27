package dao;


import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dominio.Consulta;

@Stateless
public class ConsultaDao {
	@PersistenceContext(unitName="ServMed")
	private EntityManager manager;
	
	
	public Consulta save(Consulta consulta){
		try{
			manager.persist(consulta);
			System.out.println("consulta persistida com sucesso!");
		}catch(Exception e){
			e.printStackTrace();
		}
		return consulta;
	}
	
	public List<Consulta> listarConsulta(){
		TypedQuery<Consulta> query = manager.createQuery("Selected c from Consulta c", Consulta.class);
		List<Consulta> consultas = query.getResultList();
		return consultas;
	}
	
	public Consulta searchById(Integer id){
		Consulta consulta = manager.find(Consulta.class, id);
		return consulta;
	}

}
