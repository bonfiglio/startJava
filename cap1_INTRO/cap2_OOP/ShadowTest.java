package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP;

public class ShadowTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main() {
        System.out.println("<a href=\"https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html\">Nested Classes Clessi all'interno di classi</a>");
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}