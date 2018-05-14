package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.veicoli;

public class Moto implements Veicolo {
    public String transportType = "terreste";
    public int ruote;

    public Moto(int wheels) {
        this.ruote = wheels;
    }
    public String getTransportType() {
        return this.transportType;
    }
    public boolean conRuote() {
        return ruote>0;
    }
    public int getNumberoRuote() {
        return ruote;
    }
}