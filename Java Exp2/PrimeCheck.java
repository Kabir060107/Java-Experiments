import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        System.out.println("Kabir, 24csu342");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is NOT a Prime number.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime number.");
            } else {
                System.out.println(num + " is NOT a Prime number.");
            }
        }
    }
}
