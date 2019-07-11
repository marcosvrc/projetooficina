package br.com.projeto.oficina.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Servico {
	
	@Id
	private Long id;
	private BigDecimal preco;
	private String descricao;

}
