package com.connectmentor.aplicacao.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.connectmentor.aplicacao.entity.Mentor;
import com.connectmentor.aplicacao.service.FileService; // Importando o serviço FileService
import com.connectmentor.aplicacao.service.MentorService;

@Controller
@RequestMapping("/")
public class MentorController {

	@Autowired
	private MentorService service;

	@Autowired
	private FileService fileService; // Injetando o serviço FileService

	@GetMapping("CadastroMentor")
	public ModelAndView cadastro() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CadastroMentor");
		return mv;
	}

	@PostMapping("/inserirMentores")
	public String salvarMentor(@RequestParam("certificado") MultipartFile certificadoFile,
							   @RequestParam("nome") String nome,
							   @RequestParam("cpf") String cpf,
							   @RequestParam("email") String email,
							   @RequestParam("telefone") String telefone,
							   @RequestParam("senha") String senha,
							   @RequestParam("confirmPassword") String confirmPassword,
							   @RequestParam("genero") Integer genero) throws IOException {
		Mentor mentor = new Mentor();
		mentor.setNome(nome);
		mentor.setCpf(cpf);
		mentor.setEmail(email);
		mentor.setTelefone(telefone);
		mentor.setSenha(senha);
		mentor.setGenero(genero);

		if (!certificadoFile.isEmpty()) {
			byte[] certificadoBytes = certificadoFile.getBytes();
			mentor.setCertificado(certificadoBytes);
		}

		service.insHabMentor(mentor);

		// Salvar a imagem no diretório desejado usando o serviço FileService
		String savedFileName = fileService.addImage(certificadoFile.getOriginalFilename(), certificadoFile.getBytes(), "C:\\Users\\Felipe Senna\\Documents\\imagensProj");

		return "redirect:index";
	}

	@GetMapping("index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

	@GetMapping("/logarMentor")
	public String logar(@RequestParam("email") String email, @RequestParam("senha") String senha) {
		Mentor mentor =  service.buscarPorEmail(email);

		if(mentor == null) {
			return "redirect:/againLogin";
		}

		if(!mentor.getSenha().equals(senha)) {
			return "redirect:/againLogin";
		} else {
			return "redirect:/perfilMentor/"+mentor.getIdMentor();
		}
	}

	@GetMapping("login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}

	@GetMapping("perfilMentor/{idMentor}")
	public ModelAndView perfilMentor(@PathVariable Integer idMentor) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("perfilMentor");
		return mv;
	}

	@GetMapping("againLogin")
	public ModelAndView againLogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("againLogin");
		return mv;
	}

	@PostMapping("/atualizarFotoMentor")
	public String atualizarFotoMentor(@RequestParam("foto") MultipartFile file, @RequestParam("idMentor") Long idMentor) {
		if (!file.isEmpty()) {
			try {
				byte[] fotoBytes = file.getBytes();
				service.atualizarFotoMentor(idMentor, fotoBytes);
				return "redirect:/perfilMentor/" + idMentor;
			} catch (IOException e) {
				e.printStackTrace();
				return "erro";
			}
		} else {
			return "erro";
		}
	}
}
