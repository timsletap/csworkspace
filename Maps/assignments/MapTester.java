package Maps.assignments;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
This program tests a map that maps names to colors.
*/
public class MapTester
{
public static void main(String[] args)
{
HashMap<String,Color> favoriteColors = new HashMap<String,Color>();
favoriteColors.put("Romeo", Color.GREEN);
favoriteColors.put("Juliet", Color.PINK);
favoriteColors.put("Adam", Color.BLUE);
favoriteColors.put("Eve", Color.PINK);
favoriteColors.put("Eve", Color.BLUE); // replace mapping

System.out.println( "? " + favoriteColors.put("John", Color.MAGENTA)); //null
System.out.println( "? " + favoriteColors.put("Adam", Color.YELLOW)); //Color.BLUE

       
        Set<String> keySet = favoriteColors.keySet();
        Iterator<String> iter =keySet.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            Color value = favoriteColors.get(key);
            System.out.println(key + "->" + value);
            }
       
        //for each
       
        System.out.println();
        System.out.println("COLORS");
        for(String x :favoriteColors.keySet())
            System.out.println(x + " " +favoriteColors.get(x));
       
        //toString()
        System.out.println(favoriteColors);
       
        System.out.println(favoriteColors.remove("Adam"));//Yellow
        System.out.println(favoriteColors.remove("MAdam"));//null
       
        System.out.println(favoriteColors.keySet());
       
        System.out.println(favoriteColors.entrySet());
       
       
       

}
}
