
import java.util.Random;
public class MidTermRandomNum
{
    Random rand = new Random();
    public  MidTermRandomNum()
    {
       int max = 20;
       int min = 1;
       int randomInt = rand.nextInt(max - min + 1) + min;;
       System.out.println("A random number between "+ min +" and "+ max);
       //test
       /*
       while(randomInt != 21)
       {
           randomInt = rand.nextInt(max - min + 1) + min;
           System.out.println(">> " + randomInt);
        }
       */
       System.out.println(">> " + randomInt);
    }

    public static void main()
    {
      new  MidTermRandomNum();
    }
}
