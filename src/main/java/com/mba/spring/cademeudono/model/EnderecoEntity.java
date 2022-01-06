package com.mba.spring.cademeudono.model;

import javax.persistence.*;

@Entity
@Table(name = "ENDERECO_TABLE")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ENDERECO_ID")
    private Long idEndereco;

    @Column(name = "ENDERECO_RUA")
    private String rua;

    @Column(name = "ENDERECO_NUMERO")
    private Integer numero;

    @Column(name = "ENDERECO_CIDADE")
    private String cidade;

    @OneToOne(mappedBy = "endereco")
    private UsuarioEntity usuario;

    @Override
    public String toString() {
        return "EnderecoEntity{" +
                "idEndereco=" + idEndereco +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
