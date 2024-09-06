package org.example;

public class ColaboradorAdm extends Colaborador {
   private boolean Adm = false;
   private String setor;

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
}
