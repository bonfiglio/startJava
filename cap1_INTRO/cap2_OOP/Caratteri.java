package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP;

import us.phpnet.fabrizio.cap1_INTRO.Main;

public class Caratteri {


        public int x = 0;

        class mmmm {

            public int x = 1;

            void methodInFirstLevel(int x) {
                System.out.println("x = " + x);
                System.out.println("this.x = " + this.x);

            }
        }

        public static void main() {
            char uniChar = '\u1F14';
            System.out.println("<a href=\"https://docs.oracle.com/javase/tutorial/java/data/characters.html\">Classe Caratteri </a>"+uniChar );
            Main.pausa();

        }

}
