package com.example.ConsumindoViaCep.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CadastroUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String ruaNome;
    private String cidadeNome;
    private String estadoNome;
    private String cep;

    public CadastroUsuario( String nome, String ruaNome, String cidadeNome, String estadoNome, String cep) {
        this.nome = nome;
        this.ruaNome = ruaNome;
        this.cidadeNome = cidadeNome;
        this.estadoNome = estadoNome;
        this.cep = cep;
    }

    public CadastroUsuario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRuaNome() {
        return ruaNome;
    }

    public void setRuaNome(String ruaNome) {
        this.ruaNome = ruaNome;
    }

    public String getCidadeNome() {
        return cidadeNome;
    }

    public void setCidadeNome(String cidadeNome) {
        this.cidadeNome = cidadeNome;
    }

    public String getEstadoNome() {
        return estadoNome;
    }

    public void setEstadoNome(String estadoNome) {
        this.estadoNome = estadoNome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", ruaNome='" + ruaNome + '\'' +
                ", cidadeNome='" + cidadeNome + '\'' +
                ", estadoNome='" + estadoNome + '\'' +
                ", cep='" + cep;
    }
}
