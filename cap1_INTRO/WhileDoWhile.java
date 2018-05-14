package us.phpnet.fabrizio.cap1_INTRO;

public class WhileDoWhile {
    public static void main(String[] args) {
        /**
        * CONTO DA 1 a 5
         **/
        int number = 1;

        while(number <= 5){
            System.out.println(number);
            number = number + 1;
        }

/**
 * While e     do while
 */



//while example
                int sequenceWhile = 9;
                while(sequenceWhile < 10){
                    System.out.println("while: " + sequenceWhile);
                    sequenceWhile++;
                }
                //do-while example
                int sequenceDoWhile = 10;
                do{
                    System.out.println("do-while: " + sequenceDoWhile);
                    sequenceDoWhile++;
                }while(sequenceDoWhile < 10);





     System.out.println("While loop: Starting...");
     number = 2;
        while(number < 2){
        System.out.println(number);
        number = number + 1;
    }
        System.out.println("While loop: Done.");
        System.out.println("Do While loop: Starting...");
    int number2 = 2;
        do{
        System.out.println(number2);
        number2 = number2 + 1;
    }while(number2 < 2);
        System.out.println("Do while loop: Done.");
}
}
