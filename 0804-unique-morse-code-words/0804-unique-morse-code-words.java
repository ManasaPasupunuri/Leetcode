import java.util.*;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        Set<String> transformations = new HashSet<>();
        for (String word : words) {
            StringBuilder morse = new StringBuilder();
            for (char c : word.toCharArray()) {
                morse.append(codes[c - 'a']);
            }
            transformations.add(morse.toString());
        }
        return transformations.size();
    }
}
