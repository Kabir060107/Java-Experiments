import java.util.Scanner;
public class Righttriangle {
    public static void main(String[] args) {
        System.out.println("Kabir, 24csu342");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {  // rows
            for (int j = 1; j <= i; j++) {  // stars
                System.out.print("* ");
            }
            System.out.println(); // move to next line after each row
        }
    }
}
