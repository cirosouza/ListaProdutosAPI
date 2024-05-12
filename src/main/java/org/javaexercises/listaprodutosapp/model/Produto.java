package org.javaexercises.listaprodutosapp.model;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

@AllArgsConstructor
@NoArgsConstructor
public class Produto {
        @Id
        Integer ID;
        String nome;
        Double preco;
        Double peso;
        @Version
        Integer versao;

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public Double getPreco() {
                return preco;
        }

        public void setPreco(Double preco) {
                this.preco = preco;
        }

        public Double getPeso() {
                return peso;
        }

        public void setPeso(Double peso) {
                this.peso = peso;
        }

        public Integer getVersao() {
                return versao;
        }

        public void setVersao(Integer versao) {
                this.versao = versao;
        }
}
