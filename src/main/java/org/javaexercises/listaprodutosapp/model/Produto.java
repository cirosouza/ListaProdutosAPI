package org.javaexercises.listaprodutosapp.model;

import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

public record Produto(
        @Id
        Integer ID,
        String nome,
        Double preco,
        Double peso,
        @Version
        Integer versao
) {
}
