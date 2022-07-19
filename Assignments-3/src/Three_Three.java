import java.util.Scanner;

public class Three_Three {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int year = 0;

            do {
                System.out.print("Enter a year: ");
                year = in.nextInt();
            } while (year < 1582);
            in.reset();
            if (year == 1000000) {
                return;
            }

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("This is a leap year!");
                        return;
                    }
                    System.out.println("This is not a leap year.");
                    return;
                }
                System.out.println("This is a leap year!");
                return;
            }
            System.out.println("This is not a leap year.");
        }
    }
}
