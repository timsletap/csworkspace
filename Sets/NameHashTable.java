package Sets;

import java.util.ArrayList;

public class NameHashTable {
	// instance variables - replace the example below with your own
	private ArrayList<String>[] table;

	/**
	 * Constructor for objects of class NameHashTAble
	 */
	public NameHashTable() {
		table = new ArrayList[26];
		for (int i = 0; i < 26; i++)
			table[i] = new ArrayList<String>();
	}

	public void add(String x) {
        table[x.charAt(0) - 'A'].add(x);
         }


	public void remove(String x) {
        if(table[x.charAt(0) - 'A'].isEmpty()){
            System.out.println("Empty");
        }
        table[x.charAt(0) - 'A'].remove(x);
	}

	public boolean contains(String x) {
        if(table[x.charAt(0) - 'A'].isEmpty()){
           return false;
        }
		return table[x.charAt(0)-'A'].contains(x);
	}

	public void display() {
		for(ArrayList<String> s : table){
            if(s.size() > 0){
                System.out.println(s.get(0).charAt(0) + " "+ s);
            } else {
                System.out.println(s);
            }
           
        }
        }
	
	
	public static void main(String[] args) {
		NameHashTable club = new NameHashTable();
		club.add("Aarons");
		club.add("Araons");
		club.add("Daly");
		club.add("Mealy");
		club.add("Davis");
		club.add("Burns");
		club.add("Zhang");
		club.add("Yellowstone");
		club.add("McHale");
		club.add("Yeung");
		club.add("Burns");
		club.add("Garcia");
		club.add("Chen");
		club.add("Yu");
		club.add("Anderson");
		club.add("Dooley");
		club.add("Murphy");
		club.add("Dean");
		club.add("Bettys");
		club.add("Gupta");
		club.add("Chang");
		System.out.println("HASH TABLE");
		club.display();
		club.remove("Chen");
		System.out.println("Contains Yu?   " + club.contains("Yu"));
		System.out.println("Contains Chen?   " + club.contains("Chen"));
		
	}
}
