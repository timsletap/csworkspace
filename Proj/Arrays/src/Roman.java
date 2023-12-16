
public class Roman {

//Use Parallel Arrays
public static int romanToArabic(String r){
	int []num = {1000,500,100,50,10,5,1};
	String []rom ={"M","D","C","L","X","V","I"};
	int rX = 0;
	for(int i = 0; i < r.length()-1; i++) {
		for(int j = 0; j < rom.length;j++ ) {
		if(Character.toString(r.charAt(i)).equals(rom[j])) {
			if(num[findIndex(rom,Character.toString(r.charAt(i+1)))] <= num[findIndex(rom,Character.toString(r.charAt(i)))]){
				rX += num[j];
			}
			if(num[findIndex(rom,Character.toString(r.charAt(i+1)))] > num[findIndex(rom,Character.toString(r.charAt(i)))]){
				rX -= num[j];
			}
		} 
		
	}
}
	if(num[findIndex(rom,Character.toString(r.charAt(r.length()-2)))] < num[findIndex(rom,Character.toString(r.charAt(r.length()-1)))]){
		rX += num[findIndex(rom,Character.toString(r.charAt(r.length()-1)))];
	}
	if(num[findIndex(rom,Character.toString(r.charAt(r.length()-2)))] > num[findIndex(rom,Character.toString(r.charAt(r.length()-1)))]){
		rX -= num[findIndex(rom,Character.toString(r.charAt(r.length()-1)))];
	}

	return rX;

}

public static int findIndex(String[] arr, String t)
{
    if (arr == null) {
        return -1;
    }

    int len = arr.length;
    int i = 0;

    
    while (i < len) {

       
        if (arr[i].equalsIgnoreCase(t)) {
            return i;
        }
        else {
            i = i + 1;
        }
    }
    return -1;
}


public static String arabicToRoman(int a){
    String numeral  ="";
    int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
    String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
    int num = a; 
    for(int i=0;i<numbers.length;i++){  
    	while(num >= numbers[i]) {  
    		num -= numbers[i];  
    		numeral += romanLetters[i];  
   }  
  }  
return numeral;
}
public static void main(String[] args) {

    
    System.out.println(arabicToRoman(1214));  //MCCXIV
    System.out.println(romanToArabic("CXXIV")); //124
}
}
