package br.edu.ipog.backend3.app.api.produto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDto {

    private Integer id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Double quantidade;
    private byte[] imagem;
}
