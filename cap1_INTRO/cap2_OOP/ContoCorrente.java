package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP;

public class ContoCorrente{
    // ATTRIBUTO  CAMPI
    public static int nextAccount = 1; //ATTRIBUTO DI CLASSE  VALDO PER TUTTI si dichiara static

    public String name;
    public int accountNumber;
    public int balance;

    public ContoCorrente(String n){
        name = new String(n);
        accountNumber = nextAccount;
        balance = 0;

        nextAccount++;
    }

    public ContoCorrente(String n, int b){
        name = new String(n);
        accountNumber = nextAccount;
        balance = b;

        nextAccount++;
    }

    public void deposito(int b){
        balance = balance + b;
    }
    // TUTTE LE CLASSI Hanno il metodo toString qui posso ridefinirlo overwrite method
    public String toString(){
        return "\nname: " + name + "\ncounto numero: " + accountNumber + "\nbilancio: " + balance;
    }
}