

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
        //creates a Radar object
        Radar radar=new Radar(250,250);
        //sets the monster location
        radar.setMonsterLocation(10,10);
        
        //runs the scan method multiple (100) times 
        for (;radar.getNumScans()<=100;)
        {
            radar.scan();
        }
        
        //creates variables to find the maximum values in the ammumulatedDetection array
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
        //makes sure that the set monster location is the same as the monster location that the computer finds
        assertEquals(10, largestRow);
        assertEquals(10, largestCol);
    }
    
    @Test
    public void monsterLocationCheck2()
    {
        //creates a Radar object
        Radar radar=new Radar(250,250);
        //sets the monster location
        radar.setMonsterLocation(100,100);
        
        //runs the scan method multiple (100) times 
        for (;radar.getNumScans()<=100;)
        {
            radar.scan();
        }
        
        //creates variables to find the maximum values in the ammumulatedDetection array
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
        //makes sure that the set monster location is the same as the monster location that the computer finds
        assertEquals(100, largestRow);
        assertEquals(100, largestCol);
    }
    @Test
    public void monsterLocationCheck3()
    {
        //creates a Radar object
        Radar radar=new Radar(250,250);
        //sets the monster location
        radar.setMonsterLocation(50,50);
        
        //runs the scan method multiple (100) times 
        for (;radar.getNumScans()<=100;)
        {
            radar.scan();
        }
        
        //creates variables to find the maximum values in the ammumulatedDetection array
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
        //makes sure that the set monster location is the same as the monster location that the computer finds
        assertEquals(50, largestRow);
        assertEquals(50, largestCol);
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
