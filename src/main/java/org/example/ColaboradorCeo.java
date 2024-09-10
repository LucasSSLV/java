package org.example;

public class ColaboradorCeo extends Colaborador {
    private final boolean ceo = true;

    @Override
    public void fala() {
        System.out.println("Olá eu sou o Ceo a empresa!");
    }
}
