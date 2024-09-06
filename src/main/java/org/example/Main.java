package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Colaborador lucas = new Colaborador();
        ColaboradorAdm bernardo = new ColaboradorAdm();

        lucas.setName("Lucas");
        lucas.setSobrenome("santos da silva");
        lucas.setDataDeNascimento("07-01-1995");
        lucas.setCargo("vendedor");

        bernardo.setAdm(true);
        bernardo.setName("Bernardo");
        bernardo.setSobrenome("feliciano cunha");
        bernardo.setSetor("vendas");
        bernardo.setDataDeNascimento("05-11-1986");
        bernardo.setCpf("03315155-89");

        System.out.println("colaborador: " + lucas.getName() + " " + lucas.getSobrenome() + ", nascido em: " + lucas.getDataDeNascimento() + ", " + "executa o cargo de: " + lucas.getCargo() + ".");
        System.out.println("colaborador: " + bernardo.getName() + " " + bernardo.getSobrenome() + ", nascido em : " + bernardo.getDataDeNascimento() + ", portador do cpf: " + bernardo.getCpf() + " é responsável pelo setor de: " + bernardo.getSetor() + ".");
    }
}