package Trees.FILEANALYSIS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class FileAnalysis {
    
    private ArrayList<String> tc;



    public FileAnalysis(String s) {
    tc = new ArrayList<String>();
    File file = new File("Trees\\FILEANALYSIS\\dream.txt");
    try {
        Scanner inFile = new Scanner(file);
        while (inFile.hasNext()) {
            String temp = inFile.next();
            temp = temp.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if(temp.length() > 0){
                tc.add(temp);
            }
        }
        inFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
}

    public int totalNumWords(){
        int count = 0;
        for(String s : tc){
            if(s.length() > 0){
                count++;
            }
        }
        return count;
    }

    public Set<String> totalNumUniqWords(){
        return new TreeSet<String>(tc);
    }

    public TreeSet<String> alphaList(){
        return new TreeSet<String>(tc);
    }

    public TreeMap<String, Double> wordFrequency(){
        TreeMap<String, Double> freq = new TreeMap<String, Double>();
        for (String word : tc) {
            freq.put(word, freq.getOrDefault(word, 0.0) + 1);
        }
        return freq;
    }

    

    public ArrayList<Map.Entry<String, Double>> top30Words() {
        TreeMap<String, Double> freq = wordFrequency();
        ArrayList<Map.Entry<String, Double>> temp = new ArrayList<>(freq.entrySet());
        temp.sort(new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2) {
                return e2.getValue().compareTo(e1.getValue()); 
            }
        });
        ArrayList<Map.Entry<String, Double>> top30 = new ArrayList<Map.Entry<String, Double>>();
        for(int i = 0; i < 30; i++){
            top30.add(temp.get(i));
        }
        return top30;
    }
    

    public TreeMap<Double, ArrayList<String>> wordsByLength(){
        TreeMap<Double, ArrayList<String>> temp = new TreeMap<>();
        for (String word : tc) {
            double length = word.length();
            temp.putIfAbsent(length, new ArrayList<>());
            temp.get(length).add(word);
        }
        return temp;
    }
    
    public Set<String> longestWordList(){
            TreeMap<Double, ArrayList<String>> words = wordsByLength();  
            TreeSet<String> longestWords = new TreeSet<>(words.lastEntry().getValue());  
            return longestWords;  
        }
        
    
    public Set<String> misspelledWords(String dictionary){
        Set<String> dict = new TreeSet<String>();
        Set<String> misspelled = new HashSet<String>();
        try (Scanner inFile = new Scanner(new File("Trees\\FILEANALYSIS\\words.txt"))) {
            while (inFile.hasNext()) {
                String word = inFile.next().toLowerCase();
                dict.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (String word : tc) {
            if (!dict.contains(word)) {
                misspelled.add(word);
            }
        }
        return misspelled;
    }
    

    public double GLRIndex() {
    
    }
    

    

   

    public static void main(String[] args) {
        FileAnalysis analysis = new FileAnalysis("Trees\\FILEANALYSIS\\dream.txt");
        System.out.println("Total Words: " + analysis.totalNumWords());
        System.out.println("Unique Words: " + analysis.totalNumUniqWords().size());
        System.out.println("Alphabetical List: " + analysis.alphaList());
        System.out.println("Top 30 Words: " + analysis.top30Words());
        System.out.println("Words by Length: " + analysis.wordsByLength());
        System.out.println("Longest Words: " + analysis.longestWordList());
        System.out.println("Misspelled Words: " + analysis.misspelledWords("Trees\\FILEANALYSIS\\words.txt"));
        System.out.println("GLR Index: " + analysis.GLRIndex());
    }
}


