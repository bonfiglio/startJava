package us.phpnet.fabrizio.cap1_INTRO.cap99_DATABASE;

import us.phpnet.fabrizio.cap1_INTRO.cap99_DATABASE.db.ConnectDB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static us.phpnet.fabrizio.cap1_INTRO.Main.pausa;
import static us.phpnet.fabrizio.cap1_INTRO.Main.stampaLinea;

public class dbMain {
    public  static void main() {
    BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));


    do {
        System.out.println("######[ BENVENUTO AL CORSO JAVA - DATABASE ]######");
        System.out.println("#  1 - Introduction to JDBC");
        System.out.println("#  2 - Always use prepared statements per SICUREZZA del DB  ");
        System.out.println("#  3 - Data Access Object (DAO) ");
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
                    introduzione();
                    break;
                case 2:
                    usoPreparedStatements();

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

    private static void usoPreparedStatements() {
        stampaLinea("LOGICA Per separa la creazione dello statement dalle sua esecuzione \n"+
                        "PASSO 1\n"+
                "\tString template = \"UPDATE music SET price = ? WHERE id= ? \";\n"+
        "PASSO 2\n"+
                "\t PreparedStatement stm =connection.prepareStatement(template);\n"+
                "\t stm.setFloat(1,5.15);  // Price primo ?  sostituisco con 5.15\n" +
                "\t stm.setInt(2,101); // ID  secondo ? sostituisco con  101 \n"+
                "PASSO 3\n"+
                "\t stm.execute();");

    }

    private static void introduzione() {
        stampaLinea("*******\t* Abilitare un'applicatione Java ad accedere ai dati di un Relational Data Base *******");
        stampaLinea("\t* Data can be used by" );
        stampaLinea("\t* - The user, through the user interface");
        stampaLinea("\t* - The algorithms running in the application");

        stampaLinea("\t*Standard library for accessing relational databases : JDBC (Java Database Connectivity)");
        stampaLinea( "\t* Compatible with most/all different databases ");
        stampaLinea("\t* Defined in package java.sql and javax.sql ");
        stampaLinea("\t*Documentation:\n" +
                "Doc Index: \n" +
                "\thttp://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/index.html\n" +
                "\thttp://www.oracle.com/technetwork/java/javase/tech/database-137795.html\n" +
                "JDBC Overview: \n" +
                "\thttp://www.oracle.com/technetwork/java/overview-141217.html\n" +
                "Tutorial\n" +
                "\thttp://docs.oracle.com/javase/tutorial/jdbc/basics/index.html" );
        stampaLinea( "\t* JDBC SCOPO Standardizzare\n" +
                "Il meccanismo per  connettersi ai diversi DBMSs\n" +
                "Fornire una Sintassi per  inviare interrogoazioni\n" +
                "Strutture di rappresentazione dei risultati");
        stampaLinea( "\t* JDBC NON  Standardizza\n" +
                "dialects, variants, extensions, dei diversi DBMSs\n" +
                "Comparison of different SQL implementations\n" +
                "http://troels.arvin.dk/db/rdbms/");
        stampaLinea("Elementi principali\n" +
                "Java application (Applicazione in Java es.JavaFX)\n" +
                "JDBC Driver Manager Sorgente dei dati\t" + "For loading the JDBC Driver\n" +
                "JDBC Driver\t" + "From DBMS vendor una classe per applicazione java fornita del Vendor del DBMS \n" +
                "DBMS\t"+ "Es: MySQL o MariaDB l'applicazione in esecuzione carica classe driver rensendo app versatile per diversi RDBMS");
        stampaLinea("PASSI BASE  PRATICI \n" +
                        "1.Definire l'URL della connessione \n\t"+
                "String URLString =\"jdbc:mysql://\n\t" +
                "host:port (localhost)\n\t" +
                "/database\n\t" +
                "?user=username\n\t" +
                "&password=ppppppp\");\n"+
                        "2.Stabilire la connessione \n"+
                "\tDriverManager.getConnection(URLString);\n"+
                "3. Creare un object statement\n"+
                "\tStatement statement= connection.createStatement() ; nel caso di Sql Statement senza parametri\n"+
                " \tATTENZIONE USARE PreparedStatement object per ragioni di sicurezza nel caso di statement con parametri  \n"+
                "4. Esequire una query o un update \n"+
                "\tResultSet executeQuery(String sqlStr); // Se sqlStr Stringa con SELECT \n"+
                "\tint executeUpdate(String sqlStr); // Per INSERT, UPDATE, or DELETE statements ritorna numero righe\n " +
                "\t\t // per CREATE TABLE ritorna 0\n" +
                "\tboolean execute(String sqlstr) //Per SQL statemens generali \nEsempio\n"+
                        "\tString query = \"SELECT id, name FROM user\" ;\n" +
                        "\tResultSet resultSet= statement.executeQuery(query) ;\n"+
                        "5. Processare  i risultati \n"+
                "\tResultSet object implementa un “cursore” sulla query; ResultSet.next() Metodo per avanzare di 1 riga\n"+
                "\tgetInt, getString, getBoolean, getDate, getDouble..( int columnIndex OPPURE  String colunnaNome);\n"+
                "6. Chiudere la connection\n" +
                "\tresultSet.close(); //Ogni return porta a un resultSet  che può essere liberato \n"+
                "\tconnection.close() ; // Connessione da chiudere ");
        return ;
    }
}

