import java.util.ArrayList;

public class ArrayListOperations
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       System.out.println(names);
       
       System.out.println(names.get(0)+", "+names.get(names.size()-1));
       
       System.out.println(names.size());
       
       names.set(0,"Alice B");
       System.out.println(names);
       
       names.add(4,"Doug");
       System.out.println(names);
       
       for (String i:names)
       {
           System.out.println(i);
       }
   }
  
} 