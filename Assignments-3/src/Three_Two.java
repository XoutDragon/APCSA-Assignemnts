import java.util.Scanner;

public class Three_Two {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print("This is a leap year!");
                    return;
                }
                System.out.print("This is not a leap year.");
                return;
            }
            System.out.print("This is a leap year!");
            return;
        }
        System.out.print("This is not a leap year.");
    }
}
