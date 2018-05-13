package us.phpnet.fabrizio;

public class IfControlFlow {

    /**
     * Control Flow 1
     */

        public static void if1() {
            int grade =85;
            if(grade > 70){
                System.out.println("Congratulations!");
            }else{
                System.out.println("You should work harder");
            }
        }

    /**
     * Control Flow 2
     */

        public static void weather() {
            String weather = "rainy";
            //String weather = "sunny";
            //String weather = "windy";
            //String weather = "snowy";
            if(weather.equals("rainy")){
                System.out.println("Don't forget to bring your umbrella");
            }else if(weather.equals("sunny")){
                System.out.println("Don't forget your sunglasses");
            }else if(weather.equals("windy")){
                System.out.println("Don't forget to bring your coat");
            }else{
                System.out.println("Enjoy the snow!");
            }
        }
    /**
     * Control Flow 3
     */

    static  int a= 0;

    public static boolean hotFood(){
        a++;
        //	System.out.println("Evaluating hotFood!");
        return true;
    }

    public static boolean tableServed(){
        a++;
        //	System.out.println("Evaluating tableServered!");
        return false;
    }
    public static void andOr() {
        System.out.println("Let's check the first table...");
        boolean food = hotFood();
        boolean table = tableServed();

        /*hotFood() && tableServed()*/
        if(  food && table  ){
            System.out.println(a);
            System.out.println("Time to eat");
        }else{  System.out.println(a);
            System.out.println("Let's wait");
        }
        /*tableServed() && hotFood()*/
        /*tableServed() || hotFood()*/
        /*hotFood() || tableServed()*/
    }



}
