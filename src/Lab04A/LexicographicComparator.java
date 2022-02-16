package Lab04A;

import java.util.Comparator;

/**
 * Name: Aditya Verma
 * Date: Feb 15, 2022
 * Description: Lab 04 "Inheritance, and Interfaces" Submission for CS321.
 */

/**
 * Defines an lexicographic-comparator class that compares two names.
 * Implements the Comparator Interface.
 */
public class LexicographicComparator implements Comparator<Person> {
    /**
     * Method to compare the ages
     *
     * @param arg0 ; a Person Object
     * @param arg1 ; a Person Object
     * @return ret; an integer; When names are same length, checking for their lexicographic difference
     * @return an integer ; When both names are of different lengths
     * @return 0; an integer ; when names are equal
     */
    public int compare(Person arg0, Person arg1) {

        //When names are same length, checking for their lexicographic difference
        for (int i = 0; i < arg0.getName().length() && i < arg1.getName().length(); i++) {
            if ((int) (arg0.getName()).charAt(i) == (int) (arg1.getName()).charAt(i)) {
                continue;
            } else {
                int ret = (int) arg0.getName().charAt(i) - (int) arg1.getName().charAt(i);
                return ret;
            }

        }
        //When both names are of different lengths
        if (arg0.getName().length() < arg1.getName().length()) {
            return ((arg0.getName().length() - (arg1.getName().length())));
        } else if ((arg0.getName().length() > arg1.getName().length())) {
            return ((arg0.getName().length() - arg1.getName().length()));
        }
        //returning 0, none of the conditions above return, meaning the names are equal
        return 0;
    }
}
