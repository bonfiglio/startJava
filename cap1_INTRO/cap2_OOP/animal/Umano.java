package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.animal;
//Attenzione per le date
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Umano{
    char genere; // 'F' or 'M'
    String firstNames, lastName , artName;
    Umano partner;
    int identificationNumber;
    int yearBirth;
    int monthBirth;
    int dayBirth;
    public Umano(String  nome)
    {
        this.artName=nome;
    }
    public Umano(String firstNames, String lastName, char gender){
        this.firstNames = firstNames;
        this.lastName = lastName;
        this.genere = gender;
    }

    public void speak(String words){
        System.out.println(words);
    }

    public void addPartner(Umano humanCouple){
        this.partner = humanCouple;
        humanCouple.partner = this;
    }

    public Umano getPartner(){
        return this.partner;
    }

    public void setId(int id){
        identificationNumber = id;
    }

    public int getId(){
        return identificationNumber;
    }

    public void setBirthDate(int yearBirth, int monthBirth, int dayBirth){
        this.monthBirth = monthBirth;
        this.dayBirth = dayBirth;
        this.yearBirth = yearBirth;
    }

    public int getAge(){
        //	Date today = new Date();
        GregorianCalendar gcalendar = new GregorianCalendar();

        // Display current time and date information.
        System.out.print("Date: ");
        System.out.print(gcalendar.get(Calendar.MONTH));
        System.out.print(gcalendar.get(Calendar.DATE));
        System.out.println( gcalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));
        //the current year represented by this date, minus 1900
        int currentYear = gcalendar.get(Calendar.YEAR);
        int age = currentYear - yearBirth;

        //0 is January, so add 1
        int currentMonth = gcalendar.get(Calendar.DATE);
        if(currentMonth < monthBirth){
            age--;
        }else if(currentMonth == monthBirth){
            //day of the Month
            int currentDay = gcalendar.get(Calendar.MONTH);
            if(dayBirth > currentDay){
                age--;
            }
        }
        return age;
    }

    public String getPartnerName(){
        return this.partner.getFullName();
    }

    public String getFullName(){
        return this.firstNames + " " + this.lastName;
    }
    public void printName(){
        System.out.println(artName);
    }
}