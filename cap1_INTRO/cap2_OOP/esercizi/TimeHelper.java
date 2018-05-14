package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.esercizi;



/**Create a class called TimeHelper with the following functionality:

 One constructor that receives one number as argument and saves it in an instance variable.
 This value represents a number of seconds.

 One method called inMinutes() that gives us the amount of minutes in the time we specified.

 One method called inHours() that gives us the amount of hours in the time we specified.

 The toString() method for this class, that displays the amount of hours, minutes and seconds in the specified time.
 If you only have one hour, display it as hour; if you have another amount, display it as hours.
 Do the same with minutes and seconds.

 Examples:
 We create a TimeHelper object, with the value 3700.
 inMinutes() will give us a value of 61,
 inHours() will give us a value of 1,
 toString() will give us the string "1 hour 1 minute 40 seconds".

 We create another TimeHelper object, with the value 7320.
 inMinutes() will give us a value of 122,
 inHours() will give us a value of 2,
 toString() will give us the string "2 hours 2 minutes 0 seconds." */


public class TimeHelper{
    private int seconds=0;
    public TimeHelper ( int sec ){this.seconds=sec;}
    public int inMinutes() {return this.seconds/60;}
    public int inHours() {return this.seconds/3600;}
    public String toString() { return this.seconds/3600 + " hours "
            + (this.seconds/60 - this.seconds/3600*60) +" minutes "
            + (this.seconds - this.seconds/60*60)+" seconds" ;

    }

}