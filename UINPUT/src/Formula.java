import java.util.Scanner;

// Arithmetic operations in Java

public class Formula
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int sum;  double average;
        //Enter First Number
        System.out.println("Please enter first number integer: ");
        num1 = sc.nextInt();

        //Enter Second Number
        System.out.println("Please enter 2nd number integer: ");
        num2 = sc.nextInt();

        // Formula to find the sum
        sum = num1 +  num2;
        // Display sum
        System.out.println(sum);

     // Formula to find average
        average = sum/2;
       // Display average
        System.out.println(average);
    }
}




