package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.bicycle;

public class MountainBike  extends Bicycle {
    // new fields and methods defining
    // a mountain bike would go here


    // the MountainBike subclass has one field
    public int seatHeight =12;

    // the MountainBike subclass has  constructors
    public MountainBike() {
        super();
    }
    public MountainBike( int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
    }
    public MountainBike( int startCadence, int startSpeed, int startGear,int startHeight) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }


    // the MountainBike subclass has methods
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear
                + " seat Height:" + seatHeight);
    }


    public static void main() {
        System.out.println("What Is Inheritance? A hierarchy of bicycle classes. ");
        // Create two different
        // Bicycle objects
        MountainBike bike1 = new MountainBike();
        MountainBike bike2 = new MountainBike(10,1,3);
        MountainBike bike3 = new MountainBike(10,1,3,5);
        // Invoke methods on
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.setHeight(3);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        bike3.printStates();

    }
}
