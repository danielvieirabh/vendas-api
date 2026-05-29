package io.github.danielvieirabh.vendas_api.rest.produtos;

import java.math.BigDecimal;


public class ProdutoFormRequest { //Isso aqui e um DTO
    private String descricao;
    private String nome;
    private BigDecimal preco; //Ideal para valores monetores em porjetos back
    private String sku;



    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return "ProdutoFormRequest{" +
                "sku='" + sku + '\'' +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
