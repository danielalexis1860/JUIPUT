// average of three numbers
import java.util.Scanner;

public class Average {
    public static void main(String[] args)
    {
        // INPUT SCANNER and IMPORT SCANNER
        Scanner sc = new Scanner(System.in);

        //DECLARE VARIABLES

        int num1;
        int num2;
        int num3;
        int Sum;
        double Average;


        //Enter num1
        System.out.println("Please enter num1: ");
        num1 = sc.nextInt();

        //Display num1
        System.out.println(num1);

        //Enter num2
        System.out.println("Please enter num2: ");
        num2 = sc.nextInt();

        //Display num2
        System.out.println(num2);

        //Enter num3
        System.out.println("Please enter num3: ");
        num3 = sc.nextInt();

        //Display num3
        System.out.println(num3);

        // Calculate SUm and Display Sum
         Sum = num1 + num2 + num3;
         //DISPLAY Sum
        System.out.println(Sum);

        // Calculate Average and Display Average
         Average = Sum/3;
         // DISPLAY Average
        System.out.println(Average);

    }
}