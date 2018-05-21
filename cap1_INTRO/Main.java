package us.phpnet.fabrizio.cap1_INTRO;

import us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.ClassiOggetti;
import us.phpnet.fabrizio.cap1_INTRO.fileIO.FileStreams;

/**
 * Main class of the Java program.
 * Vedi  anche  https://codeboard.io/projects/47129
 */

public class Main {


    private static  int attensa = 100;

    public static int getAttensa() {
        return attensa;
    }

    public static void setAttensa(int tempo) {
        attensa= tempo;

    }

    public static void pausa () {
        try {
            Thread.sleep(300);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void stampaLinea (String argo) {
        for (int i=0 ; i< argo.length(); i++)
            try { System.out.print(argo.charAt(i));
                Thread.sleep(attensa);

            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        System.out.print('\n');
    }
        
public static void javaOverview () {
        stampaLinea("Java is a platform this platform is a set of tools, components, elements that allow to develop Java programs.");
        stampaLinea("Green Project by James Goling : was intended to develop a language that you can use in embedded systems.");
        stampaLinea("Embedded systems ? "); pausa();
        stampaLinea("Si \"Embedded systems\"  cioe'   a small computer that exists in your car,\n\t\t in the microwave maybe in your watch (clock),\n\t\t where you need to run different instructions,\n\t\t execute some functions, to show some data or something like that.");
        stampaLinea("ma Java lavora anche su web  A plug-in browser that contains a small Java Virtual Machine in Netscape browser, and then they could run the applet. ");
        stampaLinea(" The applet is a small program written in Java and they can move some objects in the web.");pausa();
        stampaLinea("Ultima release Java SE 8");
        stampaLinea("Java : scrivi una volta ed esegui ovunque");
        stampaLinea("4 principali componenti della piattaforma Java ");
        stampaLinea("\t1\t LINGAGGIO JAVA tutte si basano sul linguaggio JAVA classes loops statements conditionals");
        stampaLinea("\t2.1\t\t Java Standard Edition  e' la base della platform, sono defilite le principali classi, utils e trovare le differenti 'collections', che si possono richiamare all'interno del programma");
        stampaLinea("\t2.2\t\t Java MICRO Edition  e' la base della platform orientata ai sistemi embedded , per piccole JVM (solo pochi kbyte");
        stampaLinea("\t2.3\t\t Java Card Edition  e' la base + piccola della platform, per le cards a microprocessore piccole funzioni di autorizzazione e autenticazione SIM");
        stampaLinea("\t\t Su queste parti vi sono le API Application Programming Interface  ");
        stampaLinea("\t\t\t Java TV Utilities per sistemi embedded focalizzati allo streaming video o media ingenerale ");
        stampaLinea("\t\t\t Java FX Utilities per applicaszioni stand-alone per Desktop Applications  ");
        stampaLinea("\t\t\t Java EE Utilities per il mondo dei SERVER WEB ");
        stampaLinea("<a href=\"http://rekse.altervista.org/javaoverview.png\">http://rekse.altervista.org/javaoverview.png</a>");
        pausa();
        }

public static void javaIs() {
        stampaLinea("Java is object-oriented that means Java is developed thinking in the object model then you have to develop ");
        stampaLinea("\t\t1- creating classes  creare una classe ");
        stampaLinea("\t\t2-  instantiating classes,");
        stampaLinea("\t\t3- and to build objects and all content related  to object-oriented program.");
        stampaLinea("Java is platform-independent that means");
        stampaLinea("\t\t  you don't have to think what is the platform where you'll run your program.");
        stampaLinea("<a href=\"https://www.tutorialspoint.com/java/java_quick_guide.htm\">https://www.tutorialspoint.com/java/java_quick_guide.htm</a>");
        stampaLinea("Java supporta i concetti fondamentali dell Object Oriented Programming: ");
        stampaLinea("Polymorphism");
        stampaLinea("Inheritance");
        stampaLinea("Encapsulation");
        stampaLinea("Abstraction");
        stampaLinea("Classes");
        stampaLinea("Objects");
        stampaLinea("Instance");
        stampaLinea("Method");
        stampaLinea("Message Parsing");
        stampaLinea("<a href=\"http://www.oracle.com/technetwork/java/javase/downloads/index.html\">Installare JDE http://www.oracle.com/technetwork/java/javase/downloads/index.html</a>");
        stampaLinea("<a href=\"https://www.jetbrains.com/idea/specials/idea/whatsnew.html?landing\">Installare IDE  suggerito IntelliJ IDEA</a>");

        pausa();
        }

public static void javaKeywords() {
        stampaLinea("Java Language Keywords PAROLE RISERVATE NON Usare come Identificatori ");
        stampaLinea("abstract	continue	for	\tnew	\tswitch");
        stampaLinea("assert***	default \tgoto*	\tpackage	\tsynchronized");
        stampaLinea("boolean	\tdo	\tif	\tprivate	\tthis");
        stampaLinea("break	\tdouble	\timplements	protected	throw");
        stampaLinea("byte	\telse	\timport	\tpublic	\tthrows");
        stampaLinea("case	\tenum****	instanceof	return	\ttransient");
        stampaLinea("catch	\textends	\tint	\tshort	\ttry");
        stampaLinea("char	\tfinal	\tinterface	static	\tvoid");
        stampaLinea("class	\tfinally	\tlong	\tstrictfp**	volatile");
        stampaLinea("const*	\tfloat	\tnative	\tsuper	\twhile\n");
        stampaLinea("*	 	not used");
        stampaLinea("**	 	added in 1.2");
        stampaLinea("***	 	added in 1.4");
        stampaLinea("****	 	added in 5.0");
        pausa();
}


public static void ifControlFlow() {
    stampaLinea("<a href=\"https://codeboard.io/projects/45885\">Control Flow (If ) 	</a>");
    stampaLinea("<a href=\"https://codeboard.io/projects/45937\">Control Flow (If ) 	</a>");
    stampaLinea("<a href=\"https://codeboard.io/projects/45943\">Control Flow (If ) 	</a>");
    try {
        FileStreams.getFile("src/us/phpnet/fabrizio/cap1_INTRO/IfControlFlow.java", attensa);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
public static void switchControlFlow() {
    stampaLinea("<a href=\"https://codeboard.io/projects/40831\">Control Flow (Switch Statement) 	</a>");
    stampaLinea("<a href=\"https://codeboard.io/projects/45938\">Control Flow (Switch Statement) 	</a>");
        try {
            FileStreams.getFile("src/us/phpnet/fabrizio/cap1_INTRO/SwitchControlFlow.java", attensa);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void whileDoWhile() {
        stampaLinea("####### ESEMPI DI : Control Flow (While Statement) e (Do While) #####");
        stampaLinea("# <a href=\"https://codeboard.io/projects/45910\">Control Flow (While Statement)</a>");
        stampaLinea("#<a href=\"https://codeboard.io/projects/45942\">Control Flow (While Statement)</a>");
        stampaLinea("#<a href=\"https://codeboard.io/projects/45912\">Control Flow (Do While)</a>");
        stampaLinea("#######  ######  ####  ###  ##  #");
            try {
                        FileStreams.getFile("src/us/phpnet/fabrizio/cap1_INTRO/WhileDoWhile.java", attensa);
                } catch (Exception e) {
                        e.printStackTrace();
                }
        pausa();
        String[] args=new String[0];
            WhileDoWhile.main(args);
        }
public static void javaControlFlow() {
        ifControlFlow();
        switchControlFlow();
        whileDoWhile();

        stampaLinea("<a href=\"https://codeboard.io/projects/45918\">Control Flow (To create Infinity Loops)</a>");
        stampaLinea("<a href=\"https://codeboard.io/projects/45925\">Control Flow (Branching Statement break)</a>");
        stampaLinea("<a href=\"https://codeboard.io/projects/45929\">Control Flow (Branching Statement continue)</a>");
        stampaLinea("<a href=\"https://codeboard.io/projects/45933\">Control Flow  (For Statement)</a>");
        stampaLinea("<a href=\"https://codeboard.io/projects/45940\">Control Flow  (For Statement)</a>");
        stampaLinea("<a href=\"https://codeboard.io/projects/45944\">Control Flow  (For Statement)</a>");
        stampaLinea("<a href=\"https://codeboard.io/projects/45945\">Classes, objects and methods </a>");
        stampaLinea("<a href=\"https://codeboard.io/projects/45947\">Screencast of class, object, method and constructor </a>");
        stampaLinea("<a href=\"https://codeboard.io/projects/45948\">More about classes, objects and methods 	</a>");
        stampaLinea("<a href=\"https://codeboard.io/projects/45951\">Choosing the correct type </a>");
        pausa();
        }
static void javaStatically(){
        stampaLinea("JAVA  Linguaggio statically-typed , tutte le variabili devono prima essere dichiarate e poi usate");
        stampaLinea("Tipe nomevariabile = valore; Una Varabile [area memoria che contiene dei valori] il type specifica che valori possono essere registrati e quali operazioni ");
        stampaLinea("Tipi di dato	Default Value (for fields) \t Literals");
        stampaLinea("\tbyte	\t\t0 \t\tbyte b = 112;");
        stampaLinea("\tshort	\t\t0 \t\tshort s = 1345;");
        stampaLinea("\tint	\t\t0 \t\tin decimale  int decVal = 26; , in hexadecimal int hexVal = 0x1a; in binary int binVal = 0b11010;");
        stampaLinea("\tlong	\t\t0L \t\tlong l = 13456789012; CONSIGLIO di usare  L  e non  l troppo simile al numero 1.");
        stampaLinea("\tfloat	\t\t0.0f \t\tfloat f1  = 123.4f;");
        stampaLinea("\tdouble	\t\t0.0d \t\tdouble d1 = 123.4;  stesso valore in notatione scientifica  double d2 = 1.234e2;");
        stampaLinea("\tchar	\t\t'\\u0000' \tchar capitalC = 'C';");

        stampaLinea("\tboolean	\t\tfalse \t\tboolean result = true;");
        stampaLinea("\tString (or any object)\tnull \t\tString msg=\"non e' tecnicamente un tipo di dato primitivo\";");
        stampaLinea("\tString sono degli oggetti sequenze di carattderi COMPARABILI SERIALIZZABILE ");

        stampaLinea("\nNOTE: Special escape sequences x char e String : \\b (backspace), \\t (tab), \\n (line feed), \\f (form feed), \\r (carriage return), \\\" (double quote), \\' (single quote), and \\\\ (backslash)");
        stampaLinea("\t caratteri in Unicode (UTF-16) Unicode escape such as '\\u0108' "+'\u0108');
        stampaLinea(" \tTra cifre numeriche per maggiore leggibilita' usare il  carattere (_)  Es: int 1234");
        pausa();
        }

static int operatoriConfronto(int x , int y )
        {
        stampaLinea("\t*******\t* OPERATORI DI CONFRONTO *******");
        stampaLinea("\t* Con x="+x +" e y="+ y );
        boolean a= true, b= false; // true  1   false 0
        stampaLinea("\t* Valori logici a="+a +(a?" Vero o true  ":" falso o false ")+"e b="+b+(b?" true ":" false "));

        stampaLinea("\t*\tUgualianza\t\t==\t(y==x) ->"+ (y==x) + (y==x?" true ":" false "));
        stampaLinea("\t*\tDiversi\t\t\t!=\t(y!=x) ->"+ (y!=x) + (y!=x?" true ":" false "));
        stampaLinea( "\t*\tMaggiore\t\t>\t(y>x) ->"+ (y> x) + (y>x?" true ":" false "));
        stampaLinea("\t*\tMaggiore Uguale\t>=\t(y>=x) ->"+ (y>=x) + (y>=x?" true ":" false "));
        stampaLinea("\t*\tMinore\t\t\t<\t(y< x) ->"+ (y<x) + (y<x?" true ":" false "));
        stampaLinea("\t*\tMinore Uguale\t<=\t(y<=x) ->"+ (y<=x) + (y<=x?" true ":" false "));
        stampaLinea("\t*******************************************" );
        return 0;
        }
public  static void main(String[] args) {
       attensa=1;
      stampaLinea("BENVENUTO AL CORSO JAVA1 ");
        javaOverview ();
        javaIs();
        javaKeywords();
        javaStatically();
        operatoriConfronto(3 , 9 );

        javaControlFlow();


        stampaLinea("\tThe term \"instance variable\" is another name for non-static field.");
        stampaLinea("\tThe term \"class variable\" is another name for static field.");
        stampaLinea("\tA local variable stores temporary state; it is declared inside a method.");
        stampaLinea("\tA variable declared within the opening and closing parenthesis of a method is called a parameter.");
        stampaLinea("\tWhat are the eight primitive data types supported by the Java programming language? byte, short, int, long, float, double, boolean, char");
        stampaLinea("\tCharacter strings are represented by the <a href=\"https://docs.oracle.com/javase/8/docs/api/java/lang/String.html\"> class java.lang.String. </a>");
        stampaLinea("\tAn array is a container object that holds a fixed number of values of a single type.");
    attensa=50;
        stampaLinea("<a href=\"https://codeboard.io/projects/47129\">Continua con Classi oggetti e metodi  </a>");



    ClassiOggetti.main();
        }
}