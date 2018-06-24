import java.util.Random;
public class RandomNumber
{
    Random rand = new Random();
    public RandomNumber()
    {
       System.out.println("A random number between 0 and 9:");
       int randomInt = rand.nextInt(10);
       System.out.println(">> " + randomInt);
    }

    public static void main()
    {
      new RandomNumber();
    }
}
