package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void ingresar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
		
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Estudiante> seleccionarLista() {
		Query myquery = 
				this.entityManager.createQuery("SELECT estu FROM estudiante estu ",Estudiante.class);
		return myquery.getResultList();
	}

}
