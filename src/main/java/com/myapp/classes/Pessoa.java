package com.myapp.classes;

import com.myapp.interfaces.ISaldo;

public abstract class Pessoa implements ISaldo {

    private String nome;
    private String telefone;
    private String endereco;
    private double saldo;

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.saldo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Pessoa: " + "Nome: " + getNome() + ", Telefone: " + getTelefone() + ", Endereço: " + getEndereco();
    }
}