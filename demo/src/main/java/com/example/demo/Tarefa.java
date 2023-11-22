package com.example.demo;

import javax.swing.*;

public class Tarefa {

    private int id;

    private String descricao;

    private boolean feita;

    public Tarefa() {
    }

    public int getId() {return id;}

    public void setId(int id) { this.id = id;}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFeita() {
        return feita;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }

    @Override

    public String toString() {return "Tarefa [id=" + id + ",descrição= " + descricao + "feita= " + feita + "]";}
}
