//  Calculate the AVerage of SIX numbers and their products also

import java.util.Scanner;

public class Ave {      //BEGINNING OF PUBLIC CLASS Ave

 public static void main(String[] args){   //BEGINNING OF PUBLIC STATIC VOID MAIN METHOD

     Scanner sc = new Scanner(System.in);
       //DECLARE VARIABLES

         int num1;
         int num2;
         int num3;
         int num4;
         int num5;
         int num6;
         int sum;
         double Average;
         int Product;
         int Sum;

         // Enter num1
         System.out.println("Please enter num1:  ");
         num1 = sc.nextInt();

          //DISPLAY NUM1
     System.out.println(num1);

     // Enter num2
     System.out.println("Please enter num2:  ");
     num2 = sc.nextInt();

     //DISPLAY NUM2
     System.out.println(num2);

     // Enter num3
     System.out.println("Please enter num3:  ");
     num3 = sc.nextInt();

     //DISPLAY NUM3
     System.out.println(num3);

     // Enter num4
     System.out.println("Please enter num4:  ");
     num4 = sc.nextInt();

     //DISPLAY NUM4
     System.out.println(num4);

     //Enter num5
     System.out.println("Please enter num5: ");
     num5 = sc.nextInt();

     //DISPAY NUM5
     System.out.println(num5);

     //Enter num6
     System.out.println(("Please enter num6: "));
     num6 = sc.nextInt();

     //DISPLAY NUM6
     System.out.println(num6);

    // Calculate product and Display product
      Product = num1 * num2   * num3 * num4 * num5 * num6;
     // Display product
     System.out.println(Product);

     // CALCULATE AVERAGE
     //Recall Average = Sum/Total numbers

     Sum = num1 + num2 + num3+ num4 + num5 + num6;
     System.out.println(Sum);

     Average = Sum /6;
     System.out.println(Average);




}    //END OF PUBLIC STATIC VOID MAIN METHOD
} //END OF PUBLIC CLASS Ave  AND END OF CODE




