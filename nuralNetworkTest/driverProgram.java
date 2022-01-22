
/**
 * Write a description of class driverProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class driverProgram
{
    private static int gnum;
    public static void main()
    {
        System.out.printf("starting program...");
        Species mySpe = new Species();
        mySpe.iterate();
        System.out.printf("ending program...");
    }
}
