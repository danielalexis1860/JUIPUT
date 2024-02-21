import java.util.Scanner;

public class UserInput2{

    public static void main(String[] args)
    {
        Scanner daniel = new Scanner(System.in);

        String name, surname, fullname;
        System.out.println("Enter your name:");
        name = daniel.next();

        //Surname
        System.out.println("Enter your surname:");
        surname = daniel.next();

        //Concaconation
        fullname = name + surname;
        System.out.println(fullname);


    }
}