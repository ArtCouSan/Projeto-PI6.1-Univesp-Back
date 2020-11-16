package br.com.recycle.endpoint.controller;

import br.com.recycle.endpoint.domain.Solicitacao;
import br.com.recycle.endpoint.dto.SolicitacaoSaveDTO;
import br.com.recycle.endpoint.service.SolicitacaoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/v1/solicitacao")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class SolicitacaoController {

    private SolicitacaoService solicitacaoService;

    public SolicitacaoController(SolicitacaoService solicitacaoService) {
        this.solicitacaoService = solicitacaoService;
    }

    @PostMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<Solicitacao> saveSolicitacao(@RequestBody SolicitacaoSaveDTO solicitacaoSaveDTO){

        Optional<Solicitacao> solicitacao = solicitacaoService.save(solicitacaoSaveDTO);

        return new ResponseEntity<>(solicitacao.get(), HttpStatus.CREATED);

    }

    @PutMapping(value = "/{id}/cancelar")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<Solicitacao> cancelarSolicitacao(@PathVariable Long id){

        Optional<Solicitacao> solicitacao = solicitacaoService.cancelarSolicitacao(id);

        return new ResponseEntity<>(solicitacao.get(), HttpStatus.OK);

    }

    @PutMapping(value = "/{id}/ativar")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<Solicitacao> ativarSolicitacao(@PathVariable Long id){

        Optional<Solicitacao> solicitacao = solicitacaoService.ativarSolicitacao(id);

        return new ResponseEntity<>(solicitacao.get(), HttpStatus.OK);

    }

    @PutMapping(value = "/{id}/em-andamento")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<Solicitacao> emAndamentoSolicitacao(@PathVariable Long id){

        Optional<Solicitacao> solicitacao = solicitacaoService.emAndamentoSolicitacao(id);

        return new ResponseEntity<>(solicitacao.get(), HttpStatus.OK);

    }


    @GetMapping(value = "/{id}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<Optional<Solicitacao>> getSolicitacao(@PathVariable Long id){

        Optional<Solicitacao> solicitacao = solicitacaoService.getSolicitacao(id);

        return new ResponseEntity<>(solicitacao, HttpStatus.OK);

    }

    @GetMapping(value = "/listar-solicitacoes/{idUser}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<List<Solicitacao>> listarSolicitacoes(@PathVariable String idUser){

        List<Solicitacao> solicitacoes = solicitacaoService.listarSolicitacoes(idUser);

        return new ResponseEntity<>(solicitacoes, HttpStatus.OK);

    }

    @GetMapping(value = "/encontrar-solicitacoes/{idUser}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public ResponseEntity<List<Solicitacao>> encontrarSolicitacoes(@PathVariable String idUser){

        List<Solicitacao> solicitacoes = solicitacaoService.encontrarSolicitacoes(idUser);

        return new ResponseEntity<>(solicitacoes, HttpStatus.OK);

    }
}
