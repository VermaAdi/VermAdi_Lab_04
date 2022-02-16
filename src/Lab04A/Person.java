package Lab04A;

/**
 * Name: Aditya Verma
 * Date: Feb 15, 2022
 * Description: Lab 04 "Inheritance, and Interfaces" Submission for CS321.
 */

/**
 * Class defining the Person Object
 */
public class Person {

    //instance variables
    private String name;
    private int age;

    /**
     * Constructor Person initialising the private instance variables
     *
     * @param age  ; an integer ; age of the person
     * @param name ; a String ; the name of the person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Getter method for name variable
     *
     * @return name ; a String; name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for age variable
     *
     * @return age ; an integer ; age of the person
     */
    public int getAge() {
        return age;
    }
}


