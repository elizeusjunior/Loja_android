package com.example.loja;

import java.io.Serializable;

public class Produto implements Serializable {
    //atributos
    private String descricao, categoria, preco, quantidade;

    //constrututor

    public Produto(String descricao, String categoria, String preco, String quantidade) {
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    //getters

    public String getProduto() {
        return descricao;
    }
    //métodos
    public String mostrarProduto(){
        return "\nProduto: " + descricao + "\nCategoria: " + categoria + "\nPreço: " + preco + "\nQuantidade: " + quantidade;
    }
}
