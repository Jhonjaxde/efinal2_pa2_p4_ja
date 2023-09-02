package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IMateriaRepository;
import com.example.demo.repository.modelo.Materia;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;
@Service
public class MateriaServiceImpl implements IMateriaService{
	@Autowired
	private IMateriaRepository materiaRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(Materia materia) {
		this.materiaRepository.ingresar(materia);
		
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public List<Materia> reporteLista() {
	
		return this.materiaRepository.seleccionarLista();
	}
	
}
