package musicplayer;

import java.util.ArrayList;

public class Playlist {
    private SongNode head;


    // Constructor
    public Playlist() {
        this.head = null;
    }
    
    public boolean isEmpty() {
		return head == null;
	}
    


    // Add a song to the end of the playlist
    public void addSong(String title, String artist) {    
    	if(head == null) {
			head = new SongNode(title, artist);
		}
		SongNode current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(new SongNode(title, artist));	
    }
    


   // count the songs in the playlist
    public int count() {
    	if(this.isEmpty()) {
			return 0;
		}
		int count = 0;
		SongNode current = head;
		while(current != null) {
			count++;
			current = current.getNext();
			
		}
		return count-1;
    }


  // Display the playlist
    public void displayPlayList() { 
    	String s = "";
		SongNode current = head;
		s+=current.toString();
		current = current.getNext();
		current = current.getNext();
		while(current != null) {
			s += " "+current.toString();
			current = current.getNext();
		}
		System.out.println(s);
    }
    


    // Remove a song from the playlist with the given title
    public void removeSong(String title) {
		SongNode current = head;
			if(current.getTitle().equals(title)) {
				head = head.getNext();
			}
			
		while(current.getNext() != null && (!current.getNext().getTitle().equals(title))) {
			current = current.getNext();
			
		}
	
		current.setNext(current.getNext().getNext());
		

    	
    }


	// Shuffle the order of the playlist
    public void shuffle() {
    	ArrayList<SongNode> temp = new ArrayList<SongNode>();
    	SongNode current = head;
    	while(current.getNext() != null) {
    		temp.add(current);
    		current = current.getNext();
    	}
    	head = null;
    	while(temp.size() != 0){
    		int n = (int)(Math.random() * temp.size());
    		current = temp.get(n);
    		this.addSong(current.getTitle(), current.getArtist());
    		temp.remove(n);
    		
    	}
    	
    	
    	
    	
    }
    
    public static void main(String[] args) {
    	Playlist smit = new Playlist();
    	smit.addSong("testSong1", "Bob Marley");
    	smit.addSong("testSong2", "Kanye West");
    	smit.addSong("testSong3", "Elvis Presley");
    	smit.addSong("testSong4", "Bruno Mars");
    	smit.addSong("testSong5", "Tom Connolly");
    	System.out.println(smit.count());
    	smit.displayPlayList();
    	smit.removeSong("testSong1");
    	smit.removeSong("testSong2");
    	smit.displayPlayList();
    	smit.shuffle();
    	smit.displayPlayList();
    	
    	
    	
    	
    }
}


