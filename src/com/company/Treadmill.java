package com.company;

public class Treadmill extends Сompetition{
    private int length;

    public int getLength () {
        return length;
    }

    public Treadmill( String name, int length) {
        super(name);
        this.length = length;
    }


    @Override
    protected boolean moving ( Movement movement ) {
        System.out.println(super.getName() + " " + this.length);
        movement.run();

        if (getLength() <= movement.getRunLength()) {
            System.out.println("Успешно пробежал");
            return true;
        }
        else {
            System.out.println("Не смог пробежать");
            return false;
        }

    }


}
