import java.util.Scanner;

public class Product
{
    public static  void main(String[] args)
    {
        // INPUT SCANNER AND IMPORT SCANNER
        Scanner sc = new Scanner(System.in);

        // DECLARE VARIABLE

        int num1;
        int num2;
        int num3;
        int product;

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

        product = num1 * num2 * num3;
        //Display product
        System.out.println(product);




    }
}