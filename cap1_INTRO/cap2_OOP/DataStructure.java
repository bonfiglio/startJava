package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP;

public class DataStructure {

    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE]; // ARRAY DI 15 INTERI

    public DataStructure() {
        // fill the array with ascending integer values 0 1 2 ...... 14
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() { // un metodo che stampa gli elementi dell'array che hanno un indice pari valore

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }
    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    /*La classe interna EvenIterator , che implementa l'interfaccia DataStructureIterator , che estende l'interfaccia Iterator < Integer > .
 Iteratori sono utilizzati per passare attraverso una struttura di dati e tipicamente hanno metodi per testare l'ultimo elemento,
    recuperare l'elemento corrente e passare all'elemento successivo. */

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {
            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
            // Get the next even element
            nextIndex += 2;
            return retValue;
        }
        /* Si noti che la classe EvenIterator riferisce direttamente alla variabile
        di istanza DataStructure dell'oggetto DataStructure .

E' possibile utilizzare classi interne per implementare classi di helper, come quella riportata in questo esempio.
Per gestire gli eventi dell'interfaccia utente, e' necessario sapere come utilizzare le classi interne,
perche' il meccanismo di gestione degli eventi li usa in modo estenso. */
    }

    public static void main() {
        System.out.println("<a href=\"https://docs.oracle.com/javase/tutorial/java/javaOO/innerclasses.html\">Inner Class Example</a>");

        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}