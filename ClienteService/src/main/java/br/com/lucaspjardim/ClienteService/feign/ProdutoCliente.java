package br.com.lucaspjardim.ClienteService.feign;

import br.com.lucaspjardim.ClienteService.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Author: Lucas Jardim
 */
@FeignClient(name = "ProdutoService", url = "http://localhost:8082")
public interface ProdutoCliente {

    @GetMapping("/produtos/{id}")
    ProdutoDTO buscarProdutoPorId(@PathVariable String id);
}
