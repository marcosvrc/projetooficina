package br.com.projeto.oficina.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.projeto.oficina.service.ProblemaRelatadoService;

@RestController
public class ProblemRelatadoController {

	@Autowired
	private ProblemaRelatadoService problemaRelatadoService;
	
}
