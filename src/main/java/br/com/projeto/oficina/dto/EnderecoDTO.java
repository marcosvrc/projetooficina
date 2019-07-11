package br.com.projeto.oficina.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EnderecoDTO implements Serializable {
	
	private static final long serialVersionUID = -1268077443184093913L;
	
	private String logradouro;
	private String cep;
	private String numero;
	private String cidade;
	private String estado;

}
