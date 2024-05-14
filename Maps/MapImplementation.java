package Maps;
import java.util.Map.Entry;
import java.util.Set;

public interface MapImplementation<E, E2> {
   public E2 put(E key,E2 value); //is used to insert an entry in this map.
   public E2 remove(E key);//is used to delete an entry for the specified key.
   public E2 get(E key);//is used to return the value for the specified key.
   public boolean containsKey(E key);//is used to search the specified key from this map.
   public boolean containsValue(E2 value);//is used to search the specified value from this map.
   public Set<E> keySet();//returns the Set view containing all the keys.
   public Set<Entry<E,E2>> entrySet();//returns the Set view containing all the keys and values.
}