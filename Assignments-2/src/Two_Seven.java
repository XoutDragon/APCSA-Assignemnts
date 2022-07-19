public class Two_Seven {
    public static void main(String args[]) {
        int time = 5322;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        if (time > (60*60)) {
            hours = time/(60*60);
            time -= hours*(60*60);
        }
        if (time > (60)) {
            minutes = time/60;
            time -= minutes*60;
        }
        if (time > 0) {
            seconds = time;
        }

        if (hours != 0) {
            System.out.print(hours);
            if (hours > 1) {
                System.out.print(" hours");
            } else {
                System.out.print(" hour");
            }
            if (minutes != 0) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
        }
        if (minutes != 0) {
            System.out.print(minutes);
            if (minutes > 1) {
                System.out.print(" minutes");
            } else {
                System.out.print(" minute");
            }
            if (seconds != 0) {
                System.out.print(", ");
            } else {
                System.out.print(" ");
            }
        }
        if (seconds != 0) {
            System.out.print(seconds);
            if (seconds > 1) {
                System.out.print(" seconds");
            } else {
                System.out.print(" second");
            }
        }
    }
}
