package com.connectmentor.aplicacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.servlet.ModelAndView;




import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.connectmentor.aplicacao.entity.Mentor;
import com.connectmentor.aplicacao.service.MentorService;



@Controller	
@RequestMapping("/")
public class MentorController {
	
	@Autowired
	private MentorService service;
	

	@GetMapping("/")
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;	
	
}

	

	@PostMapping("/inserirMentorados")
	public ModelAndView inserirMentorado(@RequestParam Integer id, @RequestParam String nome, @RequestParam boolean pretensao1, @RequestParam boolean pretensao2) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		
		Mentor mentor = new Mentor();
		mentor.setId(id);
		mentor.setNome(nome);
		mentor.setPretensao1(pretensao1);
		mentor.setPretensao2(pretensao2);
		service.insHabMentor(mentor);
		return mv;
		
	}
	
	
	

	
	
}
