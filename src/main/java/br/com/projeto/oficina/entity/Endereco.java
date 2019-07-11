package br.com.projeto.oficina.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Endereco extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 3877275124877175605L;
	
	@Id
	private Long id;
	private String logradouro;
	private String cep;
	private int numero;
	private String cidade;
	private String bairro;
	private String estado;
	
}
