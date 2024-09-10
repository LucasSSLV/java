package org.example;

public class ColaboradorAdm extends Colaborador implements Horarios {
    private boolean Adm = false;
    private String setor;

    //abaixo faço a implementação dos método da interface
    @Override
    public String entrada() {
        return "8:00";
    }

    //abaixo faço a implementação dos método da interface
    @Override
    public String saida() {
        return "17:00";
    }

    public boolean isAdm() {
        return Adm;
    }

    public void setAdm(boolean adm) {
        Adm = adm;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    //aqui aplico Polimorfismo alterando o return do método fala()
    @Override
    public void fala() {
        System.out.println("eu sou um Adm");
        //aqui uso o  super para deixar claro que este método é da classe mãe
        super.folga();
    }

    //nos métodos abaixo aplico o OVERLOAD
    public void fardaHoje() {
        System.out.println("Hoje veio de fardamento padrão.");
    }

    public void fardaHoje(String executivo) {
        System.out.println("Hoje veio de fardamento executivo, " + executivo + ".");
    }

    public void fardaHoje(String blusa, String calca) {
        System.out.println("Hoje veio de fardamento casual, " + "blusa " + blusa + " e calça " + calca + ".");
    }
}
