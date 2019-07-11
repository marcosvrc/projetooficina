package br.com.projeto.oficina.entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Pessoa extends BaseEntity{
	
	private String nome;
	private String cpf;
	private String telefone;
}
