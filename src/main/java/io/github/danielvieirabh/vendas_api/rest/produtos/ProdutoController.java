package io.github.danielvieirabh.vendas_api.rest.produtos;

import io.github.danielvieirabh.vendas_api.model.Produto;
import io.github.danielvieirabh.vendas_api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //mepear essa classe
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping() //Enviar recurso //QUando nao falar o codigo de sucesso ele traz por padrao 200
    public ProdutoFormRequest salvar(@RequestBody ProdutoFormRequest produtoFormRequest) { //mandar um objeto JSON
        Produto entidadeProduto = new Produto(produtoFormRequest.getNome(), produtoFormRequest.getDescricao(), produtoFormRequest.getPreco(), produtoFormRequest.getSku());
        produtoRepository.save(entidadeProduto);
        System.out.println(entidadeProduto);
        return produtoFormRequest;
    }
}
