package us.phpnet.fabrizio.cap1_INTRO.cap99_DATABASE;

import us.phpnet.fabrizio.cap1_INTRO.cap99_DATABASE.db.ConnectDB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static us.phpnet.fabrizio.cap1_INTRO.Main.pausa;

public class dbMain {
    public  static void main() {
    BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));


    do {
        System.out.println("######[ BENVENUTO AL CORSO JAVA - DATABASE ]######");
        System.out.println("#  1 - connessione db ");
        System.out.println("#  2 - Cos'è Java ");
        System.out.println("#  3 - Input in Java ");
        System.out.println("#  4 - Parole chiave  (riservate) ");
        System.out.println("#  5 - Java linguaggio statically-typed ");
        System.out.println("#  6 - Operatori di confronto ");
        System.out.println("#  7 - Java controllo del flusso di esecuzione " );
        System.out.println("#  8 - Classi e oggetti " );

        System.out.println("# 10 - Test Connessione a Data Base Prova " );
        System.out.print("######[Inserisci un numero (0=exit):");
        try{
            int choice = Integer.parseInt(bufr.readLine());
            switch (choice) {
                case 0:
                    System.out.print("######[Grazie e alla prossima ]######");
                    pausa();
                    return;
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;


                case 8:

                    break;
                case 10:
                    ConnectDB.test();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

            System.out.println("----Unità "+choice+ " Completata. Grazie per l'attenzione ");
            pausa();
            System.out.println("\n\n\n");
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }while (true);
}
}

