package com.company;

public class Waii extends Сompetition{
    private int height;

    public int getHeight () {
        return height;
    }

    public Waii ( String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    protected boolean moving ( Movement movement ) {
        System.out.println(super.getName() + " " + this.height);
        movement.jump();

        if (getHeight() <= movement.getJumpHeight()) {
            System.out.println("Успешно прыгнул");
            return true;
        }
        else {
            System.out.println("не смог перепрыгнуть");
            return false;
        }
    }


}
