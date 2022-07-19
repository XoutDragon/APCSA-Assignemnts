public class Two_Nine {
    public static void main(String args[]) {
        double radius = 2;
        double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        double surface_area = 4.0*Math.PI*Math.pow(radius, 2);

        System.out.printf("The volume of this circle is: %.4f \n", volume);
        System.out.printf("The surface area of this circle is: %.4f", surface_area);
    }
}
