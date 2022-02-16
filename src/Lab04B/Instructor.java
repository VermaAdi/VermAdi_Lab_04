package Lab04B;

import java.lang.Math;
import java.util.Random;

/**
 * Name: Aditya Verma
 * Date: Feb 15, 2022
 * Description: Lab 04 "Inheritance, and Interfaces" Submission for CS321.
 */

/**
 * Abstract class creates a model defining how instructor objects
 * cope with unread emails and stress, and how their eccentricities
 * get affected.
 */
public abstract class Instructor {
    private int age;
    private int unreadMail;
    private int eccentricities;

    /**
     * Constructor Instructor initialising the private instance variables
     *
     * @param age        ; an integer ; age of the instructor
     * @param unreadMail ; an integer ; number of unread emails the instructor has
     */
    public Instructor(int age, int unreadMail) {
        this.age = age;
        this.unreadMail = unreadMail;
        this.eccentricities = 0;
    }

    /**
     * Getter method for age variable
     *
     * @return age ; an integer; age of the instructor
     */
    public int getAge() {
        return age;
    }

    /**
     * Getter method for unreadMail variable
     *
     * @return unreadMail ; an integer; number of unread emails the instructor has
     */
    public int getUnreadMail() {
        return unreadMail;
    }

    /**
     * Getter method for eccentricities variable
     *
     * @return eccentricities ; an integer; eccentricity points the instructor has
     */
    public int getEccentricities() {
        return eccentricities;
    }

    /**
     * Setter method for age variable
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Setter method for unreadMail variable
     */
    public void setUnreadMail(int unreadMail) {
        this.unreadMail = unreadMail;
    }

    /**
     * Setter method for eccentricities variable
     */
    public void setEccentricities(int eccentricities) {
        this.eccentricities = eccentricities;
    }

    /**
     * Abstract method that gets implements in any inheritances of this class
     */
    public abstract void cope();

    /**
     * Determines the stress value for the instructor
     *
     * @return stress ; an integer; the stress value
     */
    public int stress() {
        int stress = this.unreadMail;

        if (stress > 1000) {
            return -1;
        } else {
            return stress;
        }
    }

    /**
     * Determines the respect value for the instructor
     *
     * @return respect ; an integer; the respect value
     */
    public int respect() {
        int respect = getAge() - getEccentricities();
        if (respect < 0) {
            return 0;
        } else {
            return respect;
        }
    }

    /**
     * Reduced the mail by the given argument value (readMail)
     *
     * @param readMail ; an integer ; the value to reduce the unread emails by
     */
    public void reduceMail(int readMail) {
        //reducing unreadMail as long as there are more unreadMail than readMail,
        //to prevent unreadMail from becoming negative.
        if (this.unreadMail > 0) {
            this.unreadMail -= readMail;
        } else {
            setUnreadMail(0);
        }
    }

    /**
     * Adds function argument to the eccentricities of the instructor
     *
     * @param eccentricities ; an integer ; number of eccentricities to add
     */
    public void addToEccentricities(int eccentricities) {
        if (this.eccentricities > 0) {
            this.eccentricities += eccentricities;
        }
    }

    /**
     * Adds the function argument number of emails to the unread mails list
     *
     * @param newMail ; an integer ; the value to add to number of unread emails
     */
    public void getMail(int newMail) {
        this.unreadMail += newMail;

        Random r = new Random();
        double random = Math.random();
        int eccentricitiesRandom = r.nextInt(2);
        if (random < 0.2) {
            if (eccentricitiesRandom == 1) {
                this.eccentricities += 2;
            } else {
                this.eccentricities -= 2;
            }
        }

        if (stress() > respect()) {
            cope();
        }
    }

    @Override
    /**
     * toString method
     * @return a String ; the desired string output using the variables and functions
     */
    public String toString() {
        return "Age: " + this.getAge() + "\nUnread Emails: " + this.getUnreadMail()
                + "\nEccentricities: " + this.getEccentricities() + "\nStress: "
                + this.stress() + "\nRespect: " + this.respect();
    }

}
