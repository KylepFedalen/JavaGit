import java.util.Scanner;
import java.util.*;
public class Animal
{
    // instance variables - replace the example below with your own
    private int height;
    private int weight;
    private String size;// small, medieum, large
    private String sound;
    private String userPref;
    private boolean noInput = true;
    static Scanner userInput = new Scanner(System.in);
    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        // initialise instance variables
        height = 10;
        weight = 50;
        
        
    }
    public void Loop()
    {
        if (noInput == true){
            System.out.print("Which do you prefer? Dogs or Cats? \n");
            
            this.setPref(userInput.nextLine());
                
            
            System.out.print("I see, you like "+ getPref()+"\n");
            noInput = false;
        }
    }
    public static void main()
    {
        Animal theAnimal = new Animal();
        Cats aCat = new Cats();
        
        theAnimal.Loop();
        
        System.out.println(aCat.getSound());
        System.out.println("test");
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setPref(String userPref)
    {
        this.userPref = userPref;
    }
    public String getPref()
    {
        return userPref;
    }
    public int getResult()
    {
        // put your code here
        return 1+1;
    }
}
