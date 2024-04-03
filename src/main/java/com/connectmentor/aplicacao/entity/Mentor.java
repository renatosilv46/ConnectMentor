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
=======
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
	
	
	
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public Mentor() {
	}

	// Getters e Setters para os atributos da classe

	public Long getIdMentor() {
		return idMentor;
	}

	public void setIdMentor(Long idMentor) {
		this.idMentor = idMentor;
	}

<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public String getNome() {
		return nome;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public void setNome(String nome) {
		this.nome = nome;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public String getCpf() {
		return cpf;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public Integer getGenero() {
		return genero;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public void setGenero(Integer genero) {
		this.genero = genero;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public Date getDatanasc() {
		return datanasc;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public String getSenha() {
		return senha;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public void setSenha(String senha) {
		this.senha = senha;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public String getEmail() {
		return email;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public void setEmail(String email) {
		this.email = email;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public String getTelefone() {
		return telefone;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public String getBiografia() {
		return biografia;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public byte[] getCertificado() {
		return certificado;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public void setCertificado(byte[] certificado) {
		this.certificado = certificado;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public byte[] getFoto() {
		return foto;
	}

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======


>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

<<<<<<< HEAD
	public void setCertificadoPath(String certificadoPath) {
	}
=======
<<<<<<< HEAD
	public void setCertificadoPath(String certificadoPath) {
	}
=======


	
	
	
	
	

	
>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
}
