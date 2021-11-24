package com.cesarplusplus.cesarplusplus.controller;

import java.util.List;

import com.cesarplusplus.cesarplusplus.domain.Professor;
import com.cesarplusplus.cesarplusplus.repository.ProfessorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/professor")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ProfessorController {
	
	@Autowired
	private ProfessorRepository professorRepository;

	@PostMapping
	public Professor inserir(@RequestBody Professor professor) {
		Professor professorSalvo = professorRepository.save(professor);
		return professorSalvo;
	}

	@PutMapping
	public Professor alterar(@RequestBody Professor professor) {
		if(professor.getProfessorId() > 0){
			Professor professorSalvo = professorRepository.save(professor);
			return professorSalvo;
		}
		return null;
	}

	@GetMapping
	public List<Professor> listar(){
		return professorRepository.findAll();
	}


}
