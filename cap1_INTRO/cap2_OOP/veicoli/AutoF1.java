package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.veicoli;

public class AutoF1 extends Auto {

    public AutoF1(int topSpeed) {
        super(4,topSpeed); //Il richiamo del costruttore della superclass deve essere sempre posto come prima istruzione
        super.transportType = "Circuito";
    }

    public void printDescription() {
        System.out.println("Auto di F1 Top speed:"+this.topSpeed);
    }
}