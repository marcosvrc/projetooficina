package br.com.projeto.oficina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.oficina.service.ServicoService;

@RestController
public class ServicoController {

	@Autowired
	private ServicoService servicoService;
}
