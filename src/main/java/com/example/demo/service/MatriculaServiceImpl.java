package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMatriculaRepository;
import com.example.demo.repository.modelo.Matricula;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class MatriculaServiceImpl implements IMatriculaRepository {
	
	@Autowired
	private IMatriculaRepository matriculaRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void ingresar(Matricula matricula) {
		this.matriculaRepository.ingresar(matricula);
		
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public List<Matricula> seleccionarLista() {
		
		return this.matriculaRepository.seleccionarLista();
	}
	
	
}
