package br.com.lucaspjardim.ProdutoService;

import br.com.lucaspjardim.ProdutoService.dao.ProdutoDAO;
import br.com.lucaspjardim.ProdutoService.model.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Author: Lucas Jardim
 */
@SpringBootTest
public class ProdutoCadastroTeste {

    @Autowired
    private ProdutoDAO produtoDAO;

    @Test
    public void testeCadastro() {
        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(3500.00);
        produto.setDescricao("Notebook Dell com 16GB RAM e 512GB SSD");

        Produto produtoSalvo = produtoDAO.salvar(produto);

        assertThat(produtoSalvo).isNotNull();
        assertThat(produtoSalvo.getId()).isNotNull();
        assertThat(produtoSalvo.getNome()).isEqualTo("Notebook");
        assertThat(produtoSalvo.getPreco()).isEqualTo(3500.00);
        assertThat(produtoSalvo.getDescricao()).isEqualTo("Notebook Dell com 16GB RAM e 512GB SSD");

    }
}
