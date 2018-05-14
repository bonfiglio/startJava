package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP;


import us.phpnet.fabrizio.cap1_INTRO.Main;

public class IdentifyMyParts {
    public static int x = 7;  // this is a the class variable
    public int y = 3;  // this's a istance variable

    public  static void main() {
        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        System.out.println("IdentifyMyParts" );
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        //prevedere output
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
        Main.pausa();
    }
}