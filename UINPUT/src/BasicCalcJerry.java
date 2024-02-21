import java.util.Scanner;

// Arithmetic operations in Java

public class BasicCalcJerry
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


        //Enter First Number
        System.out.println("Please enter first number integer: ");
        num1 = sc.nextInt();

        //Enter Second Number
        System.out.println("Please enter 2nd number integer: ");
        num2 = sc.nextDouble();

        // Finding the sum, product, quotient, difference
        sum = num1 +  num2;
        // Display sum
        System.out.println(sum);

        product = num1 * num2;
        //Display product
        System.out.println(product);

        quotient = num2 / num1;
        //Display quotient
        System.out.println(quotient);

        difference = num2 - num1;
        //Display difference
        System.out.println(difference);





    }
}




