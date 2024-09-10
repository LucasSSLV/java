package org.example;

public abstract class QuantumComputer extends ComputerDevice {
    public QuantumComputer(String brand, double storageCapacity, String modeloDoProcessador) {
        super(brand, storageCapacity, modeloDoProcessador);
    }

    public abstract void quantumComputation();
}
