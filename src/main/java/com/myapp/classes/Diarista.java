package com.myapp.classes;

import java.util.Objects;

public class Diarista extends Pessoa {

    private String chavePix;

    public Diarista(String nome, String telefone, String endereco, String chavePix) {
        super(nome, telefone, endereco);
        this.chavePix = chavePix;
    }

    public String getChavePix(){
        return chavePix;
    }

    public void atender(String nomeCliente) {
        System.out.println("Realizando atendendimento de: " + nomeCliente);
    }

    @Override
    public void depositar(double valor) {
        double saldoAtual = this.getSaldo();
        double novoSaldo = saldoAtual + valor;
        this.setSaldo(novoSaldo);
        System.out.println("Realizando deposito de : R$ " + valor + " Novo saldo: R$ " + this.getSaldo());
    }

    @Override
    public void sacar(double valor) {
        double saldoAtual = this.getSaldo();
        double novoSaldo = saldoAtual - valor;
        this.setSaldo(novoSaldo);
        System.out.println("Realizando saque de : R$ " + valor + " Novo saldo: R$ " + this.getSaldo());
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " Telefone: " +  this.getTelefone() + " Endereço: " + this.getEndereco() + " Chave Pix: " + this.getChavePix();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Diarista diarista = (Diarista) o;
        return Objects.equals(chavePix, diarista.chavePix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), chavePix);
    }
}
