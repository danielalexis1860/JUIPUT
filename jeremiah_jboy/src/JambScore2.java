// Calculating total Jamb Score of a Student by inputting His Jamb Scores of His Various Subjects.

//CODE BEGINS HERE
import java.util.Scanner;

public class JambScore2 {
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

        //Enter surname
        System.out.println("Please enter surname: ");
        surname = sc.next();

        //Enter mathsScore
        System.out.println(" Enter Score for Maths: ");
        mathsScore = sc.nextInt();

        //Enter EnglishScore
        System.out.println(" Enter Score for English: ");
        EnglishScore = sc.nextInt();

        //Enter economicsScore
        System.out.println(" Enter Score for Economics: ");
        economicsScore = sc.nextInt();

        //Enter crsScore
        System.out.println(" Enter Score for crs: ");
        crsScore = sc.nextInt();

        //TOTAL SCORE CALCULATION
        totalScore = mathsScore + EnglishScore + economicsScore + crsScore;
       // DISPLAY TOTAL SCORE
        System.out.println("Total Jamb Score is   "  + totalScore);
    }
}
 //CODE ENDS HERE