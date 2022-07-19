public class Three_Twelve {
    public static void main(String args[]) {
        printA();
        printB();
        printC();
        printD();
    }

    public static void printA() {
        int n = 9;
        for (int i = 0; i < 10; i++) {
            for (int e = n; e > 0; e--) {
                System.out.print('*');
            }
            n--;
            System.out.println();
        }
    }

    public static void printB() {
        int n = 9;
        for (int i = 0; i < 10; i++) {
            for (int e = n; e > 0; e--) {
                System.out.print(' ');
            }
            for (int r = 9-n; r > 0; r--) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
    }

    public static void printC() {
        int n = 1;
        for (int i = 0; i < 9; i++) {
            for (int e = n; e > 0; e--) {
                System.out.print(' ');
            }
            for (int r = 9-n; r > 0; r--) {
                System.out.print('*');
            }
            n++;
            System.out.println();
        }
    }

    public static void printD() {
        int n = 4;
        for (int i = 0; i < 5; i++) {
            for (int r = n; r > 0; r--) {
                System.out.print(' ');
            }
            for (int c = 4-n; c > 0; c--) {
                System.out.print("*");
            }
            for (int c = 4-n; c > 1; c--) {
                System.out.print("*");
            }
            n--;
            System.out.println();
        }
        int n2 = 4;

        for (int i = 0; i < 4; i++) {
            for (int r = n2-1; r < 3; r++) {
                System.out.print(' ');
            }
            for (int c = 4-n2; c < 4; c++) {
                System.out.print("*");
            }
            for (int c = 4-n2; c < 3; c++) {
                System.out.print("*");
            }
            n2--;
            System.out.println();
        }
    }
}
