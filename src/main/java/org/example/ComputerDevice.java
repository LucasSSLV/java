package org.example;

public abstract class ComputerDevice implements FastCharge {
    String brand;
    double storageCapacity;
    public static final boolean COM_BATERIA = true;
    final String modeloDoProcessador;

    public ComputerDevice(String brand, double storageCapacity, String modeloDoProcessador) {
        this.brand = brand;
        this.storageCapacity = storageCapacity;
        this.modeloDoProcessador = modeloDoProcessador;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public abstract void bootUp();

    public boolean modeloComBateria() {
        return COM_BATERIA;
    }

    //declarando um método FINAL que não pode ser alterado
    public final void desligar() {
        System.out.println("Desligando...");
    }
}
