package br.com.recycle.endpoint.controller;

import br.com.recycle.endpoint.domain.Solicitacao;
import br.com.recycle.endpoint.dto.SolicitacaoSaveDTO;
import br.com.recycle.endpoint.service.SolicitacaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/v1/solicitacao")
public class SolicitacaoController {

    private SolicitacaoService solicitacaoService;

    public SolicitacaoController(SolicitacaoService solicitacaoService) {
        this.solicitacaoService = solicitacaoService;
    }

    @PostMapping
    public ResponseEntity<Optional<Solicitacao>> saveSolicitacao(SolicitacaoSaveDTO solicitacaoSaveDTO){

        Optional<Solicitacao> solicitacao = solicitacaoService.save(solicitacaoSaveDTO);

        return new ResponseEntity<>(solicitacao, HttpStatus.CREATED);

    }

}
