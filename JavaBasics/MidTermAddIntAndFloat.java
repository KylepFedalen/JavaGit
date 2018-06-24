import java.util.Scanner;
public class MidTermAddIntAndFloat
{
    Scanner in = new Scanner(System.in);
    
    public MidTermAddIntAndFloat()
    {
        System.out.println("Enter an int and a float to add them together");
        System.out.print("int<<");
        int varX = in.nextInt();
        System.out.print("float<<");
        float varY = in.nextInt();
        System.out.println("sum>>" + (varX + varY));
    }

    
    public static void main()
    {
        new MidTermAddIntAndFloat();
    }
}
