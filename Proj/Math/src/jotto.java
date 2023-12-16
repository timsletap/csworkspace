
public class jotto {
	private String word;
	
	public jotto(String word) {
		this.word = word; 
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public String guess(String w) {
		String temp = "";
		for(int i = 0; i < word.length(); i++) {
			if(w.charAt(i) == word.charAt(i)) {
				temp+=word.charAt(i);
			} else if(word.contains(w.substring(i,i+1))) {
				temp+="+";
			} else {
				temp+="*";
					
				}
			}
		return temp;
		}
	
	
  public static void main(String[] args) {
	jotto one = new jotto("HARPS");
	System.out.println(one.guess("AAAAA"));
	System.out.println(one.guess("HELLO"));
	System.out.println(one.guess("HEART"));
	System.out.println(one.guess("HARMS"));
	System.out.println(one.guess("HARPS"));
	
	
}
}
