package br.com.recycle.endpoint.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TB_SOLICITACAO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Solicitacao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ID_USER", nullable = false)
    private String userId;

    @Column(name = "TITULO", nullable = false)
    private String titulo;

    @Column(name = "RESPONSAVEL", nullable = false)
    private String responsavel;

    @Column(name = "PAPEL_SELECIONADO", nullable = false)
    private Boolean papelSelected;

    @Column(name = "METAL_SELECIONADO", nullable = false)
    private Boolean metalSelected;

    @Column(name = "PLASTICO_SELECIONADO", nullable = false)
    private Boolean plasticoSelected;

    @Column(name = "VIDRO_SELECIONADO", nullable = false)
    private Boolean vidroSelected;

    @Column(name = "ENDERECO_COMPLETO", nullable = false)
    private String enderecoCompleto;

    @Column(name = "REFERENCIA", nullable = false)
    private String referencia;

    @Column(name = "CELULAR", nullable = false)
    private String celular;

    @Column(name = "EMAIL", nullable = false)
    private String email;

}
