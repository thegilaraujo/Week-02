package com.myapp;

import com.myapp.classes.Diarista;
import com.myapp.classes.Atendimento;
import com.myapp.classes.Cliente;

public class App {
    public static void main(String[] args) {

        Diarista diarista = new Diarista("Joana da Silva Medeiros", "(11) 98072-3014", "Alcir Alcantara Barbosa, 244", "1234567");
        System.out.println("Dados do Cliente: " + diarista.toString());
        diarista.atender("Joao");
        System.out.println("Chave Pix: " + diarista.getChavePix());
        System.out.println("Saldo atual: R$ " + diarista.getSaldo());
        diarista.depositar(1000);
        diarista.sacar(500);
        diarista.depositar(2000);
        diarista.depositar(500);
        diarista.sacar(1000);
        System.out.println("Saldo atual: R$ " + diarista.getSaldo());

        System.out.printf("\n");

        Cliente cliente = new Cliente("Gildevan Araujo Bomfim", "(11) 95867-8566", "Alcir Alcantara Barbosa, 246");
        System.out.println("Dados do Cliente: " + cliente.toString());
        System.out.println("Saldo atual: R$ " + cliente.getSaldo());
        cliente.depositar(2000);
        cliente.depositar(1000);
        cliente.sacar(300);
        System.out.println("Saldo atual: R$ " + cliente.getSaldo());

        Atendimento atendimento = new Atendimento();
        atendimento.setHoras(11);
        System.out.println("Horas de atendimento: " + atendimento.getHoras() + " horas");

    }
}