public class Three_Six {
    public static void main(String args[]) {
        int integer[] = {12900024};

        int odds = 0;
        int evens = 0;
        int zeros = 0;

        for (int i : integer) {
            if (i == 0) {
                zeros++;
            } else if (i % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }

        System.out.print("Zeros: " + zeros + "\nEvens: " + evens + "\nOdds: " + odds);
    }
}
