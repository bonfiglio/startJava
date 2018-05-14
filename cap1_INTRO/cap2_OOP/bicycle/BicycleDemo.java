package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.bicycle;
import us.phpnet.fabrizio.cap1_INTRO.Main;

public class BicycleDemo {
    public static void main() {
        System.out.println("BICICLETTE  Vedi file Bicycle.java ");
        // Create two different
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle(10,1,3);

        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        Main.pausa();
        MountainBike.main();
    }
}
