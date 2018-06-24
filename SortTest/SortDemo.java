import java.util.Arrays;
import java.util.Scanner;
public class SortDemo
{
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.print("input array length:");
        int arrayLen = scanner.nextInt();
        scanner.nextLine();
        System.out.print("input array range:");
        int arrayRange = scanner.nextInt();
        scanner.nextLine();
        int[] a = ArrayUtil.randomIntArray(arrayLen,arrayRange);
        
        System.out.println("-------------------------------------------");
        System.out.println("Unsorted Array:");
        System.out.println(Arrays.toString(a));
        
        
        SelectionSorter.sort(a);//do slection sort
        System.out.println("-------------------------------------------");
        
        System.out.println("Selection Sort Sorted:");
        System.out.println(Arrays.toString(a));
        
        System.out.println("-------------------------------------------");
        InsertionSorter.sort(a);//do insertion sort
        
        System.out.println("Insertion Sort Sorted:");
        System.out.println(Arrays.toString(a));
        
        System.out.println("-------------------------------------------");
        MergeSorter.sort(a);//do merge sort
        
        System.out.println("Merge Sort Sorted:");
        System.out.println(Arrays.toString(a));
        
        System.out.println("-------------------------------------------");
        Shuffel.sort(a);//do shuffel
        
        System.out.println("Shuffeled:");
        System.out.println(Arrays.toString(a));
        
        System.out.println("-------------------------------------------");
        MergeSorter.sort(a);
        System.out.println("Linear Search:");
        System.out.println("gives the index of the first instance of a given value in an array");
        System.out.println("given array:");
        System.out.println(Arrays.toString(a));
        for(int i = 0; i <arrayRange;i++){
            int temp = LinearSearcher.search(a,i);
            if(LinearSearcher.search(a,i)!= -1){             
                System.out.println("-------------------------------------------");
                System.out.println("the first instance of "+ i + " is at index: "+ temp);
                if(HowManyInstances.find(a,i)>1){
                    System.out.println("");
                System.out.println("There are " + HowManyInstances.find(a,i) + " instances of " + i + " in the array");
                }
                
               
            }
        }        
        //System.out.println("There are " + HowManyInstances.find(a,i); + " instances of " + i + " in the array");
        System.out.println("******************************************");    
        }      
        
    }
   
