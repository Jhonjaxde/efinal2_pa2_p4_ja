package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.service.IMatriculaService;
@Controller
@RequestMapping("/matriculas")
public class MatriculaController {
	//@Autowired
	private IMatriculaService matriculaService;
	
	
	//http://localhost:8080/Matriculacion/materias/guardar
	@PostMapping("/guardar")
	public String paginaGuardar(Matricula matricula) {
		this.matriculaService.guardar(matricula);
		return "redirect:/matricula/buscar";
	}
	
	
	
	@GetMapping("/buscar")
	public String paginaBuscar(Model modelo) {
		List<Matricula> listaMatricula = this.matriculaService.reporteLista();
		modelo.addAttribute("matriculas",listaMatricula);
		return "vistaListaMatricula";
	}
	
	@GetMapping("/nuevo")
	public String paginaRedirec(Matricula matricula) {
		return "vistaGuardarMatricula";
	}
	
}
