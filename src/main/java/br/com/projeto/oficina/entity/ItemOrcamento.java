package br.com.projeto.oficina.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ItemOrcamento implements Serializable {
	
	private static final long serialVersionUID = 850348713681411878L;
	
	@Id
	private Long id;
	private Servico service;
	private int quantity;
	private BigDecimal subTotal;

}
