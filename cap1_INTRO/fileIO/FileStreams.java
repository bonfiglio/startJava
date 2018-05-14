package us.phpnet.fabrizio.cap1_INTRO.fileIO;



import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//Just reading bytes
public class FileStreams {
        public static void getFile(String fileIn) throws Exception {
            FileInputStream input = null;
            FileOutputStream output = null;

            //Byte per Byte
            try {
                input = new FileInputStream(fileIn);
              //  output = new FileOutputStream("src/us/phpnet/fabrizio/fileIO/fout.txt");

               int character ='\u0108';

                while( (character = input.read()) != -1 ){
                    try {  System.out.printf("%c",character);
                        Thread.sleep(100);
                    } catch(InterruptedException ex) {
                        Thread.currentThread().interrupt();
                    }

                   // System.out.print("\t");
                   // output.write(character);
                  //  output.write(character);
                }
            } finally {
                if (input != null){
                    input.close();
                }
                if (output != null){
                    output.close();
                }
              //  System.out.println("\n Input and ouput Closed ");
            }
        }
    }

