package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP;


import us.phpnet.fabrizio.cap1_INTRO.Main;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.animal.Animal;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.animal.Cane;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.animal.OrsoPolare;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.animal.Umano;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.comparabili.PokerCard;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.esercizi.Classroom;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.veicoli.Auto;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.veicoli.AutoF1;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.veicoli.Moto;
import us.phpnet.fabrizio.cap2_OOP.animal.*;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.band.BandMember;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.band.Human;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.bicycle.BicycleDemo;
import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.esercizi.TimeHelper;
import us.phpnet.fabrizio.cap2_OOP.veicoli.*;


    /**
     * Main class of the Java program.
     */

    public class ClassiOggetti {
        static void pausa ()
        {
            java.util.Scanner pausa = new java.util.Scanner(System.in);
            Main.stampaLinea("---CONTINUA----");
            pausa.nextLine();

        }
        private static void animali ()
        { //ANIMALI
            Main.stampaLinea("ANIMALI  Vedi file Cane.java e richiamo Metodo costruttore Cane()");
            Cane bobo=new Cane();  // definisco bobo istanza di classe Cane Vedi file Cane.java e richiamo Metodo costruttore Cane()
            Cane fido; // definisco fido come istanza di classe Cane
            fido=  new Cane(25,"Fido"); // Creo istanza attraverso parola chiave new  e richiamo Metodo costruttore Cane()
            fido.abbaia();
            fido.ringhia();
            bobo.abbaia();
            bobo.ringhia();
            Main.stampaLinea("Taglia di fido "+ fido.size);
            fido=bobo ; // perdo  fido
            Main.stampaLinea("fido=bobo ;// Assegno a fido istanza bobo  la sua taglia : Taglia di fido"+ fido.size);
            fido.ringhia();
            fido.size++;
            Main.stampaLinea(" fido.size++; Nuova taglia di fido/ bobo "+ fido.size);
            pausa();
            Main.stampaLinea("  Nuova taglia di  bobo "+ bobo.size +"OSS: fido e bobo sono la stessa istanza ");
            // Registrare i cani con un microchip
            pausa();

        }
        private static void uomini(){
            //UOMINI
            Umano connie = new Umano("Connie", "Smith", 'F');
            connie.setBirthDate(1987,1,22); //January 22th, 1987
            Main.stampaLinea(connie.getFullName() + " is "+ connie.getAge() + " years old");

            Umano john = new Umano("John", "Brown", 'M');
            john.setBirthDate(1986,12,8);//December 08th, 1986
            Main.stampaLinea(john.getFullName() + " is "+ john.getAge() + " years old");
            connie.addPartner(john);
            Main.stampaLinea(connie.getFullName() + "'s partner is " +  connie.getPartnerName());
            Main.stampaLinea(john.getFullName() + "'s partner is " +  john.getPartnerName());
        }
        private static void coseContoCorrente()
        {
            // COSE Es Conto Corrente
            ContoCorrente alice = new ContoCorrente("Alice", 100);
            ContoCorrente bob = new ContoCorrente("Bob");

            Main.stampaLinea(alice.toString());
            Main.stampaLinea(bob.toString());


            Main.stampaLinea(String.valueOf(alice.nextAccount));
            Main.stampaLinea(String.valueOf(bob.nextAccount));
            Main.stampaLinea(String.valueOf(ContoCorrente.nextAccount));
            bob.deposito(50);
            Main.stampaLinea(bob.toString());
        }
        private static void calcolatore()
        {

            // Calcolatrice
            Calcolatrice basic = new Calcolatrice();
            basic.operate("+", 3);
            basic.operate("-", 1);
            basic.operate("*", 15);
            basic.operate("/", 3);

            Calcolatrice advanced = new Calcolatrice();
            advanced.firstValue(10); //Assign 10 to result
            advanced.operate("C"); //Reset result to 0
            advanced.operate("cos", 0); //Assign cos(0) to result
            advanced.operate("C"); //Reset result to 0
            advanced.operate("sin", 0); //Assign sin(0) to result
            advanced.operate("C"); //Reset result to 0
            advanced.operate("tan", 0); //Assign tan(0) to result
            //advanced.operate("C"); //Reset result to 0
            //advanced.operate("!", 5); //Assign the value of 5! to result (120)
            //advanced.operate("C"); //Reset result to 0
            advanced.operate("e"); //Assign the value of "e" to result
            //advanced.operate("+", 1.25);
            //advanced.operate("+", "pi"); //Add the value of pi to result

        }
        private static void accessControl()
        {
            Main.stampaLinea("ACCESS CONTROL\tModificatore\t\tClasse\tPackage\tSubClass World");
            Main.stampaLinea("\t\t\tpublic  \tsi\tsi\tsi\tsi");
            Main.stampaLinea("\t\t\tprotected\tsi\tsi\tsi\tno");
            Main.stampaLinea("\t\t\t\t\tsi\tsi\tno\tno");
            Main.stampaLinea("\t\t\tprivate\t\tsi\tno\tno\tno");
        }
        private static void secOreMinuti()
        {
            TimeHelper t1 = new TimeHelper(7320);
            System.out.println(t1.inHours());
            System.out.println(t1.inMinutes());
            System.out.println(t1.toString());

        }
        private static void auleHeapGC(){
            Classroom c[] = new Classroom[10];
            for(int s = 0; s<10; s++)
                c[s] = new Classroom(10 + (int)(Math.random() * ((250 - 10) + 1))); // Random value in the range [Min,Max] [10-250]
            Main.stampaLinea("RICHIAMO Metodo di classe Totale Classi:"+ Classroom.getNumberOfClassrooms()+ "\n\t Aulamagna "+Classroom.getMaxCapacityClassroom().toString());
            Main.stampaLinea("| Aula  | Posti |");
            Main.stampaLinea("|-------|-------|");
            for(int s = 0; s<10; s++)
                Main.stampaLinea("|"+c[s].getClassroomNumber()+"\t|"+c[s].getCapacity()+"\t|"+(Classroom.getMaxCapacityClassroom()==c[s]?"*":""));
            Main.stampaLinea("-----------------");
            Main.stampaLinea(" HEAP memory totaale " +Runtime.getRuntime().totalMemory()+ " Libera : "+Runtime.getRuntime().freeMemory());
            for(int s = 0; s<10; s++)
                c[s] = new Classroom(10 + (int)(Math.random() * ((Classroom.getMaxCapacityClassroom().getCapacity() - 10)))); // Random value
            Main.stampaLinea(" HEAP memory totaale " +Runtime.getRuntime().totalMemory()+ " Libera : "+Runtime.getRuntime().freeMemory());
            Main.stampaLinea("Dopo questo ciclo for ogni oggetto precedente che fine ha fatto ?");
            Main.stampaLinea("La nuova classe in c[3]=" +c[3].toString() +" e la classe 103 come posso vedere che capienza ha ?");
            Main.stampaLinea("La sola classe tra la 100 e la 109 che posso individuare e' l'aulamagna " +Classroom.getMaxCapacityClassroom().toString());
            Main.stampaLinea("Le restanti Aule (oggetti) non sono piu' utilizzabili in Java c'e' un processo che ");
            Main.stampaLinea("RUNTIME raccoglie e toglie dalla Memoria HEAP tutti gli elementi non piu' referenziabili il suo nome e' Java Garbage Collection");
            Main.stampaLinea("Start up opsion di java  -Xms e -Xmx definiscono dimensioni heap");

        }
        public static void veicoloInterface() {
            Auto taxi = new Auto(4);
            Main.stampaLinea("Taxi ha ruote? " + taxi.conRuote() + " Number of wheels: " + taxi.getNumberoRuote());
            Moto guzzi = new Moto(2);
            Main.stampaLinea("Guzzi ha ruote? " + guzzi.conRuote() + " Number of wheels: " + guzzi.getNumberoRuote());

        }
        public static void carte() {

            PokerCard eightOfSpades = new PokerCard(4, 8);
            PokerCard tenOfHearts = new PokerCard(3, 10);

            System.out.println(eightOfSpades.compareTo(tenOfHearts));

            System.out.println(tenOfHearts.compareTo(eightOfSpades));

            System.out.println(eightOfSpades.compareTo(eightOfSpades));
        }

        static void auto(){
            Main.stampaLinea("Ereditarieta' la classe figlio F1 eredita dal padre ed estende attributi e metodi");
            Auto ferrari = new AutoF1(320);
            Auto coupe =  new Auto(4,220);
            AutoF1 redBull = new AutoF1(340);
            ferrari.printDescription();
            coupe.printDescription();
            redBull.printDescription();
            // esempi del polimorfismo dell'istanza ferrari
            ferrari=coupe;
            ferrari.printDescription();
            ferrari= redBull;
            ferrari.printDescription();
            // NON e' Possibile redBull=ferrari;
            redBull.printDescription();
        }
        //  import A.Band
        static void laBand(){

            Human john = new Human("john");
            john.printName();
            Human louis = new BandMember("louis");
            BandMember jack = new BandMember("jack");

            john.printName();
            louis.printName();
            jack.printName();

            jack.canta();
            //https://codeboard.io/projects/45957
            //	jack.playFavoriteSong();
        }
        public static void orso() {
            Animal animal = new Animal();
            Animal bear = new OrsoPolare();

            animal.eat();
            bear.eat();

            //Main.stampaLinea(animal.hasEaten);
            //Main.stampaLinea(bear.color);
        }
        static void intro(){
            Main.stampaLinea("Una classe e' il progetto da cui vengono creati singoli oggetti.");
            Main.stampaLinea("Una classe e' una rappresentazione, astratta ma rappresentazione della realta', le entita' vivranno nei nostri programmi.");
            Main.stampaLinea("Una classe potrebbe contenere alcuni attributi che definiscono le sue caratteristiche.");
            Main.stampaLinea("Una classe potrebbe contenere alcuni metodi per eseguire le operazioni con se stesso o oggetti dalla stessa classe o altro");
            Main.stampaLinea("<a href=\"https://docs.oracle.com/javase/tutorial/java/javaOO/classdecl.html\">https://docs.oracle.com/javase/tutorial/java/javaOO/classdecl.html</a>");

        }
        public static void main() {
            Main.stampaLinea("Hello World! Mondo di Classi Oggetti e Metodi");

            intro();
            pausa();
            BicycleDemo.main();
            pausa();
            Main.stampaLinea("<a href=\"https://docs.oracle.com/javase/8/docs/api/index.html\">LE API di java un insieme di Package. Package insieme di classi ed interfacce</a>");
            pausa();
            IdentifyMyParts.main();

            animali(); // Cane.java
            uomini();  // Umano.java
            coseContoCorrente(); //ContoCorrente.java
            calcolatore(); //Calcolatrice-java


            secOreMinuti();  // TimeHelper.java
            auleHeapGC();  // Classroom.java
            accessControl();
            veicoloInterface();  // Interfacce richiede delle funzionalita' che devono essere implementate dalla classe per essere considerata tale
            carte(); // Interfacce esempio 2
            auto();// Inheritance
            laBand(); //Polimorfismo
            // Card.main(args); nel pacchetto gioco carte  DA METTERE A POSTO
            ShadowTest.main();
            pausa();
            DataStructure.main();
            pausa();
            Caratteri.main();

        }
    }


