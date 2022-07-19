import java.util.Scanner;

public class Two_Five {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of miles to convert into kilometers: ");
        float miles = in.nextFloat();

        System.out.println(miles + " miles = " + miles * 1.60935 + " kilometers.");
    }
}
