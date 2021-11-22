package com.cesarplusplus.cesarplusplus.controller;

import java.util.List;

import com.cesarplusplus.cesarplusplus.domain.Atividade;
import com.cesarplusplus.cesarplusplus.repository.AtividadeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade")
public class AtividadeController {
	
	@Autowired
	private AtividadeRepository atividadeRepository;

	@PostMapping
	public Atividade inserir(@RequestBody Atividade atividade) {
		Atividade atividadeSalva = atividadeRepository.save(atividade);
		return atividadeSalva;
	}

	@PutMapping
	public Atividade alterar(@RequestBody Atividade atividade) {
		if(atividade.getAtividadeId() > 0){
			Atividade atividadeAlterada = atividadeRepository.save(atividade);
			return atividadeAlterada;
		}
		return null;
	}

	@GetMapping
	public List<Atividade> listar(){
		return atividadeRepository.findAll();
	}
}
