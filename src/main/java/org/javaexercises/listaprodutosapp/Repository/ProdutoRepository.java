package org.javaexercises.listaprodutosapp.Repository;

import org.javaexercises.listaprodutosapp.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
}
