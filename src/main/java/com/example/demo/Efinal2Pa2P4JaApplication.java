package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IMateriaService;

@SpringBootApplication
public class Efinal2Pa2P4JaApplication implements CommandLineRunner {
	@Autowired
	private IMateriaService materiaService;
	public static void main(String[] args)  {
		SpringApplication.run(Efinal2Pa2P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(this.materiaService.reporteLista());
	}

}
