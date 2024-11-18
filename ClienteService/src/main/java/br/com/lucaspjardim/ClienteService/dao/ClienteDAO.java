package br.com.lucaspjardim.ClienteService.dao;

import br.com.lucaspjardim.ClienteService.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: Lucas Jardim
 */
@Repository
public class ClienteDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Cliente salvar(Cliente cliente) {
        return mongoTemplate.save(cliente);
    }

    public List<Cliente> buscarTodos() {
        return mongoTemplate.findAll(Cliente.class);
    }

    public Cliente buscarPorId(String id) {
        return mongoTemplate.findById(id, Cliente.class);
    }

    public void deletar(String id) {
        Cliente cliente = mongoTemplate.findById(id, Cliente.class);
        if(cliente != null) {
            mongoTemplate.remove(cliente);
        }
    }
}
