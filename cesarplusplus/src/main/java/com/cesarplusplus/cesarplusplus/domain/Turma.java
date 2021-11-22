package com.cesarplusplus.cesarplusplus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	@Column(length = 50, nullable = false)
	private String nome;

	//private Short professorId; //Fazer Relação entre a tabela Professor e turma ManyToMany
	//private Short alunoId; //Fazer Relação entre a tabela Aluno e turma ManyToMany
}
