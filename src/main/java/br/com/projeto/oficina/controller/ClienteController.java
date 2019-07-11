package br.com.projeto.oficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.oficina.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
}
