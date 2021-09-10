package com.dio.CatalogoProduto.Repository;

import com.dio.CatalogoProduto.Model.Produto;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProdutoRepository extends ElasticsearchRepository<Produto, Integer> {
}
