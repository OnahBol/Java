import java.util.Scanner;

public class calcinput {

    public static void main(String[] args) {

    Scanner myInput = new Scanner(System.in);

    int Number1, Number2, Number3, Number4;
    
    System.out.println("Please fill out the following questions:");
    System.out.println("----------------------------------------------");

    System.out.println("First Number:");
    Number1 = myInput.nextInt();
    System.out.println("Second Number:");
    Number2 = myInput.nextInt();
    System.out.println("Third Number:");
    Number3 = myInput.nextInt();
    System.out.println("Fourth Number:");
    Number4 = myInput.nextInt();

    int totalNumber = Number1 + Number2 + Number3 + Number4;
        System.out.print("TOTAL: ");
        System.out.println(totalNumber);

    myInput.close();
    
    }
}   