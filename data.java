import java.util.Scanner;

public class data {

    public static void main(String[] args) {
    
    Scanner myInput = new Scanner(System.in);

    String day, month;
    int date, year;

    System.out.println("Enter Day:");
    day = myInput.next();
    System.out.println("Enter Month:");
    month = myInput.next();

    System.out.println("Enter Date:");
    date = myInput.nextInt();
    System.out.println("Enter Year:");
    year = myInput.nextInt();

    System.out.println ("Amerian Format: " + day + ", " + month + ", " + date + ", " + year +" " );
    System.out.println ("European Format: " + day + ", " + date + ", " + month + ", " + year +" " );
    System.out.println ("Japanese Format: " + year + ", " + month + ", " + date + ", " + day +" " );

    myInput.close();
    
    }
}