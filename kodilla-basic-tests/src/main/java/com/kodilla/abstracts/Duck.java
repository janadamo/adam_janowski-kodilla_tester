package com.kodilla.abstracts;

public class Duck extends Animal{
    Duck(){
        super(2);
    }
    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }
}
