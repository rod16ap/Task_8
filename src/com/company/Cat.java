package com.company;

public class Cat implements Movement{
    private String name;
    private int runLength;
    private int jumpHeight;


    public Cat ( String name, int runLength, int jumpHeight ) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run () {
        System.out.println("Бегите мыши, " + name + " бежит " + this.getRunLength());
    }

    @Override
    public void jump () {
        System.out.println("Когда нужно чего-то достать " + name + " прыгает " + this.getJumpHeight());
    }

    @Override
    public int getRunLength () {
        return runLength;
    }

    @Override
    public int getJumpHeight () {
        return jumpHeight;
    }
}
