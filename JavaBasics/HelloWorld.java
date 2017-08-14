import java.util.Scanner;
import java.util.*;
public class HelloWorld
{
    // instance variables - replace the example below with your own
    private String name;
    static Scanner userInput = new Scanner(System.in);
    /**
     * Constructor for objects of class HelloWorld
     */
    public HelloWorld()
    {
        System.out.print("Hello World \n");
        System.out.print("enter name: ");
        if (userInput.hasNextLine()){
          this.setName(userInput.nextLine());
            
        }
        System.out.print("Hello "+ getName());
    }
     public static void main()
    {
        HelloWorld name = new HelloWorld();
        
    }   
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
