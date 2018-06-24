import java.util.Scanner;
public class SelectLarger
{
    Scanner in = new Scanner(System.in);
    public SelectLarger()
    {
        System.out.print("Enter first number: ");
        int varX = in.nextInt();
        System.out.print("Enter second number: ");
        int varY = in.nextInt();
        if (varX > varY){
        System.out.print(varX + " is larger than " + varY);
        }else
        System.out.print(varY + " is larger than " + varX);
    }
    
    public static void main()
    {
        new SelectLarger();
    }
}
