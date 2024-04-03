package com.connectmentor.aplicacao.repository;

<<<<<<< HEAD
// Importações necessárias
import java.util.Optional;
=======
<<<<<<< HEAD
// Importações necessárias
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.connectmentor.aplicacao.entity.Mentor;

// Declaração da interface do repositório
@Repository
public interface MentorRepository extends JpaRepository<Mentor, Long> {

	// Método para encontrar um mentor por e-mail
	Optional<Mentor> findByEmail(String email);

	// Método para encontrar um mentor por senha
	Optional<Mentor> findBySenha(String senha);

	// Método para encontrar um mentor por ID
	Optional<Mentor> findById(Long id);
}
=======
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.connectmentor.aplicacao.entity.Mentor;

// Declaração da interface do repositório
@Repository
<<<<<<< HEAD
public interface MentorRepository extends JpaRepository<Mentor, Long> {

	// Método para encontrar um mentor por e-mail
	Optional<Mentor> findByEmail(String email);

	// Método para encontrar um mentor por senha
	Optional<Mentor> findBySenha(String senha);
=======
public interface MentorRepository extends JpaRepository<Mentor, Long>{
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74

	// Método para encontrar um mentor por ID
	Optional<Mentor> findById(Long id);
}
<<<<<<< HEAD
=======






>>>>>>> 9d724b30d64a5a16f09b2d17ea263a6d4f85ab1b
>>>>>>> 64f229c850283574f4a3e52660693edd3a9c0d74
