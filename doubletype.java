import java.util.Scanner;

public class doubletype {

    public static void main(String[] args) {
    
    Scanner myInput = new Scanner(System.in);
    
    
    Double num1, num2, atotal, stotal, mtotal, dtotal;

    //atotal = addition total, stotal = subtraction total, mtotal = multiplication total, dtotal = division total

    System.out.println("Input a number:");
    num1 = myInput.nextDouble();
    System.out.println("Input a number:");
    num2 = myInput.nextDouble();

    atotal = num1 + num2;
    stotal = num1 - num2;
    mtotal = num1 * num2;
    dtotal = num1 / num2;

    System.out.println(num1 + " + " + num2 + " = " + atotal);
    System.out.println(num1 + " - " + num2 + " = " + stotal);
    System.out.println(num1 + " x " + num2 + " = " + mtotal);
    System.out.println(num1 + " / " + num2 + " = " + dtotal);


    myInput.close();
    }
}

//Write a program which declares two numbers of double type. Ask the user to
//input any two numbers, assign them to double variables, then calculates and
//displays their sum, difference, product, and quotient