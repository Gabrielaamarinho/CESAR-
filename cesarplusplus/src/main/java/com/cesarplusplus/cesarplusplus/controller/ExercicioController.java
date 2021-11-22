package com.cesarplusplus.cesarplusplus.controller;


import java.util.List;

import com.cesarplusplus.cesarplusplus.domain.Exercicio;
import com.cesarplusplus.cesarplusplus.repository.ExercicioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercicio")
public class ExercicioController {
	
	@Autowired
	private ExercicioRepository exercicioRepository;

	@PostMapping
	public Exercicio inserir(@RequestBody Exercicio exercicio) {
		Exercicio exercicioSalvo = exercicioRepository.save(exercicio);
		return exercicioSalvo;
	}

	@PutMapping
	public Exercicio alterar(@RequestBody Exercicio exercicio) {
		if(exercicio.getExercicioId() > 0){
			Exercicio exercicioAlterado = exercicioRepository.save(exercicio);
			return exercicioAlterado;
		}
		return null;
	}

	@GetMapping
	public List<Exercicio> listar(){
		return exercicioRepository.findAll();
	}
}
