
/**
 * Write a description of class Species here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.LinkedList;
public class Species
{
    // instance variables - replace the example below with your own
    
    private int genPopulation;
    
    private LinkedList<Specie> generation = new LinkedList<Specie>();

    /**
     * Constructor for objects of class Species
     */
    public Species()
    {
        // initialise instance variables
        genPopulation = 100;
        
        for(int i = 0;i< genPopulation;i++ ){
            generation.add(new Specie());
        }
    }

    public Specie iterate(){
        for(int i = 0;i< generation.size();i++ ){
            generation.get(i).iterate();
        }
        
    }
}
