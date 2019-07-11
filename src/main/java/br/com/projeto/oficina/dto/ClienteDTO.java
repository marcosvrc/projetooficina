package br.com.projeto.oficina.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ClienteDTO implements Serializable{
	
	private static final long serialVersionUID = -149100514885385084L;
	
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private EnderecoDTO enderecoDTO;

}
