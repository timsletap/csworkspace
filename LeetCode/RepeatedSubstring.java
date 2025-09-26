package LeetCode;
public class RepeatedSubstring {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
        } 
    public static void main(String[] args) {
        RepeatedSubstring rs = new RepeatedSubstring();
        System.out.println(rs.repeatedSubstringPattern("abab")); // true
        System.out.println(rs.repeatedSubstringPattern("aba"));  // false
        System.out.println(rs.repeatedSubstringPattern("abcabcabc")); // true
    }
}
