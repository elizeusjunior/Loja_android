package com.example.loja;

import java.io.Serializable;

public class Cliente implements Serializable {
    //atributos
    private String nome, email, cpf, senha;

    //construtor


    public Cliente(String nome, String email, String cpf, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
    }

    //getters
    public String getNome() {
        return nome;
    }
    //métodos
    public String mostrarCliente(){
        return "\nNome: " + nome + "Email: " + email +  "\nCPF: " + cpf + "\nSenha: " + senha;
    }
}
