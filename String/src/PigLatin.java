
public class PigLatin {
	private String englishPhrase;

	public PigLatin(String englishPhrase) {
		this.englishPhrase = englishPhrase;
	}
	public PigLatin() {
		this.englishPhrase = "Hello, my feet smell and my nose runs";
	}
	public String getPhrase() {
		return englishPhrase;
	}
	public String getWord() {
		int x = englishPhrase.indexOf(' ');
		String y = englishPhrase.substring(0,x);
		englishPhrase = englishPhrase.substring(0,x);
		return y;
	}
	public int findVowelPos(String word) {
		String x = "aeiouAEIOU";
		String letter="";
		for(int i = 0; i  < word.length(); i++) {
			letter = word.substring(i,i+1);;
			if(x.contains(letter)){
				return i;
			}
		}
		return -1;
	}

		

	
	
	
	
	
	public static void main(String[] args) {
		PigLatin smit = new PigLatin();
	}
	
	
	
	

}
