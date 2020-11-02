package br.com.recycle.endpoint.service;

import br.com.recycle.endpoint.domain.Solicitacao;
import br.com.recycle.endpoint.dto.SolicitacaoSaveDTO;

import java.util.List;
import java.util.Optional;

public interface SolicitacaoService {

    Optional<Solicitacao> save(SolicitacaoSaveDTO solicitacaoSaveDTO);

    List<Solicitacao> listarSolicitacoes(String idUser);

}
