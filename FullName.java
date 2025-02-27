import java.util.Scanner;

public class FullName {

    public static void main(String[] args) {
    
    Scanner myInput = new Scanner(System.in);

    String firstName, lastName, fullName;

    System.out.println("Please fill out the following questions:");
    System.out.println("----------------------------------------------");

    System.out.println("First name:");
    firstName = myInput.next();

    System.out.println("Last name:");
    lastName = myInput.next();

    System.out.println("Hello, my name is " + firstName + " " + lastName + " ");

    myInput.close();    
    
    }
}