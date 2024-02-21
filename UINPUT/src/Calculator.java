import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner daniel = new Scanner(System.in);

        Double num1, num2, sum;
        //Enter First Number
        System.out.println("Enter first Number:");
        num1 = daniel.nextDouble();

        //Enter Second Number
        System.out.println("Enter second Number:");
        num2 = daniel.nextDouble();

        // Define sum or formula for sum
        sum = num1 + num2;
        System.out.println(sum);

    }
}