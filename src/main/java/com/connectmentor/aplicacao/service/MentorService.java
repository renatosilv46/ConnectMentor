package com.connectmentor.aplicacao.service;

// Importações necessárias
import java.io.IOException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.connectmentor.aplicacao.entity.Mentor;
import com.connectmentor.aplicacao.repository.MentorRepository;
import org.springframework.web.multipart.MultipartFile;

// Declaração do serviço MentorService
@Service

public class MentorService {

	// Injeção de dependência do repositório MentorRepository
	@Autowired
	private MentorRepository mentorRepository;
	@Autowired
	private FileService fileservice;


	// Método para inserir ou atualizar um mentor no banco de dados
	public String insHabMentor(Mentor mentor) {
		this.mentorRepository.save(mentor);
		return "redirect:index";
	}

	// Método para salvar um mentor no banco de dados

	public void salvarMentor(Mentor mentor, MultipartFile certificadoFile) throws IOException {
		if (certificadoFile != null && !certificadoFile.isEmpty()) {
			String fileName = "certificado_" + System.currentTimeMillis() + ".pdf"; // Nome do arquivo com timestamp para evitar conflitos
			String filePath = "C:\\Users\\Felipe Senna\\Documents\\imagensProj"; // Diretório onde os certificados serão salvos
			String certificadoPath = fileservice.addImage(fileName, certificadoFile.getBytes(), filePath);
			mentor.setCertificadoPath(certificadoPath); // Define o caminho completo do certificado no objeto Mentor
		}
		mentorRepository.save(mentor);
	}



	// Método para buscar um mentor por ID
	public Mentor buscarIdMentor(Long idMentor) {
		Optional<Mentor> mentor = mentorRepository.findById(idMentor);
		return mentor.orElse(null);
	}

	// Método para buscar um mentor por e-mail
	public Mentor buscarPorEmail(String email) {
		Optional<Mentor> mentor = mentorRepository.findByEmail(email);
		return mentor.orElse(null);
	}

	// Método para buscar um mentor por senha
	public Mentor buscarPorSenha(String senha) {
		Optional<Mentor> mentor = mentorRepository.findBySenha(senha);
		return mentor.orElse(null);
	}

	// Método para atualizar a foto de um mentor
	public void atualizarFotoMentor(Long idMentor, byte[] fotoBytes) {
		// Converta o idMentor para Long
		Long idMentorLong = idMentor.longValue();

		// Busque o mentor pelo ID
		Mentor mentor = mentorRepository.findById(idMentorLong).orElse(null);

		// Verifique se o mentor existe
		if (mentor != null) {
			// Atualize a foto do mentor
			mentor.setFoto(fotoBytes);

			// Salve as mudanças no banco de dados
			mentorRepository.save(mentor);
		}
	}
}
