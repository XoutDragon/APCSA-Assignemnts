import java.util.Scanner;
import java.util.Random;

public class Three_Fifteen {
    public static void main(String args[]) {
        while (true) {
            System.out.print("Enter choice: (Roll, Stop)");
            Scanner in = new Scanner(System.in);
            Random rand = new Random();

            String choice = in.next();

            switch(choice) {
                case "roll":
                    int num_1 = rand.nextInt(10);
                    int num_2 = rand.nextInt(10);
                    int num_3 = rand.nextInt(10);

                    System.out.println(num_1 + " " + num_2 + " " + num_3);

                    if (num_1 == num_2 && num_1 == num_3) {
                        System.out.println("All numbers are the same!");
                        break;
                    }
                    if (num_1 == num_2 || num_1 == num_3 || num_2 == num_3) {
                        System.out.println("2 of the numbers are the same!");
                        break;
                    }
                    break;
                case "stop":
                    return;
            }
        }
    }
}
