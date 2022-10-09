package com.example.treinamentoprova01;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Grifes {
    private String nome;
    private int anoCriacao;
    private double valorAcaoBolsa;
    //@JsonIgnore
    // sem o ignore e criação do get ele não passa o valor
    private String chaveAcesso;

    public String getNome() {
        return nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public double getValorAcaoBolsa() {
        return valorAcaoBolsa;
    }
}

