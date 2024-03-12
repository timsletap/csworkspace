package Sets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Contacts {
    private ArrayList<Entry>[] myHashTable;
    


    public Contacts(int numSlots){
        myHashTable = new ArrayList[numSlots];

    }

    public Contacts(){
        myHashTable = new ArrayList[1];

    }

    public void load() {
        Scanner inFile;
        try {
            File file = new File("Sets\\phone.txt");
            String name, phone;
            inFile = new Scanner(file);
            while( inFile.hasNext()) {
                name = inFile.next();
                phone = inFile.next();
                addInorder(new Entry(name, phone));
            }
} catch (IOException exception){
    System.out.println("Error processing file: " + exception);
}

}

public void addInorder(Entry entry) {
    int index = Math.abs(entry.getName().hashCode())%myHashTable.length;
    if(myHashTable[index] == null){
        myHashTable[index] = new ArrayList<Entry>();
        myHashTable[index].add(entry);
    } else {
        for(int i = 0; i < myHashTable[index].size();i++){
            if(entry.getName().compareTo(myHashTable[index].get(i).getName()) < 0){
                myHashTable[index].add(i, entry);
                return;
            }
        }
        myHashTable[index].add(entry);
    }
    }


public void display() {
	for(ArrayList<Entry> s : myHashTable){
        System.out.println(s);
    }   
}

public int getCapacity(){
    return myHashTable.length;
}

public int getSize(){
    int c=0;
    for(int i = 0; i < myHashTable.length;i++){
        c+=myHashTable[i].size();
    }
    return c;
}

public int getNumberOfNulls(){
    int count = 0;
    for (ArrayList<Entry> bucket : myHashTable) {
        if (bucket == null) { 
            count++;
        }
    }
    return count;
}

public int getLongestList(){
    int max = 0;
    for(ArrayList<Entry> bucket : myHashTable) {
        if (bucket != null && bucket.size() > max) {
            max = bucket.size();
        }
    }
    return max;
}

public Entry find(String lastName){
    int low = 0;
        int high = myHashTable.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            ArrayList<Entry> midBucket = myHashTable[mid];
            Entry midEntry = midBucket.get((int)midBucket.size()/2);
            int comparison = midEntry.getName().compareTo(lastName);
            
            if (comparison == 0) {
                return midEntry;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
    public String lookup(String lookFor) {
        int index = Math.abs(lookFor.hashCode()) % myHashTable.length;
        ArrayList<Entry> bucket = myHashTable[index];
        if (bucket != null) {
            for (Entry entry : bucket) {
                if (entry.getName().equals(lookFor)) {
                    return entry.getPhoneNum();
                }
            }
        }
        return "Not Found";
    }

    public boolean changeNumber(String lookFor, String newNum) {
        int index = Math.abs(lookFor.hashCode()) % myHashTable.length;
        ArrayList<Entry> bucket = myHashTable[index];
        if (bucket != null) {
            for (Entry entry : bucket) {
                if (entry.getName().equals(lookFor)) {
                    entry.setPhoneNum(newNum);
                    return true;
                }
            }
        }
        return false;
    }

    public String reverseLookup(String number) {
        for (ArrayList<Entry> bucket : myHashTable) {
            if (bucket != null) {
                for (Entry entry : bucket) {
                    if (entry.getPhoneNum().equals(number)) {
                        return entry.getName();
                    }
                }
            }
        }
        return "Not Found";
    }
    public static void main(String[] args){
        Contacts temp = new Contacts(10);
        temp.load();
        System.out.println(temp.getLongestList());
        System.out.println(temp.getNumberOfNulls());
        System.out.println(temp.getCapacity());
        System.out.println(temp.lookup("Salas"));//9831015
        System.out.println(temp.reverseLookup("9821124"));//Ho
        temp.display();
        
    }
    
}






