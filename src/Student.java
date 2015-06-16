/**
 * The Student class keeps track of the following pieces of data
 * about a Student: the Student's name, ID number, and the number
 * of credits the Student has earned towards graduation.
 * All of this information is entirely private to the class.
 * Clients can obtain this information only by using the various
 * methods defined in the class.
 */


public class Student {

    /**
     * Creates a new Student object with the specified name and ID.
     * @param name The Student's name as a String
     * @param id The Student's ID number as an int
     */
    public Student(String name, int id) {
        studentName = name;
        studentID = id;
    }

    /**
     * Gets the name of this Student.
     * @return The name of this Student
     */

    public String getName() {
        return studentName;
    }

    /**
     * Gets the ID number of this Student.
     * @return The ID number of this Student
     */
    public int getID() {
        return studentID;
    }


    /**
     * Sets the number of units earned.
     * @param units The new number of units earned
     */
    public void setUnits (double units) {
        unitsEarned = units;
    }

    /**
     * Sets the number of units earned.
     * @return The number of units this Student has earned
     */
    public double getUnits() {
        return unitsEarned;
    }

    /**
     * Increments the number of units earned.
     * @param additionalUnits The additional number of units earned
     */
    public void incrementUnits(double additionalUnits) {
        unitsEarned += additionalUnits;
    }

    /**
     * Gets the number of units earned
     * @return Whether the Student has enough units to graduate
     */
    public boolean hasEnoughUnits() {
        return (unitsEarned >= UNITS_TO_GRADUATE);
    }

    /**
     * Creates a string identifying this Student.
     * @return The string used to display this Student
     */
    public String toString () {
        return studentName +
                " (#" + studentID + ")";
    }


    /* Public constants */

    /** The number of units required for graduation */
    public static final double UNITS_TO_GRADUATE = 180.0;

    /* Private instance variables */

    private String studentName; /* The Student's name           */
    private int studentID;      /* The Student's ID number      */
    private double unitsEarned; /* The number of units earned   */

}
