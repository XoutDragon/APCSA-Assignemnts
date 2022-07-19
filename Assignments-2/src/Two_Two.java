import java.util.Scanner;

public class Two_Two {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num_1 = in.nextInt();
        System.out.print("Enter a number: ");
        int num_2 = in.nextInt();
        System.out.print("Enter a number: ");
        int num_3 = in.nextInt();

        double total = num_1 + num_2 + num_3;
        double average = total/3.0;

        System.out.println("\nThe average is: " + average);
    }
}
