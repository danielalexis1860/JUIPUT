import java.util.Scanner;

public class JambScore {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name;
        String surname;
        int mathsScore;
        int EnglishScore;
        int crsScore;
        int economicsScore;
        int totalScore;
        //Enter name
        System.out.println("Please enter first name: ");
        name = sc.next();

        System.out.println("Please enter surname: ");
        surname = sc.next();

        System.out.println(" Enter Score for Maths: ");
        mathsScore = sc.nextInt();

        System.out.println(" Enter Score for English: ");
        EnglishScore = sc.nextInt();

        System.out.println(" Enter Score for Economics: ");
        economicsScore = sc.nextInt();

        System.out.println(" Enter Score for crs: ");
        crsScore = sc.nextInt();

        totalScore = mathsScore + EnglishScore + economicsScore + crsScore;

        System.out.println("Total Jamb Score is   "  + totalScore);
    }
}
