package br.com.lucaspjardim.ProdutoService.dao;

import br.com.lucaspjardim.ProdutoService.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: Lucas Jardim
 */
@Repository
public class ProdutoDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Produto salvar(Produto produto) {
        return mongoTemplate.save(produto);
    }

    public List<Produto> buscarTodos() {
        return mongoTemplate.findAll(Produto.class);
    }

    public Produto buscarPorId(String id) {
        return mongoTemplate.findById(id, Produto.class);
    }

    public void deletar(String id) {
        Produto produto = mongoTemplate.findById(id, Produto.class);
        if (produto != null) {
            mongoTemplate.remove(produto);
        }
    }
}
