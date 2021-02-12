package com.company;

public abstract class Сompetition {
    private String name;

    public Сompetition ( String name ) {

        this.name = name;
    }

    public String getName () {
        return name;
    }

    protected abstract boolean moving( Movement movement);

}
