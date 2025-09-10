import java.util.ArrayList;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        if(s.length() != t.length()){
            return false;
        } else {
            return (countFreq(sArr).equals(countFreq(tArr)));
        }
    }

    public static ArrayList<Integer> countFreq(char[] arr) {
        int n = arr.length;
        
        // Mark all array elements as not visited
        boolean[] visited = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            
            // Skip this element if already processed
            if (visited[i])
                continue;
            int count = 1;
            
            // store the frequency
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    }

    public static void main(String[] args) {
      char[] smit = {'s', 'm', 'i', 't'};
      char[] tims = {'t', 'i', 'i', 's'};
    System.out.println(countFreq(smit));
    System.out.println(countFreq(tims));
    System.out.println(isAnagram("smit", "tims"));

      
    }

    }
    

               
 