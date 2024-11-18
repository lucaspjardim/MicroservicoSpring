package br.com.lucaspjardim.ProdutoService.services;

import br.com.lucaspjardim.ProdutoService.dao.ProdutoDAO;
import br.com.lucaspjardim.ProdutoService.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Lucas Jardim
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoDAO produtoDAO;

    public Produto salvar(Produto produto) {
        return produtoDAO.salvar(produto);
    }

    public List<Produto> buscarTodos() {
        return produtoDAO.buscarTodos();
    }

    public Produto buscarPorId(String id) {
        return produtoDAO.buscarPorId(id);
    }

    public void deletar(String id) {
        produtoDAO.deletar(id);
    }
}
