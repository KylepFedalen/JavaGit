import java.util.Scanner;
public class Grading
{
    Scanner in = new Scanner(System.in);
    public String setLettergrade(int quiz)
    {
        String lettergrade;
        switch(quiz){
            case 10: lettergrade = "A";
                break;
            case 9: lettergrade = "A";
                break;
            case 8: lettergrade = "B";
                break;
            case 7: lettergrade = "B";
                break;
            case 6: lettergrade = "C";
                break;
            case 5: lettergrade = "F";
                break;
            case 4: lettergrade = "F";
                break;
            case 3: lettergrade = "F";
                break;
            case 2: lettergrade = "F";
                break;
            case 1: lettergrade = "F";
                break;
            case 0: lettergrade = "F";
                break;
            default: lettergrade = "NA";
                break;
        }
        return lettergrade;
    }
    
    public Grading()
    {
        
        for(int quiztotal = 1; quiztotal <= 5; quiztotal++){
            System.out.print("Enter grade for quiz" + quiztotal + " >>");
            int quizScore = in.nextInt();
            System.out.println("");
            System.out.println("your grade for quiz " + quiztotal + " is " + setLettergrade(quizScore));
            System.out.println("");                    
        }
    }
    public static void main()
    {
        new Grading();
    }
}

