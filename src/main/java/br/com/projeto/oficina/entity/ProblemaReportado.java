package br.com.projeto.oficina.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class ProblemaReportado extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 2530904405246523420L;
	
	@Id
	private Long id;
	
	@OneToOne
	private Veiculo veiculo;
	
	@OneToOne
	private Cliente cliente;
	
	private String descricao;

}
