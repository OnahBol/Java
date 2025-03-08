import java.util.Scanner;

public class speedpen {

    public static void main(String[] args) {
    
        Scanner myInput = new Scanner(System.in);

        Double speed;
        int demerit = 0, fine = 0;
        String limit, suspension = "No Suspension";

        System.out.println("Enter the speed exceeded (in km/h): ");
        speed = myInput.nextDouble();

        System.out.println("Was it in a 110 km/h zone? (Yes/No): ");
        limit = myInput.next();

        if (limit.equals("Yes")) {
            if (speed >= 20 && speed <= 24) {
                fine = 370;
                suspension = "3 months";
            }
        } else {
            if (speed < 10) {
                fine = 231;
                demerit = 1;
            } else if (speed >= 10 && speed <= 24) {
                fine = 370;
                demerit = 3;
            } else if (speed >= 25 && speed <= 29) {
                fine = 509;
                suspension = "3 months";
            } else if (speed >= 30 && speed <= 34) {
                fine = 601;
                suspension = "3 months";
            } else if (speed >= 35 && speed <= 39) {
                fine = 693;
                suspension = "6 months";
            } else if (speed >= 40 && speed <= 44) {
                fine = 786;
                suspension = "6 months";
            } else if (speed >= 45) {
                fine = 925;
                suspension = "12 months";
            }
        }

        System.out.println("Fine: $" + fine);
        System.out.println("Demerit Points: " + demerit);
        System.out.println("License Suspension: " + suspension);

        myInput.close();
    }
}