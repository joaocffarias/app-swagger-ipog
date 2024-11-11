package br.edu.ipog.backend3.app.service.produto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ProdutoModel {

    private Integer id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Double quantidade;
    private byte[] imagem;
}
