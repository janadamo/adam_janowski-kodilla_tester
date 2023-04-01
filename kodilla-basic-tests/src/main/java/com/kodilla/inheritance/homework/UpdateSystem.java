package com.kodilla.inheritance.homework;

public class UpdateSystem extends OperatingSystem{
    public void energySave() {
        System.out.println("Energy saving mode...");
    }
    public void systemFilesUpdate() {
        System.out.println("Updating system files...");
    }
    @Override
    public void turnOn() {
        System.out.println("Update in progress. Stand by...");
    }
    @Override
    public void turnOff() {
        System.out.println("Update in progress. Do not shut down!");
    }
    public UpdateSystem(int release) {
        super(release);
    }
}
