import java.util.Scanner;

class QuadRoots {
    public static void main(String[] args) {
        System.out.println("Kabir, 24csu342");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = sc.nextDouble();
        System.out.println("Enter b: ");
        double b = sc.nextDouble();
        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Not a quadratic equation");
        } else {
            double d = (b * b) - (4 * a * c); // discriminant

            if (d > 0) {
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Roots are real and distinct: " + r1 + ", " + r2);
            } else if (d == 0) {
                double r = -b / (2 * a);
                System.out.println("Roots are real and equal: " + r);
            } else {
                double real = -b / (2 * a);
                double imag = Math.sqrt(-d) / (2 * a);
                System.out.println("Roots are complex: " + real + " + " + imag + "i , " + real + " - " + imag + "i");
            }
        }
    }
}
