
public class HowManyInstances
{
    
    public static int find(int[] a, int x)//int[] a is the array to search | int x is the integer to search for
    {
       MergeSorter.sort(a);
       Integer counter = 0;
       for(int i = 0; i < a.length; i++){
           if(x == Integer.valueOf(a[i])){
               counter++;;
           }
       } 
       
       return counter;
       
    }
}
