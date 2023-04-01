package com.kodilla.inheritance.homework;

import java.util.Scanner;

public class OperatingSystem {
    private int release;

    public OperatingSystem (int release) {
        this.release = release;
    }
    public void turnOn() {
        System.out.println("Starting up...");
    }
    public void turnOff(){
        System.out.println("Shutting down...");
    }

    public int getRelease() {
        return release;
    }

    public void displayRelease(int release) {
        System.out.println("Release date : " + release);
    }
}
