import java.util.Scanner;
public class CompareStrings
{
    Scanner in = new Scanner(System.in);
    public CompareStrings()
    {
        System.out.println("Enter two strings to see if they are the same");
        System.out.print("Enter first string>>");
        String str1 = in.next();
        System.out.print("Enter second string>>");
        String str2 = in.next();
        if(str1.equals(str2)){
            System.out.println(str1 + " is equal to " + str2);
            
        }
        else{
            System.out.print(str1 + " is NOT equal to " + str2);
        }
    }
    public static void main()
    {
        new CompareStrings();
    }
}
