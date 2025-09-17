import java.util.Scanner;

class Timet {
    public static void main(String args[]) {
        int min, days, years, months, left_days;

        Scanner scan = new Scanner(System.in);

        System.out.println("Kabir, 24csu342");
        System.out.println("Enter the time in minutes:");
        min = scan.nextInt();

        days = min / 1440;
        years = days / 365;
        left_days = days % 365;
        months = left_days / 30;
        left_days = left_days % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + left_days);
    }
}
