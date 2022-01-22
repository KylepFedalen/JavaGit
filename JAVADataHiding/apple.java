public class apple
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class apple
     */
    public apple()
    {
    
       
    }
    
    public static void main(){
        Encapsulate obj = new Encapsulate();
        
        obj.setpin(1234);
        obj.setname("kyle");
        obj.setadr("5500 new port");
        
        System.out.println("Program start...");
        System.out.println("printing pin: " + obj.getpin());
        System.out.println("printing name: " + obj.getname());
        System.out.println("printing address: " + obj.getadr());
        System.out.println("hello world");
        System.out.println("Program end...");
       
    }
    
        
    
  
}
