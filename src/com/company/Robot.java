package com.company;

public class Robot implements Movement{
    private String name;
    private int runLength;
    private int jumpHeight;

    public Robot ( String name, int runLength, int jumpHeight ) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;

    }

    @Override
    public void run () {
        System.out.println("Я робот " + name + " и я бегу " + this.getRunLength());
    }

    @Override
    public void jump () {
        System.out.println(name + " обычно прыгает " + this.getJumpHeight());
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
