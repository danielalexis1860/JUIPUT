import java.util.Scanner;  //Scanner allows you to input characters/ letters (char), numbers, WORDS(String)

// ALLOWING USER ENTER NAME  DATA
public class GettinNamed    //Name of Java class is GettinNamed
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        //Enter name
        System.out.println("Please enter first name: ");
        name = sc.next();
    }
}