package br.com.recycle.endpoint.service.impl;

import br.com.recycle.endpoint.domain.Solicitacao;
import br.com.recycle.endpoint.dto.SolicitacaoSaveDTO;
import br.com.recycle.endpoint.repository.SolicitacaoRepository;
import br.com.recycle.endpoint.service.SolicitacaoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitacaoServiceImpl implements SolicitacaoService {

    private SolicitacaoRepository solicitacaoRepository;

    public SolicitacaoServiceImpl(SolicitacaoRepository solicitacaoRepository) {
        this.solicitacaoRepository = solicitacaoRepository;
    }

    @Override
    public Optional<Solicitacao> save(SolicitacaoSaveDTO solicitacaoSaveDTO) {

        Solicitacao solicitacao = new Solicitacao();
        solicitacao.setUserId(solicitacaoSaveDTO.getUserId());
        solicitacao.setTitulo(solicitacaoSaveDTO.getTitulo());
        solicitacao.setResponsavel(solicitacaoSaveDTO.getResponsavel());
        solicitacao.setPapelSelected(solicitacaoSaveDTO.getPapelSelected());
        solicitacao.setMetalSelected(solicitacaoSaveDTO.getMetalSelected());
        solicitacao.setPlasticoSelected(solicitacaoSaveDTO.getPlasticoSelected());
        solicitacao.setVidroSelected(solicitacaoSaveDTO.getVidroSelected());
        solicitacao.setEnderecoCompleto(solicitacaoSaveDTO.getEnderecoCompleto());
        solicitacao.setReferencia(solicitacaoSaveDTO.getReferencia());
        solicitacao.setCelular(solicitacaoSaveDTO.getCelular());
        solicitacao.setEmail(solicitacaoSaveDTO.getEmail());

        return Optional.ofNullable(solicitacaoRepository.save(solicitacao));

    }

    @Override
    public List<Solicitacao> listarSolicitacoes(String idUser) {

        return solicitacaoRepository.findByUserId(idUser);

    }

}
