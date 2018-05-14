package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.animal;

public class Orso extends Animal {
    public String color;

    public Orso (String c) {
        super();
        color = c;
    }

    public void eat () {
        super.eat();
        System.out.println("The bear went fishing before eating.");
    }
}