package org.example;

import javax.xml.crypto.Data;

public class Colaborador {
    private String name;
    private String sobrenome;
    private String dataDeNascimento;
    private String cargo;
    protected String cpf;

    public void folga() {
        System.out.println( "sai de folga!");
    }

    public void fala() {
        System.out.println("eu não sou um Adm");
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimentos) {
        this.dataDeNascimento = dataDeNascimentos;
    }
}
