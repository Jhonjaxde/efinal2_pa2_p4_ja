package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Matricula;

public interface IMatriculaRepository {
	public void ingresar(Matricula matricula);
	public List<Matricula> seleccionarLista();
}
