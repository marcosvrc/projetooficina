package br.com.projeto.oficina.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Orcamento extends BaseEntity implements Serializable{

	private static final long serialVersionUID = -2111527171239380882L;
	
	@Id
	private Long id;
	private ZonedDateTime data;
	
	@OneToOne
	private Cliente cliente;
	
	@OneToOne
	private ProblemaReportado problemaRelatado;
	
	@OneToOne
	private Veiculo veiculo;
	
	@OneToMany
	private List<ItemOrcamento> itemsOrcamento;
	private BigDecimal valorTotal;
	
}
