package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.veicoli;

public class Auto implements Veicolo {
    String transportType = "terrestre";
    public int ruote;
    public int topSpeed= 100;
    public Auto(int wheels) {
        this.ruote = wheels;
    }
    public Auto(int wheels , int vMax) {
        this.ruote = wheels;
        this.topSpeed= vMax;
    }
    public String getTransportType() {
        return this.transportType;
    }
    public final boolean  conRuote() {  // se dichiaro final il metodo non e' Overridden
        return ruote>0;
    }
    public int getNumberoRuote() {
        return ruote;
    }
    public void setMaxV(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getMaxV() {
        return topSpeed;
    }

    public void printDescription() {
        System.out.println("Auto Veicolo:"+this.transportType);
    }
}