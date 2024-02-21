import java.util.Scanner;

// ALLOWING USER ENTER NAME AND SURNAME, DATA
public class GetName
{
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        String surname;

        //Enter name
        System.out.println("Please enter first name: ");
        name = sc.next();

        //Enter surname
        System.out.println("Please enter surname: ");
        surname = sc.next();

    }
}