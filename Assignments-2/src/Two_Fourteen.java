import java.util.Random;

public class Two_Fourteen {
    public static void main(String args[]) {
        Random rand = new Random();
        int first_3 = 0;
        int middle_3 = 0;
        int last_4 = 0;

        while (true) {
            first_3 = rand.nextInt(100, 778);
            String check = Integer.toString(first_3);

            if (check.contains("9") || check.contains("8")) {
                continue;
            } else {
                break;
            }
        }

        middle_3 = rand.nextInt(100, 743);
        last_4 = rand.nextInt(1000, 10000);

        System.out.print(first_3 + "-" + middle_3 + "-" + last_4);
    }
}
