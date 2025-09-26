package LeetCode;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int sSum = 0;
        int tSum = 0;
        for(int i = 0; i < s.length(); i++){
            sSum +=(int) s.charAt(i);
        }
         for(int j = 0; j < t.length(); j++){
            tSum += (int)t.charAt(j);
        }
        return (char)(tSum - sSum);
    }
    public static void main(String[] args) {
        FindTheDifference finder = new FindTheDifference();
        String s = "abcd";
        String t = "abcde";
        char difference = finder.findTheDifference(s, t);
        System.out.println(difference); // Output: 'e'
    }
    
}