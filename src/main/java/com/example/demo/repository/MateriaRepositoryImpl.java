package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MateriaRepositoryImpl implements IMateriaRepository{
@PersistenceContext
private EntityManager entityManager;

@Override
@Transactional(value = TxType.MANDATORY)
public void ingresar(Materia materia) {
	this.entityManager.persist(materia);
	
}

@Override
@Transactional(value = TxType.NOT_SUPPORTED)
public List<Materia> seleccionarLista() {
	Query myquery = this.entityManager.createQuery("SELECT mate FROM materia mate",Materia.class);
	return myquery.getResultList();
}

}
