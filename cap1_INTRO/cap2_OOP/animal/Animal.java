package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.animal;

public class Animal {
    protected boolean hasEaten;

    public Animal () {
        hasEaten = false;
    }

    public void eat () {
        System.out.println("The animal is eating...");
        hasEaten = true;
    }
}
