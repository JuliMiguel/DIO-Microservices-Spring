package com.dio.CatalogoProduto.Controller;

import com.dio.CatalogoProduto.Model.Produto;
import com.dio.CatalogoProduto.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Produto create(@RequestBody Produto produto) {

        return produtoRepository.save(produto);
    }

    @RequestMapping
    public Iterable<Produto> list() {

        return produtoRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Produto> findById(@PathVariable("id") Integer id) {
        return produtoRepository.findById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Produto update(@RequestBody Produto produto){
        return produtoRepository.save(produto);
    }

}
