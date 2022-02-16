package Lab04A;

import java.util.Comparator;

/**
 * Name: Aditya Verma
 * Date: Feb 15, 2022
 * Description: Lab 04 "Inheritance, and Interfaces" Submission for CS321.
 */

/**
 * Defines an age-comparator class that compares two ages.
 * Implements the Comparator Interface.
 */
public class AgeComparator implements Comparator<Person> {

    /**
     * Method to compare the ages
     *
     * @param arg0 ; a Person Object
     * @param arg1 ; a Person Object
     * @return 0 ; an integer; when ages are equal
     * @return -1 ; an integer; when the arg0 is smaller than arg1
     * @return 1 ; an integer; when the arg0 is greater than arg1
     */
    public int compare(Person arg0, Person arg1) {
        //return 0 when ages are equal
        if (arg0.getAge() == arg1.getAge()) {
            return 0;
        }
        //return -1 when the arg0 is smaller than arg1
        else if (arg0.getAge() < arg1.getAge()) {
            return -1;
        } else {
            //return 1 when the arg0 is greater than arg1
            return 1;
        }
    }
}
