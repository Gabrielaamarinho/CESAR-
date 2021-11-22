package com.cesarplusplus.cesarplusplus.controller;

import java.util.List;

import com.cesarplusplus.cesarplusplus.domain.Disciplina;
import com.cesarplusplus.cesarplusplus.repository.DisciplinaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;

	@PostMapping
	public Disciplina inserir(@RequestBody Disciplina disciplina) {
		Disciplina disciplinaSalva = disciplinaRepository.save(disciplina);
		return disciplinaSalva;
	}

	@PutMapping
	public Disciplina alterar(@RequestBody Disciplina disciplina) {
		if(disciplina.getId() > 0){
			Disciplina disciplinaAlterada = disciplinaRepository.save(disciplina);
			return disciplinaAlterada;
		}
		return null;
	}

	@GetMapping
	public List<Disciplina> listar(){
		return disciplinaRepository.findAll();
	}

}
