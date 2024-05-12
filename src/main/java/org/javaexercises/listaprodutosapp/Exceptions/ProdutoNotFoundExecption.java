package org.javaexercises.listaprodutosapp.Exceptions;

public class ProdutoNotFoundExecption extends Exception {
    public ProdutoNotFoundExecption(){
        super("Produto não encontrado.");
    }
}
