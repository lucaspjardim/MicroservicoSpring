package br.com.lucaspjardim.ClienteService.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Author: Lucas Jardim
 */

@Document(collection = "clientes")
public class Cliente {

    @Id
    private String id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @Email(message = "E-mail inválido")
    @NotBlank(message = "O e-mail é obrigatório")
    private String email;

    private String telefone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public @NotBlank(message = "O nome é obrigatório") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") String nome) {
        this.nome = nome;
    }

    public @Email(message = "E-mail inválido") @NotBlank(message = "O e-mail é obrigatório") String getEmail() {
        return email;
    }

    public void setEmail(@Email(message = "E-mail inválido") @NotBlank(message = "O e-mail é obrigatório") String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
