package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "materia")
public class Materia {
	@SequenceGenerator(name="seq_materia", sequenceName = "seq_materia", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_materia")
	@Id
	@Column(name ="mate_id")
	private Integer id;
	@Column(name = "mate_nombre")
	private String nombre;
	@Column(name = "mate_codigo")
	private String codigo;
	@Column(name = "mate_numeroCreditos")
	private String numeroCreditos;
	@Column(name = "mate_cedulaprofesor")
	private String cedulaProfesor;
	
	
	@ManyToOne
	@JoinColumn(name = "mate_id_matri")
	private Matricula matricula;
	
	@ManyToOne
	@JoinColumn(name = "mate_id_estu")
	private Estudiante estudiante;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNumeroCreditos() {
		return numeroCreditos;
	}

	public void setNumeroCreditos(String numeroCreditos) {
		this.numeroCreditos = numeroCreditos;
	}

	public String getCedulaProfesor() {
		return cedulaProfesor;
	}

	public void setCedulaProfesor(String cedulaProfesor) {
		this.cedulaProfesor = cedulaProfesor;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", numeroCreditos=" + numeroCreditos
				+ ", cedulaProfesor=" + cedulaProfesor + ", matricula=" + matricula + ", estudiante=" + estudiante
				+ "]";
	}
	
	
	
}
