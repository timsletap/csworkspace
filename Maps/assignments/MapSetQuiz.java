package Maps.assignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapSetQuiz {

    public static void three(TreeMap<Integer, TreeSet<String>> mapping, String word) {
        TreeSet<String> temp;
        if(mapping.containsKey(word.length())){
            temp = mapping.get(word.length());
        } else {
            temp = new TreeSet<String>();
        }
        temp.add(word);
        mapping.put(word.length(), temp);
        }


        public static TreeSet<String> intersection(HashSet<String> a, HashSet<String> b ) {
            TreeSet<String> result = new TreeSet<>();
             for (String x : a) {
                if (b.contains(x)) {
                        result.add(x);
                }
            }
            return result;
        }

        public static boolean areAnagrams(String str1, String str2) {
                if (str1.length() != str2.length()) {
                    return false;
                }
                HashSet<Character> set1 = new HashSet<>();
                HashSet<Character> set2 = new HashSet<>();
                for (int i = 0; i < str1.length(); i++) {
                    set1.add(str1.charAt(i));
                    set2.add(str2.charAt(i));
                }
                return set1.equals(set2);
            }
        
    
        public static int duplicateWordCount(String phrase) {
                phrase = phrase.toLowerCase(); 
                HashMap<String, Integer> temp = new HashMap<>();
                String word = "";
                int x = 0;
                
                for (int i = 0; i < phrase.length(); i++) {
                    char c = phrase.charAt(i);
                    if (c >= 'a' && c <= 'z') {
                        word += c;
                    } else if (!word.equals("")) {
                        if (temp.containsKey(word)) {
                             x = temp.get(word);
                            temp.put(word, x + 1);
                        } else {
                            temp.put(word, 1);
                        }
                        word = "";
                    }
                }
                if (!word.equals("")) {
                    if (temp.containsKey(word)) {
                         x = temp.get(word);
                        temp.put(word, x + 1);
                    } else {
                        temp.put(word, 1);
                    }
                }
                
                int duplicates = 0;
                for (int n : temp.values()) {
                    if (n > 1) {
                        duplicates++;
                    }
                }
                
                return duplicates;
            }
    

            








            public static void main(String[] args) {
               
                TreeMap<Integer, TreeSet<String>> map = new TreeMap<>();
                three(map, "hello");
                three(map, "wood");
                three(map, "banana");
                three(map, "smit");
                System.out.println("Map contents after 'three' method: " + map);
        
                
                HashSet<String> setA = new HashSet<>();
                setA.add("apple");
                setA.add("cherry");
                setA.add("banana");
                HashSet<String> setB = new HashSet<>();
                setB.add("banana");
                setB.add("cherry");
                System.out.println("Intersection result: " + intersection(setA, setB));
        
                
                System.out.println("Are 'listen' and 'silent' anagrams? " + areAnagrams("listen", "silent"));
                System.out.println("Are 'hello' and 'world' anagrams? " + areAnagrams("hello", "world"));
        
               
                System.out.println("Duplicate count for 'Hello world hello': " + duplicateWordCount("Hello world hello"));
                System.out.println("Duplicate count for 'Repeated Repeated words words words': " + duplicateWordCount("Repeated Repeated words words words"));
                System.out.println("Duplicate count for 'unique values only': " + duplicateWordCount("unique values only"));
            }
        }
        
    


