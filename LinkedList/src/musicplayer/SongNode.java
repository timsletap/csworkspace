package musicplayer;

public class SongNode {
	private String title;
    private String artist;
    private SongNode next;


    public SongNode(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.next = null;
    }


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getArtist() {
		return artist;
	}


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public SongNode getNext() {
		return next;
	}


	public void setNext(SongNode next) {
		this.next = next;
	}
	
	public String toString() {
		return this.title + " - " + this.artist;
	}
    
    
}


