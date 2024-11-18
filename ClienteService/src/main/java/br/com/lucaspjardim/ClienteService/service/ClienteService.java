package br.com.lucaspjardim.ClienteService.service;

import br.com.lucaspjardim.ClienteService.dao.ClienteDAO;
import br.com.lucaspjardim.ClienteService.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Lucas Jardim
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteDAO clienteDAO;

    public Cliente salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    public List<Cliente> buscarTodos() {
        return clienteDAO.buscarTodos();
    }

    public Cliente buscarPorId(String id) {
        return clienteDAO.buscarPorId(id);
    }

    public void deletar(String id) {
        clienteDAO.deletar(id);
    }
}
