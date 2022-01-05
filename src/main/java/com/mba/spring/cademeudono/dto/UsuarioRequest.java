package com.mba.spring.cademeudono.dto;

import com.mba.spring.cademeudono.handler.MessageCodes;
import com.mba.spring.cademeudono.model.EnderecoEntity;
import com.mba.spring.cademeudono.model.UsuarioEntity;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UsuarioRequest {

    private Long id;

    @NotBlank(message = MessageCodes.REQUIRED_FIELD)
    private String nome;

    @NotBlank
    @Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$", message = MessageCodes.INVALID_VALUE)
    private String cpf;

    @NotBlank (message = MessageCodes.REQUIRED_FIELD)
    @Email
    private String email;

    @NotBlank (message = MessageCodes.REQUIRED_FIELD)
    private EnderecoEntity endereco;

    @NotBlank(message = MessageCodes.REQUIRED_FIELD)
    @Length(min =11,max =11)
    private String telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoEntity getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEntity endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public UsuarioEntity userBuild() {
        UsuarioEntity user = new UsuarioEntity();
        user.setNome(this.nome);
        user.setCpf(this.cpf);
        user.setEmail(this.email);
        user.setEndereco(this.endereco);
        user.setTelefone(this.telefone);

        return user;
    }
}