package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.bicycle;

public class Bicycle {
    // STATO  the Bicycle class has three fields
    int cadence = 0; // Cadenza corrente dei pedali
    int speed = 0; // Velocita' corrente delle bici
    int gear = 1;  // ghiera

    // the Bicycle class has 2 constructor
    public Bicycle() {

    }
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    // COMPORTAMENTI  methods
    // the Bicycle class has methods
    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }
}
