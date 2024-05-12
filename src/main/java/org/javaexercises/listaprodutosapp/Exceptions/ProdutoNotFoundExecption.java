package org.javaexercises.listaprodutosapp.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProdutoNotFoundExecption extends Exception {
    public ProdutoNotFoundExecption(){
        super("Produto não encontrado.");
    }
}
