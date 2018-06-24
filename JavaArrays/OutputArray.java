import java.util.Scanner;
import java.util.Arrays;
public class OutputArray
{
    Scanner in = new Scanner(System.in);
    public OutputArray()
    {
        int[] inputPlus;
        inputPlus = new int[10];
        
        System.out.print("input a number(int) >>");
        
        int inputVar = in.nextInt();
        
        for(int x = 0; x < inputPlus.length; x++)
        {
            inputPlus[x] = inputVar;
            System.out.println(inputPlus[x]);
            System.out.println("added " + inputPlus[x] + " to Array in slot " + x);
            
            inputVar++;
        }
        System.out.print("full array >> ");
        for(int i = 0; i < inputPlus.length; i++){
            System.out.print(inputPlus[i]+", ");
        }
    }

    public static void main()
    {
        
        new OutputArray();
    }
}
