package org.example;

public abstract class ComputerDevice {
    String brand;
    double storageCapacity;

    public ComputerDevice(String brand, double storageCapacity) {
        this.brand = brand;
        this.storageCapacity = storageCapacity;
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
}
