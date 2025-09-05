

public class FirstOccurenceStrinStr { 

public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;        
    }

    public static void main(String[] args){
    FirstOccurenceStrinStr finder = new FirstOccurenceStrinStr();
    String haystack = "hello";
    String needle = "ll";
    int index = finder.strStr(haystack, needle);
    System.out.println(index); // Output: 2
}





}