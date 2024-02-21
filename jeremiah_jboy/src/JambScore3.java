// Calculating total Jamb Score of a Student by inputting His Jamb Scores of His Various Subjects.

//CODE BEGINS HERE
import java.util.Scanner;

public class JambScore3 {
    public static void main(String[] args)
    {
        // IMPLEMENTING SCANNER
        Scanner sc = new Scanner(System.in);

        // DECLARING VARIABLES
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

        // Display name
        System.out.println(name);

        //Enter surname
        System.out.println("Please enter surname: ");
        surname = sc.next();

        // Display surname
        System.out.println(surname);

        //Enter mathsScore
        System.out.println(" Enter Score for Maths: ");
        mathsScore = sc.nextInt();

        // Display mathsScore
        System.out.println(mathsScore);

        //Enter EnglishScore
        System.out.println(" Enter Score for English: ");
        EnglishScore = sc.nextInt();

        // Display EnglishScore
        System.out.println(EnglishScore);

        //Enter economicsScore
        System.out.println(" Enter Score for Economics: ");
        economicsScore = sc.nextInt();

        // Display economicsScore
        System.out.println(economicsScore);

        //Enter crsScore
        System.out.println(" Enter Score for crs: ");
        crsScore = sc.nextInt();

        // Display crsScore
        System.out.println(crsScore);

        //TOTAL SCORE CALCULATION
        totalScore = mathsScore + EnglishScore + economicsScore + crsScore;
        // DISPLAY TOTAL SCORE
        System.out.println("Total Jamb Score is   "  + totalScore);
    }
}
//CODE ENDS HERE