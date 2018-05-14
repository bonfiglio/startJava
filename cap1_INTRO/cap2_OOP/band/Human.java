package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.band;

public class Human{

    String  artName;

    public Human(String  nome)
    {
        this.artName=nome;
    }

    public void printName(){
        System.out.println(artName);
    }
}