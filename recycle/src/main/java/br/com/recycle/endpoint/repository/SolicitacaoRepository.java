package br.com.recycle.endpoint.repository;

import br.com.recycle.endpoint.domain.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SolicitacaoRepository extends CrudRepository<Solicitacao, Long> {

}
