import java.util.Scanner;

class Integerf {
    public static void main(String args[]) {
        int num, reverse = 0, sum = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Kabir, 24csu342");
        System.out.print("Enter the Integer: ");
        num = scan.nextInt();

        int temp = num;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        while (temp != 0) {
            int value = temp % 10;
            sum = sum + value;
            temp = temp / 10;
        }

        System.out.println("Reversed Number: " + reverse);
        System.out.println("Sum of digits: " + sum);
    }
}
