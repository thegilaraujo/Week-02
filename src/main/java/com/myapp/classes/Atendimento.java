package com.myapp.classes;

public class Atendimento {

    private int horas;

    public void setHoras(int horas) {
        if (horas < 1 || horas > 12) {
            System.out.println("Erro: horas deve ser entre 1 e 12!");
        } else {
            this.horas = horas;
            System.out.println("Atendimento marcado com sucesso!");
        }
    }

    public int getHoras() {
        return horas;
    }
}
