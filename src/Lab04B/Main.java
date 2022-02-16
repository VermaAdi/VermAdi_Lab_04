package Lab04B;

/**
 * Name: Aditya Verma
 * Date: Feb 15, 2022
 * Description: Lab 04 "Inheritance, and Interfaces" Submission for CS321.
 */

/**
 * The program initialises an Instructor array with 3 different kinds of Instructor objects,
 * adds emails to each one over 10 days and tests how each Instructor Object manages it.
 */
public class Main {
    /**
     * Tests 3 different Instructor Object performances over 10 days of email-receiving.
     *
     * @param args A string array containing the command line arguments
     */
    public static void main(String[] args) {
        Faculty faculty = new Faculty(19, 255);
        Grad grad = new Grad(25, 9);
        Lecturer lecturer = new Lecturer(44, 32);

        Instructor[] instructors = new Instructor[]{grad, lecturer, faculty};

        // Sending emails to all the Instructor Objects for 10 days.
        for (int days = 1; days <= 10; days++) {
            int mail = (days * 10) + 50;
            instructors[0].getMail(mail);
            instructors[1].getMail(mail);
            instructors[2].getMail(mail);
        }

        //Printing the result after 10 days of sending emails
        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("RESULT AFTER 10 DAYS:");
        System.out.println("--------------------------------------------------------------------");

        System.out.println("Graduate Students: ");
        System.out.println(instructors[0].toString());

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("Lecturers: ");
        System.out.println(instructors[1].toString());

        System.out.println("\n--------------------------------------------------------------------");
        System.out.println("Faculty: ");
        System.out.println(instructors[2].toString());
    }
}
