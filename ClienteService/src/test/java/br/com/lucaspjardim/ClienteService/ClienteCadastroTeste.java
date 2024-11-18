package br.com.lucaspjardim.ClienteService;

import br.com.lucaspjardim.ClienteService.dao.ClienteDAO;
import br.com.lucaspjardim.ClienteService.model.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Author: Lucas Jardim
 */

@SpringBootTest
public class ClienteCadastroTeste {

    @Autowired
    private ClienteDAO clienteDAO;

    @Test
    public void testeCadastro() {
        Cliente cliente = new Cliente();
        cliente.setNome("Teste Produção");
        cliente.setEmail("teste.producao@example.com");
        cliente.setTelefone("99999-9999");

        Cliente clienteSalvo = clienteDAO.salvar(cliente);

        assertThat(clienteSalvo).isNotNull();
        assertThat(clienteSalvo.getId()).isNotNull();
        assertThat(clienteSalvo.getNome()).isEqualTo("Teste Produção");
        assertThat(clienteSalvo.getEmail()).isEqualTo("teste.producao@example.com");
        assertThat(clienteSalvo.getTelefone()).isEqualTo("99999-9999");
    }
}
