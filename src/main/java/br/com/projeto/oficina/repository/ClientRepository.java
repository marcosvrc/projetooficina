package br.com.projeto.oficina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.oficina.entity.Cliente;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long>{

}
