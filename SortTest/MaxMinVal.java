//call by either MaxMinVal.getMax(a); or MaxMinVal.getMin(a);
public class MaxMinVal
{
    
    
    public static int Max(int[] a)
    {
        SelectionSorter.sort(a);
        int max = a[a.length-1];
        return max;
    }
    
    public static int Min(int[] a)
    {
        SelectionSorter.sort(a);
        int min = a[0];
        return min;
    }
    
    public int randomWithRange(int min, int max)
    {
        int range = (max - min) + 1;     
        return (int)(Math.random() * range) + min;
    }
    
   
}
