package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Materia;
import com.example.demo.service.IMateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController{
	//@Autowired
	private IMateriaService materiaService;
	//http://localhost:8080/Matriculacion/materias/guardar
	@PostMapping("/guardar")
	public String paginaGuardar(Materia materia) {
		this.materiaService.guardar(materia);
		return "redirect:/materias/buscar";
	}
	
	
	@GetMapping("/buscar")
	public String paginaBuscar(Model modelo){
		List<Materia> listaMateria = this.materiaService.reporteLista();
		modelo.addAttribute("materias",listaMateria);
		return "vistaListaMateria";
	}
	
	@GetMapping("/nuevo")
	public String paginaRedirec(Materia materia) {
		return "vistaGuardarMateria";
	}
}
