package io.github.danielvieirabh.vendas_api.rest.produtos;

import io.github.danielvieirabh.vendas_api.model.Produto;
import io.github.danielvieirabh.vendas_api.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.Optional;

@RestController //mepear essa classe
@RequestMapping("/api/produtos")
@CrossOrigin("*")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping //Enviar recurso //QUando nao falar o codigo de sucesso ele traz por padrao 200
    public ProdutoFormRequest salvar(@RequestBody ProdutoFormRequest produtoFormRequest) { //mandar um objeto JSON
        Produto entidadeProduto = produtoFormRequest.toModel();
        produtoRepository.save(entidadeProduto);
        produtoFormRequest.setId(entidadeProduto.getId());
        produtoFormRequest.setCadastro(LocalDate.now());
        return produtoFormRequest;
    }

    //api/produtos/id
    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizar(@PathVariable Long id, @RequestBody ProdutoFormRequest produtoFormRequest) {
      Optional<Produto> produtoExistente = produtoRepository.findById(id);
      if (produtoExistente.isEmpty()) {
         // produtoExistente.get(); //retorna o produto dentro
         return ResponseEntity.notFound().build(); //Se for vazio manda isso
      }

        Produto entidade = produtoFormRequest.toModel();
        entidade.setId(id);
        entidade.setDataCadastro(LocalDate.now());
        produtoRepository.save(entidade);
        return ResponseEntity.ok().build();
    }
}
