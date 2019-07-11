package br.com.projeto.oficina.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Orcamento extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -2111527171239380882L;
	
	@Id
	private Long id;
	private ZonedDateTime data;
	private Cliente cliente;
	private ProblemaReportado problemaRelatado;
	private Veiculo veiculo;
	private List<ItemOrcamento> itemsOrcamento;
	private BigDecimal valorTotal;
	
}
