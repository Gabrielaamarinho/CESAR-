package com.cesarplusplus.cesarplusplus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PROFESSOR")
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short professorId;
	
	@Column(length = 150, nullable = false)
	private String nomeCompleto;

	@Column(length = 20, nullable = false)
	private String username;

	@Column(length = 100, nullable = false)
	private String email;

	@Column(length = 50, nullable = false)
	private String senha;

}
