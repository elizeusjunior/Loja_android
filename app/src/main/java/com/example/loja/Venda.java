package com.example.loja;

import java.io.Serializable;

public class Venda implements Serializable {
    //atributos
    private String data, quantidade;

    //construtor


    public Venda(String data, String quantidade) {
        this.data = data;
        this.quantidade = quantidade;
    }

    //getters
    public Venda(String produto) {
        this.data = produto;
    }

    //métodos
    public String mostrarVenda(){
        return "\nData: " + data + "\n Quantidade: " + quantidade;
    }
}
