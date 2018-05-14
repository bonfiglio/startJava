package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.band;

public class BandMember extends Human implements Vocalist, Guitarist //https://codeboard.io/projects/45957
{
    public BandMember(String name){
        super(name);
    }

    public void printName(){
        System.out.println("Band Member: " + artName);
    }

    public void canta(){
        System.out.println("la la la");
    }
}