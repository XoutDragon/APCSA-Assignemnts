public class Two_Ten {
    public static void main(String args[]) {
        double a = 5, b =  7, c = 8;
        double s = (a+b+c)/2;

        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.printf("The area of the triangle is: %.3f", area);
    }
}
