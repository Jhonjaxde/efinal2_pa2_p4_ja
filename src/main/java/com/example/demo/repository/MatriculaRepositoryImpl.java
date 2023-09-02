package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void ingresar(Matricula matricula) {
		this.entityManager.persist(matricula);
		
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<Matricula> seleccionarLista() {
		Query myquery =
				this.entityManager.createQuery("SELECT matri FROM matricula matri",Matricula.class);
		return myquery.getResultList();
	}
	
}
