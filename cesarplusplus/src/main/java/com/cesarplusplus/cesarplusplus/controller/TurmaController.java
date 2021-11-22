package com.cesarplusplus.cesarplusplus.controller;

import java.util.List;

import com.cesarplusplus.cesarplusplus.domain.Turma;
import com.cesarplusplus.cesarplusplus.repository.TurmaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/turma")
public class TurmaController {
	
	@Autowired
	private TurmaRepository turmaRepository;

	@PostMapping
	public Turma inserir(@RequestBody Turma turma) {
		Turma turmaSalva = turmaRepository.save(turma);
		return turmaSalva;
	}

	@PutMapping
	public Turma alterar(@RequestBody Turma turma) {
		if(turma.getId() > 0){
			Turma turmaAlterada = turmaRepository.save(turma);
			return turmaAlterada;
		}
		return null;
	}

	@GetMapping
	public List<Turma> listar(){
		return turmaRepository.findAll();
	}


}
