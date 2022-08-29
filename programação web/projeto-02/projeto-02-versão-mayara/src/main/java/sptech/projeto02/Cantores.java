package sptech.projeto02;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

public class Cantores {
    private int id;
    private  String nome;
    private  String categoria;
    private  double cache;
    private boolean constaNoSpotify;
    @JsonIgnore
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getCache() {
        return cache;
    }

    public boolean isConstaNoSpotify() {
        return constaNoSpotify;
    }

    public String getSenha() { return senha; }
}
