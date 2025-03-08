import java.util.Scanner;

public class interval {

    public static void main(String[] args) {
    
        Scanner myInput = new Scanner(System.in);

        Double lower, upper, num;

        System.out.println("What is the lower range");
        lower = myInput.nextDouble();

        System.out.println("What is the upper range");
        upper = myInput.nextDouble();

        System.out.println("Value of Num");
        num = myInput.nextDouble();

        if (num > lower && num < upper) {
            System.out.println("The value of " + num + " is within the range of " + lower + " and " + upper);
        } else {
            System.out.println("The value of " + num + " is not within the range of " + lower + " and " + upper);
        }
        myInput.close();
    }
}