// case statement to find square amd cube of numbers


import java.util.Scanner;

public class SuareCube {   // BEGINNING OF CLASS SuareCube
    public static void main(String[] args) {   //BEGINNING OF PUBLIC STATIC VOID MAIN METHOD

        Scanner sc = new Scanner(System.in);

        //DECLARE VARIABLES

        int num1;
        double sum;
        double num2;
        double square;
        double cube;
        char op;


        //ENTER FIRST NUMBER;
        System.out.println("please enter first number interger:  ");
        num1 = sc.nextInt();

        //ENTER SECOND NUMBER
        System.out.println("please enter second number:  ");
        num2 = sc.nextInt();

        // Enter  operator
        System.out.println(" Enter operator to use S and C");
        op = sc.next().charAt(0);

        //FINDING OPERATOR SQUARE AND CUBE
        switch (op) {  //BEGINNING OF SWITCH CASE
            case 's':
                System.out.println(num2 * num2);
                break;
            case 'C':
                System.out.println(num2 * num2 * num2);
                break;
            default:
                System.out.println("OPERATOR NOT VALID");

        }  //  END OF SWITCH
    }   // END OF PUBLIC STATIC VOID MAIN METHOD

}    // END OF CLASS SuareCube AMD  END OF THE CODE"














