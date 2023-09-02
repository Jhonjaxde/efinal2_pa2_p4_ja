package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	//@Autowired
	private IEstudianteService estudianteService;
	//para guardar 
	@PostMapping("/guardar")
	public String paginaGuardar(Estudiante estudiante) {
		this.estudianteService.guardar(estudiante);
		return "redict://estudiantes/buscar";
	}
	//reporte
	@GetMapping("/buscar")
	public String paginaBuscar(Model modelo) {
	
		List<Estudiante> listaEstudiante = this.estudianteService.reporteLista();
		modelo.addAttribute("estudiantes",listaEstudiante);
		return "vistaListaEstudiante";
	}
	//pagina de redireccionamiento
	
	@GetMapping("/nuevo")
	public String paginaRedirec(Estudiante estudiante) {
		return "vistaGuardarEstudiante";
	}
}
