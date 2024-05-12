package org.javaexercises.listaprodutosapp.Controller;

import jakarta.validation.Valid;
import org.javaexercises.listaprodutosapp.Exceptions.ProdutoNotFoundExecption;
import org.javaexercises.listaprodutosapp.Repository.ProdutoRepository;
import org.javaexercises.listaprodutosapp.model.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @GetMapping("")
    List<Produto> findAll(){
        return (List<Produto>) produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    Produto findById(@PathVariable int id) throws ProdutoNotFoundExecption {
        Optional<Produto> produto = produtoRepository.findById(id);
        if(produto.isEmpty()){
            throw new ProdutoNotFoundExecption();
        }

        return produto.get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void create(@Valid @RequestBody Produto produto){
        produtoRepository.save(produto);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@Valid @RequestBody Produto produto, @PathVariable Integer id){
        produtoRepository.save(produto);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
        produtoRepository.delete(produtoRepository.findById(id).get());
    }
}
