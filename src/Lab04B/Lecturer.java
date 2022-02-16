package Lab04B;

/**
 * Name: Aditya Verma
 * Date: Feb 15, 2022
 * Description: Lab 04 "Inheritance, and Interfaces" Submission for CS321.
 */

/**
 * Defines the Lecturer Object inheriting from the Instructor class.
 * Defines the Lecturer's cope() function.
 */
public class Lecturer extends Instructor {

    /**
     * Constructor Lecturer initialising the private instance variables
     * Calling the super Constructor in the class Instructor
     *
     * @param age        ; an integer ; age of the instructor
     * @param unreadMail ; an integer ; number of unread emails the instructor has
     */
    public Lecturer(int age, int unreadMail) {
        super(age, unreadMail);
    }

    @Override
    /**
     * Defining the Lecturer's cope() function
     */
    public void cope() {
        int deletedMail = (int) (0.6 * getUnreadMail());
        reduceMail(deletedMail);
    }
}
