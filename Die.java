
/**
 * This class will allow us to construct and manipulate two die in order to play craps.
 *
 * @author Kate Salembier
 * @version 2020-01-14
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int d1;
    private int d2;
    private int point;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        d1 = 0;
        d2 = 0;
    }

    /**
     * this RollD1 rolls die 1 and returns its value  
     *
     * @return die 1 value
     */
    public int RollD1()
    {
      d1 = (int)((Math.random() * 6) +1 );
      return d1;
    }
    
    /**
     * this RollsD2 method rolls die 2 and returns its value 
     *
     * @return die 2 value
     */
    public int RollD2()
    {
      d2 = (int)((Math.random() * 6) +1 );
      return d2;
    }
    
    /**
     * this getPoint method finds the "point" value by adding d1 and d2 and returning 
     * that sum
     * 
     * @return point value
     */
    public int getPoint()
    {
       point = d1 + d2;
       return point;
    }
}
