package com.myapp.classes;

public class Cliente extends Pessoa {

    public Cliente(String nome, String telefone, String endereco) {
        super(nome, telefone, endereco);
    }

    @Override
    public void depositar(double valor) {
        double saldoAtual = this.getSaldo();
        double novoSaldo = saldoAtual + valor + (valor * 0.1);
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
