package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Materia;

public interface IMateriaRepository {
	
	public void ingresar(Materia materia);
	public List<Materia> seleccionarLista();
}
