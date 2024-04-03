package com.connectmentor.aplicacao.repository;

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
