package us.phpnet.fabrizio.cap1_INTRO.cap2_OOP.esercizi;

/*
Create a class called Classroom with the following functionality.

        Instance variables to represent the room number and student capacity of each classroom.
        The constructor only receives a number as argument, that represents the capacity.
        A class variable to keep track of the next available room number, so the first classroom created is numbered 101, and increasing by one with each new instance created.
        A class variable that contains a reference to the highest capacity classroom created. Note that this variable should be of type Classroom, the same type of the class that you will be implementing.
        A method called toString() that returns a readable representation of the classroom, including its number and capacity.

        A method getNumberOfClassrooms() that returns the amount of classrooms created. This method is a class method, that is, it uses the static keyword.
        A method getCapacity() that returns the capacity of the classroom.

        A method getClassroomNumber() that returns the number of a classroom.
        A method getMaxCapacityClassroom() that returns the reference to the highest capacity classroom. Note that this method will return an object of type Classroom, and should be a class method.
*/

public class Classroom {
    static private int startClass=100;
    static private int nextAvailableRoomNumber=startClass;
    static Classroom highestCapacityClassroom;
    private int capacity=0,roomNumber;
    public Classroom( int cap){
        if ((nextAvailableRoomNumber==startClass) || (cap>highestCapacityClassroom.getCapacity()))
            highestCapacityClassroom=this;
        this.capacity=cap;this.roomNumber=nextAvailableRoomNumber++;
    }
    public int getCapacity(){return this.capacity;}
    public int getClassroomNumber() {return this.roomNumber;}
    public String toString() {return "Classroom #"+this.roomNumber+"\t"+this.capacity;}
    static public int getNumberOfClassrooms() {return nextAvailableRoomNumber-startClass; }
    static public Classroom getMaxCapacityClassroom() {return highestCapacityClassroom;}

}