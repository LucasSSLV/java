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
        //o método abaixo faz uso do SUPER
        lucas.fala();

        bernardo.setAdm(true);
        bernardo.setName("Bernardo");
        bernardo.setSobrenome("feliciano cunha");
        bernardo.setSetor("vendas");
        bernardo.setDataDeNascimento("05-11-1986");
        bernardo.setCpf("03315155-89");
        //o método abaixo faz uso do SUPER
        bernardo.fala();

        //chamando métodos OVERLOAD
        bernardo.fardaHoje();
        bernardo.fardaHoje("palitó");
        bernardo.fardaHoje("branca", "marrom");

        System.out.println("colaborador: " + lucas.getName() + " " + lucas.getSobrenome() + ", nascido em: " + lucas.getDataDeNascimento() + ", " + "executa o cargo de: " + lucas.getCargo() + ".");
        System.out.println("colaborador: " + bernardo.getName() + " " + bernardo.getSobrenome() + ", nascido em : " + bernardo.getDataDeNascimento() + ", portador do cpf: " + bernardo.getCpf() + " é responsável pelo setor de: " + bernardo.getSetor() + ".");
        //abaixo chamo os métodos da interface Horarios, impletmentados pela subClasse ColaboradorAdm
        System.out.println("eu entro às: " + bernardo.entrada() + " e saio às " + bernardo.saida() + ".");

        //intanciando uma subclasse de uma classe abstrata que extende outra classe abstrata
        QuantumComputer pc01 = new QuantumComputer("27", 111.22, "002aa") {
            @Override
            public void charge() {
                System.out.println("Carga completa.");
            }

            @Override
            public int getBatteryLevel() {
                return 100;
            }

            @Override
            public void fastCharge() {
                System.out.println("Bateria Carregada, modo fast desativado.");
            }

            @Override
            public void quantumComputation() {
                System.out.println("nivel 1 de computação.");
            }

            @Override
            public void bootUp() {
                System.out.println("o pc irá iniciar em alguns minutos.");
            }
        };

        pc01.quantumComputation();
        pc01.bootUp();
        pc01.desligar();

        //testando o final no atributo a classe mãe
        ComputerDevice pc02 = new ComputerDevice("Ace", 200000.00, "A23") {
            @Override
            public void charge() {
                System.out.println("Carregando...");
            }

            @Override
            public int getBatteryLevel() {
                return 85;
            }

            @Override
            public void fastCharge() {
                System.out.println("modo fast ativo.");
            }

            @Override
            public void bootUp() {
                System.out.println("o computador irá iniciar...");
            }
        };

        pc02.bootUp();
        pc02.fastCharge();
        pc02.desligar();
        System.out.println(pc02.modeloComBateria());

        ColaboradorCeo chefe = new ColaboradorCeo();
        chefe.setName("Harnaldo");
        chefe.setSobrenome("Carvalho Freire");
        chefe.setCargo("Ceo");

        chefe.fala();
        System.out.println(chefe.getName() + " " + chefe.getSobrenome() + " é " + chefe.getCargo() + ".");
    }
}