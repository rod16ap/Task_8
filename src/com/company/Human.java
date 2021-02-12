package com.company;

public class Human implements Movement{
    private String name;
    private int runLength;
    private int jumpHeight;

    public Human ( String name, int runLength, int jumpHeight ) {
        this.name = name;
        this.runLength = runLength;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run () {
        System.out.println(name + " сегодня бежит " + this.getRunLength());
    }

    @Override
    public void jump () {
        System.out.println(name + " сможет прыгнуть " + getJumpHeight());

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
