package com.mba.spring.cademeudono.model;

import javax.persistence.*;
import java.util.Objects;

@Entity (name = "UsuarioEntity")
@Table(name = "USUARIO_TABLE")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long idUser;

    @Column(name = "USER_NAME")
    private String nome;

    @Column(name = "USER_CPF", unique = true)
    private String cpf;

    @Column(name = "USER_EMAIL", unique = true)
    private String email;

    @Column(name = "USER_CIDADE")
    private String cidade;

    @Column(name = "USER_TELEFONE")
    private String telefone;

    public Long getIdUser() {return idUser;}

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
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

    public String getCidade() {return cidade;}

    public void setCidade(String cidade) {this.cidade = cidade;}

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioEntity that = (UsuarioEntity) o;
        return Objects.equals(idUser, that.idUser) && Objects.equals(nome, that.nome);
    }

    @Override
    public String toString() {
        return "UsuarioEntity{" +
                "idUser=" + idUser +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", cidade='" + cidade + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
