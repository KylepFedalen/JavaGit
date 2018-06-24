
//gives the index of the first instance of a given value in an array

public class LinearSearcher
{
   
    public static int search(int[] a, int value)
    {
       for(int i =0; i < a.length;i++){
           if(a[i]==value){return i;}
        }
        return -1;
    }

    
}
