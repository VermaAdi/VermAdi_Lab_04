package Lab04A;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Name: Aditya Verma
 * Date: Feb 15, 2022
 * Description: Lab 04 "Inheritance, and Interfaces" Submission for CS321.
 */

/**
 * The class implements checks for the lexicographic-comparator and the age-comparator
 */
public class Main {
    /**
     * The function tests the age-comparator and lexicographic-comparator implementations
     *
     * @param args A string array containing the command line arguments
     */
    public static void main(String[] args) {

        //initialising 5 Person Objects
        Person p1 = new Person("Bryan", 21);
        Person p2 = new Person("Avi", 25);
        Person p3 = new Person("Michael", 42);
        Person p4 = new Person("Heather", 15);
        Person p5 = new Person("Sorn", 11);

        List<Person> people = Arrays.asList(p1, p2, p3, p4, p5);

        //printing the array before lexicographic sorting of the people
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("List before Lexicographic sorting: ");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName() + " - " + people.get(i).getAge());
        }

        //sorting the array using lexicographic comparison of the people
        Collections.sort(people, new LexicographicComparator());

        //printing the array after lexicographic sorting of the people
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("List after Lexicographic sorting: ");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName() + " - " + people.get(i).getAge());
        }

        //printing the array before age-wise sorting of the people
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("List before Age-wise sorting: ");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName() + " - " + people.get(i).getAge());
        }

        //sorting the array using age-wise comparison of the people
        Collections.sort(people, new AgeComparator());

        //printing the array after age-wise sorting of the people
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("List after Age-wise sorting: ");
        System.out.println();
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName() + " - " + people.get(i).getAge());
        }
    }
}
