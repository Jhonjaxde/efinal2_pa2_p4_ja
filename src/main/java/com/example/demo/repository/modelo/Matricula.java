package com.example.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "matricula")
public class Matricula {
	@SequenceGenerator(name="seq_matricula", sequenceName = "seq_matricula", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_matricula")
	
	@Id
	@Column(name = "matri_id")
	private Integer id;
	@Column(name = "matri_fechamatricula")
	private LocalDateTime fechaMatricula;
	@Column(name = "matri_hilo")
	private String hilo;
	
	@OneToMany(mappedBy = "matricula", fetch = FetchType.EAGER)
	private List<Materia> materias;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaMtricula() {
		return fechaMatricula;
	}

	public void setFechaMtricula(LocalDateTime fechaMtricula) {
		this.fechaMatricula = fechaMtricula;
	}

	public String getHilo() {
		return hilo;
	}

	public void setHilo(String hilo) {
		this.hilo = hilo;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	@Override
	public String toString() {
		return "Matricula [id=" + id + ", fechaMtricula=" + fechaMatricula + ", hilo=" + hilo + ", materias=" + materias
				+ "]";
	}
	
	
	
}
