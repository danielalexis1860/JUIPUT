import java.util.Scanner;

public class beans{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

                //CALCULATE THE AREA OF A CIRCLE
           //DECLARE VARIABLES
            double pi = 3.142;
            int r;
            double Area;

            //Enter r
        System.out.println("Please enter r");
        r = sc.nextInt();

        // DISPLAY r
        System.out.println(r);

        Area =  pi* r*r;
           //DISPlAY area
        System.out.println(Area);
















    }
}