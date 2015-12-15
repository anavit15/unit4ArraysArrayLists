import java.util.ArrayList;

/**
 * Write a description of class ArrayListPractice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListPractice
{
    /** description of instance variable x (add comment for each instance variable) */
   

    /**
     * Default constructor for objects of class ArrayListPractice
     */
    public static void main (String [] args)
    {
        // initialise instance variables
        ArrayList<String>words=new ArrayList<String>();
        words.add("test");
        words.add("like");
        words.add("like");
        words.add("cookie");
        
        System.out.println(words);
        for (int i=words.size()-1;i>=0;i--)
        {
            String word=words.get(i);
            if (word.equals("like"))
            {
                words.remove(i);
            }
        }
        System.out.println(words);
    }

   

}
