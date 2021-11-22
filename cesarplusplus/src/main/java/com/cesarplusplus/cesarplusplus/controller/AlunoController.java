package com.cesarplusplus.cesarplusplus.controller;

import java.util.List;

import com.cesarplusplus.cesarplusplus.domain.Aluno;
import com.cesarplusplus.cesarplusplus.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;

	@PostMapping
	public Aluno inserir(@RequestBody Aluno aluno) {
		Aluno alunoSalvo = alunoRepository.save(aluno);
		return alunoSalvo;
	}

	@PutMapping
	public Aluno alterar(@RequestBody Aluno aluno) {
		if(aluno.getId() > 0){
			Aluno alunoAlterado = alunoRepository.save(aluno);
			return alunoAlterado;
		}
		return null;
	}

	@GetMapping
	public List<Aluno> listar(){
		return alunoRepository.findAll();
	}
}
