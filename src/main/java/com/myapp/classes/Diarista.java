package com.myapp.classes;

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
}
