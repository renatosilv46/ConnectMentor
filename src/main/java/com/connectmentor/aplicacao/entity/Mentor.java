package com.connectmentor.aplicacao.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

<<<<<<< HEAD
@Entity // Indica que esta classe é uma entidade JPA
@Table(name="Mentor") // Especifica o nome da tabela no banco de dados
public class Mentor implements Serializable {
	private static final long serialVersionUID = 1L; // Número de versão da serialização

	@Id // Indica que este campo é a chave primária da entidade
	@GeneratedValue(strategy= GenerationType.IDENTITY) // Geração automática do valor do ID
	private Long idMentor; // ID do mentor

	// Demais atributos do mentor
	private String nome; // Nome do mentor
	private String cpf; // CPF do mentor
	private Integer genero; // Gênero do mentor (pode ser um código ou enum)
	private Date datanasc; // Data de nascimento do mentor
	private String senha; // Senha do mentor
	private String email; // E-mail do mentor
	private String telefone; // Número de telefone do mentor
	private String biografia; // Biografia do mentor
	private byte[] certificado; // Certificado do mentor (em formato de bytes)
	private byte[] foto; // Foto do mentor (em formato de bytes)

	// Construtor padrão vazio
	public Mentor() {
	}

	// Getters e Setters para os atributos da classe

	public Long getIdMentor() {
		return idMentor;
	}

	public void setIdMentor(Long idMentor) {
		this.idMentor = idMentor;
	}

=======
@Entity
@Table(name="Mentor")
public class Mentor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer idMentor;
	private String nome;
	private String cpf;
	private Integer genero;
	private Date datanasc;
	private String senha;
	private String email;
	private String telefone;
	private String biografia;
	private byte[] certificado;
	private byte[] foto;
	
	
	
	public Mentor() {
		
	}



	public Integer getIdMentor() {
		return idMentor;
	}



	public void setIdMentor(Integer idMentor) {
		this.idMentor = idMentor;
	}



>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public String getNome() {
		return nome;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public void setNome(String nome) {
		this.nome = nome;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public String getCpf() {
		return cpf;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public Integer getGenero() {
		return genero;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public void setGenero(Integer genero) {
		this.genero = genero;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public Date getDatanasc() {
		return datanasc;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public String getSenha() {
		return senha;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public void setSenha(String senha) {
		this.senha = senha;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public String getEmail() {
		return email;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public String getTelefone() {
		return telefone;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public String getBiografia() {
		return biografia;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public byte[] getCertificado() {
		return certificado;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public void setCertificado(byte[] certificado) {
		this.certificado = certificado;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public byte[] getFoto() {
		return foto;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

<<<<<<< HEAD
	public void setCertificadoPath(String certificadoPath) {
	}
=======


	
	
	
	
	

	
>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
}
