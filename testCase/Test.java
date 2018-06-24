import java.util.Scanner;
public class Test
{
    
  
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Which Operation:");
        System.out.println("add = 1");
        System.out.println("subtract = 2");
        System.out.println("divide = 3");
        System.out.println("multiply = 4");
        
        int choose = scanner.nextInt();
        scanner.nextLine();
        
        if(choose == 1){
            System.out.print("input var1:");
        
            int var1 = scanner.nextInt();
            scanner.nextLine();
        
            System.out.print("input var1:");
        
            int var2 = scanner.nextInt();
            scanner.nextLine();
        
            System.out.println(Calculate.add(var1,var2));
        }
        
        if(choose == 2){
            System.out.print("input var1:");
        
            int var1 = scanner.nextInt();
            scanner.nextLine();
        
            System.out.print("input var1:");
        
            int var2 = scanner.nextInt();
            scanner.nextLine();
        
            System.out.println(Calculate.sub(var1,var2));
        }
        
        if(choose == 3){
            System.out.print("input var1:");
        
            int var1 = scanner.nextInt();
            scanner.nextLine();
        
            System.out.print("input var1:");
        
            int var2 = scanner.nextInt();
            scanner.nextLine();
        
            System.out.println(Calculate.div(var1,var2));
        }
        
        if(choose == 4){
            System.out.print("input var1:");
        
            int var1 = scanner.nextInt();
            scanner.nextLine();
        
            System.out.print("input var1:");
        
            int var2 = scanner.nextInt();
            scanner.nextLine();
        
            System.out.println(Calculate.mult(var1,var2));
        }
        
    }
}
