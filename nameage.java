import java.util.Scanner;

public class nameage {

    public static void main(String[] args) {
    
    Scanner myInput = new Scanner(System.in);
    
    String name1, name2, name3, name4, name5;
    int age1, age2, age3, age4, age5;

    System.out.println("Hello what is your first name?");
    name1 = myInput.next();
    System.out.println("What is " + name1 + "'s Age");
    age1 = myInput.nextInt();

    System.out.println("Hello what is your first name?");
    name2 = myInput.next();
    System.out.println("What is " + name2 + "'s Age");
    age2 = myInput.nextInt();
    
    System.out.println("Hello what is your first name?");
    name3 = myInput.next();
    System.out.println("What is " + name3 + "'s Age");
    age3 = myInput.nextInt();

    System.out.println("Hello what is your first name?");
    name4 = myInput.next();
    System.out.println("What is " + name4 + "'s Age");
    age4 = myInput.nextInt();

    System.out.println("Hello what is your first name?");
    name5 = myInput.next();
    System.out.println("What is " + name5 + "'s Age");
    age5 = myInput.nextInt();

    System.out.println("------------------------------------------------");


    System.out.println("Person 1:\n Name " + name1 + "\n age " + age1);
    System.out.println("------------------------------------------------");

    System.out.println("Person 2:\n Name " + name2 + "\n age " + age2);
    System.out.println("------------------------------------------------");

    System.out.println("Person 3:\n Name " + name3 + "\n age " + age3);
    System.out.println("------------------------------------------------");

    System.out.println("Person 4:\n Name " + name4 + "\n age " + age4);
    System.out.println("------------------------------------------------");

    System.out.println("Person 5:\n Name " + name5 + "\n age " + age5);
    System.out.println("------------------------------------------------");

myInput.close();

    }
}