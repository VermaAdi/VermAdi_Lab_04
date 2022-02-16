package Lab04B;

/**
 * Name: Aditya Verma
 * Date: Feb 15, 2022
 * Description: Lab 04 "Inheritance, and Interfaces" Submission for CS321.
 */

/**
 * Defines the Faculty Object inheriting from the Instructor class.
 * Defines the Faculty's cope() function.
 * Overrides the respect() function.
 */
public class Faculty extends Instructor {

    /**
     * Constructor Faculty initialising the private instance variables
     * Calling the super Constructor in the class Instructor
     *
     * @param age        ; an integer ; age of the instructor
     * @param unreadMail ; an integer ; number of unread emails the instructor has
     */
    public Faculty(int age, int unreadMail) {
        super(age, unreadMail);
    }

    @Override
    /**
     * Defining the Faculty's cope() function
     */
    public void cope() {
        addToEccentricities(30);
    }

    /**
     * Overriding the Instructor's respect() function
     * specific to the Faculty object
     *
     * @return an integer; the respect value for the Faculty
     */
    public int respect() {
        return getAge() + getEccentricities();
    }
}
