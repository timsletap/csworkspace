package Sets;

import java.util.ArrayList;

public class NameHashTable2 {
    private ArrayList<String>[] table;
    

    public NameHashTable2(int size){
        table = new ArrayList[size];
        for(int i = 0; i < size; i++){
            table[i] = new ArrayList<String>();
        }

    }

    public void add(String x){
        
    }
}
