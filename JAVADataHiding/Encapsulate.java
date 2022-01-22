
public class Encapsulate
{
    private String address ;
    private String name ;
    private int pin;
    
    public Encapsulate()
    {
        
    }
    
    public void setadr(String newadr)
    {
        address = newadr;
    }
    public String getadr()
    {
        return address;
    }
    
    public void setpin(int newpin)
    {
        pin = newpin;
    }
    public int getpin()
    {
        return pin;
    }
    
    public void setname(String newname)
    {
        name = newname;
    }
    public String getname()
    {
        return name;
    }
}
