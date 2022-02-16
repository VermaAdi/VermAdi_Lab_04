package Lab04B;

import java.util.Random;

/**
 * Name: Aditya Verma
 * Date: Feb 15, 2022
 * Description: Lab 04 "Inheritance, and Interfaces" Submission for CS321.
 */

/**
 * Defines the Grad Object inheriting from the Instructor class.
 * Defines the Grad's cope() function.
 * Overrides the stress() function.
 */
public class Grad extends Instructor {

    /**
     * Constructor Grad initialising the private instance variables
     * Calling the super Constructor in the class Instructor
     *
     * @param age        ; an integer ; age of the instructor
     * @param unreadMail ; an integer ; number of unread emails the instructor has
     */
    public Grad(int age, int unreadMail) {
        super(age, unreadMail);
    }

    @Override
    /**
     * Defining the Grad's cope() function
     */
    public void cope() {
        this.setUnreadMail(0);
        Random random = new Random();
        int eccentRandom = random.nextInt(2);
        if (eccentRandom == 1) {
            addToEccentricities(3);
        } else {
            addToEccentricities(-3);
        }
    }

    /**
     * Overriding the Instructor's stress() function
     * specific to the Grad object
     *
     * @return an integer; the stress value for the Grad
     * @return -1; when unread emails go over 1500.
     */
    public int stress() {
        if (getUnreadMail() > 1500) {
            return -1;
        } else {
            return getUnreadMail();
        }
    }
}
