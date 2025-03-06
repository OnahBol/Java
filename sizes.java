import java.util.Scanner;

public class sizes {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
  
        Double weight = 0.0;
        String size;

        System.out.println("Weight of the Egg");
        weight = myInput.nextDouble();
        //myinput is the user putting it in
        //nextdouble is 

        if (weight >= 72) {
            size = "KingSize";
        } else if (weight >= 68) {
            size = "Jumbo";
        } else if (weight >= 60) {
            size = "Extra-Large";
        } else if (weight >= 52) {
            size = "Large";
        } else if (weight >= 43) {
            size = "Medium";
        } else {
            size = "Too Small";
        }
        System.out.println ("The size of the egg is: " + size);


    } 
}