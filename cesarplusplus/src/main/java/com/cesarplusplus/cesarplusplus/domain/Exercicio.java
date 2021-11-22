package com.cesarplusplus.cesarplusplus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Exercicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short exercicioId;
	
	@Column(length = 60, nullable = false)
	private String assunto;
	
	@Column(length = 50, nullable = false)
	private String tema;
	
	@Column(length = 50, nullable = false)
	private String nivelQuestao;	//transformar pra Enum

	@Column(length = 255, nullable = false)
	private String textoQuestao;

}
