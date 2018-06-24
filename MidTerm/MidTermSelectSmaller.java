import java.util.Scanner;
public class MidTermSelectSmaller
{
    Scanner in = new Scanner(System.in);
    public MidTermSelectSmaller()
    {
        System.out.print("Enter first number: ");
        int varX = in.nextInt();
        System.out.print("Enter second number: ");
        int varY = in.nextInt();
        if (varX < varY){
        System.out.print(varX + " is smaller than " + varY);
        }else
        System.out.print(varY + " is smaller than " + varX);
    }
    
    public static void main()
    {
        new MidTermSelectSmaller();
    }
}