package br.com.recycle.endpoint.service;

import br.com.recycle.endpoint.domain.Solicitacao;
import br.com.recycle.endpoint.dto.SolicitacaoSaveDTO;

import java.util.Optional;

public interface SolicitacaoService {

    Optional<Solicitacao> save(SolicitacaoSaveDTO solicitacaoSaveDTO);

}
