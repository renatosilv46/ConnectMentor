package com.connectmentor.aplicacao.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Pretensao")
public class Pretensao {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idPretensao")
private Long idPretensao;
<<<<<<< HEAD
private String nomePretensao;
=======
>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
//Constructors
public Pretensao() {
	
}
	public Pretensao(Long idPretensao) {
		super();
		this.idPretensao = idPretensao;
	}
	
	//Getters and Setters
	
	public Long getIdPretensao() {
		return idPretensao;
	}
<<<<<<< HEAD
	
	public void setIdPretensao(Long idPretensao) {
		this.idPretensao = idPretensao;
	}
	public Pretensao(String nomePretensao) {
		super();
		this.nomePretensao = nomePretensao;
	}
	
	
=======
	public void setIdPretensao(Long idPretensao) {
		this.idPretensao = idPretensao;
	}
>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	
	
	
}
