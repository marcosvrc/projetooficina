package br.com.projeto.oficina.controller;

import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.oficina.service.VeiculoService;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;
	
}
