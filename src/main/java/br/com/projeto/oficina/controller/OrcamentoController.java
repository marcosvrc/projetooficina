package br.com.projeto.oficina.controller;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.projeto.oficina.service.OrcamentoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrcamentoController {

	@Autowired
	private OrcamentoService orcamentoService;
}
