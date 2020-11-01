package br.com.recycle.endpoint.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolicitacaoSaveDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;
    private String titulo;
    private String responsavel;
    private Boolean papelSelected;
    private Boolean metalSelected;
    private Boolean plasticoSelected;
    private Boolean vidroSelected;
    private String enderecoCompleto;
    private String referencia;
    private String celular;
    private String email;

}
