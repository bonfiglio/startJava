package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.animal;


    //ASTRAZIONE DI ELEMENTI DELA REALTA'

    public class Cane{  //DICHIARAZIONE Modificatore public  class parola chiave  Nome della classe Cane
// possiamo estendere una classe gia' esistente con extends CaneSuperclass e implementare interfacce inplements CaneInterfaccia , AltraCaneInterfaccia  {

        // DICHIARAZIONE DEGLI ATTRIBUTI PROPTIETA'
        public int size;
        String name="Bobo";
        String sound = "Bauu Bauuu!";
        //DICHIARAZIONE DEI COSTRUTTORI
        public Cane(int inputSize, String inputName){
            size = inputSize;
            name = inputName;
        }
        public Cane(){
            size = 12;
            sound = "Grrrr!";
        }

        // DICHIARAZIONE DEI METODI COMPORTAMENTI
        public void abbaia(){
            System.out.println("woof! woof!");
        }

        public void ringhia(){

            System.out.println(name+' '+sound);
        }


        public void printName(String name){
            System.out.println(name);
        }
    }

