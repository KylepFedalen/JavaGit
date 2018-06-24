public class Grading
{
    int quiz1 = 10;
    int quiz2 = 8;
    int quiz3 = 7;
    int quiz4 = 5;
    int quiz5 = 6;
    int quiztotal = 0;
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
        
        while(quiztotal <= 5){
            switch (quiztotal){
                case 1: System.out.println("your grade is " + setLettergrade(quiz1) + " for quiz " + quiztotal);
                    break;
                case 2: System.out.println("your grade is " + setLettergrade(quiz2) + " for quiz " + quiztotal);
                    break;
                case 3: System.out.println("your grade is " + setLettergrade(quiz3) + " for quiz " + quiztotal);
                    break;
                case 4: System.out.println("your grade is " + setLettergrade(quiz4) + " for quiz " + quiztotal);
                    break;
                case 5: System.out.println("your grade is " + setLettergrade(quiz5) + " for quiz " + quiztotal);
                    break;
            }
            quiztotal++;
        }
        
    }
    public static void main()
    {
        new Grading();
    }
}

