package br.com.lucaspjardim.ProdutoService.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Author: Lucas Jardim
 */

@Document(collection = "produtos")
public class Produto {

    @Id
    private String id;

    @NotBlank(message = "O nome do produto é obrigatório")
    private String nome;

    @NotNull(message = "O preço é obrigatório")
    private Double preco;

    private String descricao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
