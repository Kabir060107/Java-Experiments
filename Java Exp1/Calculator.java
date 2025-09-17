import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        int a,b;
        char oper;
        Scanner scan= new Scanner (System.in);
        System.out.println("Enter First Number ");
        a = scan.nextInt();
        System.out.println("Enter Second Number ");
        b=scan.nextInt();
        System.out.println("Enter the operator :");
        oper = scan.next().charAt(0);
        if(oper == '+'){
            int sum = a+b;
            System.out.println("Sum is " + sum);
        }
        else if(oper == '-'){
            int diff=a-b;
            System.out.println("Difference is " + diff);

        }
        else if (oper == '*'){
            int multiply=a*b;
            System.out.println("Multiplication is " + multiply);

        }
        else if (oper == '/'){
             int div= a/b;
             System.out.println("Division is " + div);
        }
        else{
            int modulus = a%b;
            System.out.println("Modulus is " + modulus);
            System.out.println("Kabir 24csu342");


        }  
        
    }
}