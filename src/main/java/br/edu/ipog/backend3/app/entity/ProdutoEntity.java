package br.edu.ipog.backend3.app.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "produto")
@Getter
@Setter
@Builder //Produto p = Produto.builder().id(1).nome("xxx").descricao("xxx").preco(BigDecimal.ONE).quantidade(1D).imagem(null).build();
@NoArgsConstructor //Produto p = new Produto();
@AllArgsConstructor //Produto p = new Produto(id,nome,descricao,preco,quantidade,imagem)
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String nome;

    private String descricao;

    private BigDecimal preco;

    private Double quantidade;

    private byte[] imagem;
}
