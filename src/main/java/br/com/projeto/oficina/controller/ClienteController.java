package br.com.projeto.oficina.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.oficina.dto.ClienteDTO;
import br.com.projeto.oficina.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping(value="/v1/cliente")
	public void cadastrarClient(@Valid @RequestBody ClienteDTO clienteDTO) {
		
	}
	
}
