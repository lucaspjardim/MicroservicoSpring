package br.com.lucaspjardim.ClienteService.controller;

import br.com.lucaspjardim.ClienteService.dto.ProdutoDTO;
import br.com.lucaspjardim.ClienteService.feign.ProdutoCliente;
import br.com.lucaspjardim.ClienteService.model.Cliente;
import br.com.lucaspjardim.ClienteService.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: Lucas Jardim
 */

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ProdutoCliente produtoCliente;

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(clienteService.salvar(cliente));
    }

    @GetMapping("/{clienteId}/verificar-produto/{produtoId}")
    public ResponseEntity<ProdutoDTO> verificarProduto(
            @PathVariable String clienteId,
            @PathVariable String produtoId) {

        ProdutoDTO produto = produtoCliente.buscarProdutoPorId(produtoId);
        return ResponseEntity.ok(produto);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable String id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable String id) {
        clienteService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
