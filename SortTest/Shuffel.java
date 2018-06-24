import java.util.Random;
public class Shuffel
{
    public static void sort(int[] a)
    {
        int n = a.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }
    
    private static void swap(int[] a, int i, int j) {//helper method for shuffle(), swaps i with j in Card object array a
        int save = a[i];
        a[i] = a[j];
        a[j] = save;
    }
    
   
    
}
    

