import java.util.Scanner;

// Arithmetic operations in Java

public class CaseCaculatorSystem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Defining variables
        int num1;
        double sum;
        double num2;
        double difference;
        double product;
        double quotient;
        int Square;
        int Cube;



        char op;

        //Enter First Number
        System.out.println("Please enter first number integer: ");
        num1 = sc.nextInt();

        //Enter Second Number
        System.out.println("Please enter 2nd number integer: ");
        num2 = sc.nextDouble();

        //Enter Operator
        System.out.println("Enter operator to use (+  - * / % S C");
        op = sc.next().charAt(0);
        // Finding the sum, product, quotient, difference
        switch(op) {
            case'+':
                System.out.println(num1 + num2);
                break;

            case'-':
                System.out.println(num1 - num2);
                break;

            case'*':
                System.out.println(num1 * num2);
                break;

            case'/':
                System.out.println(num1 / num2);
                break;

            case'%':
                System.out.println(num1 % num2);
                break;

            case'S':
                System.out.println(num1 * num1);
                break;
                // NO TWO CASES CAN BE REPEATED IF NOT IT WILL GIVE AN ERROR eg Case1 used twice

            case'C':
                System.out.println(num1 * num1 * num1);
                break;

            default:
                System.out.println("OPERATOR NOT VALID");
        }


    }
}
