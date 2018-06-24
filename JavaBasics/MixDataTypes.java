import java.util.Scanner;
public class MixDataTypes
{
    Scanner in = new Scanner(System.in);
    public MixDataTypes()
    {
        System.out.print("Enter first number(int): ");
        int varX = in.nextInt();
        System.out.print("Enter second number(float): ");
        float varY = in.nextInt();
        System.out.print("int * float = " + varX * varY);
    }
    
    public static void main()
    {
        new MixDataTypes();
    }
}
