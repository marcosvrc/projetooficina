package br.com.projeto.oficina.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Veiculo extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 3242917311949702816L;
	
	@Id
	private Long id;
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private String placa;
	private Cliente proprietario;

}
