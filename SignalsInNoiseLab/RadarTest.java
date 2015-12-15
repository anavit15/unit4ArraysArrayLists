

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void monsterLocation()
    {
        Radar radar=new Radar(250,250);
        radar.setMonsterLocation(10,10);

        for (;radar.getNumScans()<=100;)
        {
            radar.scan();
        }
        
        int largest=0;
        int largestRow=0;
        int largestCol=0;
        for (int i=0;i<radar.getNumRows();i++)
        {
            for (int j=0; j<radar.getNumCols();j++)
            {
                if (radar.getAccumulatedDetection(i,j)>largest)
                {
                    largest=radar.getAccumulatedDetection(i,j);
                    largestRow=i;
                    largestCol=j;
                }
           }
        }
        
        assertEquals(10, largestRow);
        assertEquals(10, largestCol);
    }
    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

}
