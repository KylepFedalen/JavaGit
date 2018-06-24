import java.util.Scanner;
public class WhileInputPos
{
   
    Scanner in = new Scanner(System.in);
    
    public WhileInputPos()
    {
        int inputNum = 0;
        int outNum = 0;
        
        while(inputNum >= 0){
            System.out.print("<<");
            inputNum = in.nextInt();
            outNum = inputNum + outNum;
        }
        outNum = outNum - inputNum;
            
        System.out.println("Sum of Collective Positive Inputs >>"+outNum);
    }
    public static void main()
    {
        new WhileInputPos();
    }
}
