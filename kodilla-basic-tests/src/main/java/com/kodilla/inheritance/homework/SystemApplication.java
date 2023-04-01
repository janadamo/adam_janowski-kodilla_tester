package com.kodilla.inheritance.homework;

public class SystemApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2022);
        operatingSystem.turnOn();

        UpdateSystem updateSystem = new UpdateSystem(2023);
        updateSystem.turnOff();
    }
}
