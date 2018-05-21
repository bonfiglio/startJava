package us.phpnet.fabrizio.cap1_INTRO.fileIO;



import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//Just reading bytes
public class FileStreams {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void getFile(String fileIn , int att  ) throws Exception {
        FileInputStream input = null;
        FileOutputStream output = null;
        System.out.println(ANSI_GREEN +"######["+fileIn+"]######");
        //Byte per Byte
        try {
            input = new FileInputStream(fileIn);
            //  output = new FileOutputStream("src/us/phpnet/fabrizio/fileIO/fout.txt");

            int character ='\u0108';

            while( (character = input.read()) != -1 ){
                try {  System.out.printf("%c",character);
                    Thread.sleep(att);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }

                // System.out.print("\t");
                // output.write(character);
                //  output.write(character);
            }
        } finally {
            System.out.println(ANSI_RESET);
            if (input != null){
                input.close();
            }
            if (output != null){
                output.close();
            }
            //  System.out.println("\n Input and ouput Closed ");
        }
    }

    public static void getFile(String fileIn ) throws Exception {
            getFile(fileIn,100);
        }
    }

