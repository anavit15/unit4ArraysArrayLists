

/**
 * Write a description of class ArrayMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMethods
{
    public int[] values;
    public ArrayMethods(int[] initialValues)
    {
         values=initialValues;
    }
    public void swapFirstAndLast()
    {
        int first=values[0];
        int last=values[values.length-1];
        values[0]=last;
        values[values.length-1]=first;
    }
    public void shiftRight()
    {
        
        int i=0;
        while (i<values.length-1)
        {
            values[i+1]=values[i];
            i++;
        }
        values[0]=values[values.length-1];
        
    }

}
