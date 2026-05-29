package io.github.danielvieirabh.vendas_api.repository;

import io.github.danielvieirabh.vendas_api.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;
import java.util.UUID;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
