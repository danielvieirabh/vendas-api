package io.github.danielvieirabh.vendas_api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //para long
    private Long id;
    @Column(name = "nome", length = 100 )
    private String nome;
    @Column(length = 255)
    private String descricao;
    @Column(precision = 16, scale = 2) //O numero pode ter a 16 posicoes e 2 casas decimais , 14 numeros a esquerda e 2 depois da virgula
    private BigDecimal preco;
    private String sku;

    public Produto() {

    }

    public Produto(String nome, String descricao, BigDecimal preco, String sku) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.sku = sku;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", sku='" + sku + '\'' +
                '}';
    }
}
