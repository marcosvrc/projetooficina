package br.com.projeto.oficina.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cliente extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 3594709393127073463L;
	
	@Id	
	private Long id;
	private String email;
	

}
