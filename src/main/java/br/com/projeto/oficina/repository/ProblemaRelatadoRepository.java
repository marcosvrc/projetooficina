package br.com.projeto.oficina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.oficina.entity.ProblemaReportado;

@Repository
public interface ProblemaRelatadoRepository extends JpaRepository<ProblemaReportado, Long> {

}
