class Solution {
    public String reverseWords(String s) {
        String result = "";
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || i == s.length() - 1) {
                int end = (s.charAt(i) == ' ') ? i - 1 : i;
                for (int j = end; j >= start; j--) {
                    result += s.charAt(j);  
                }
                if (s.charAt(i) == ' ') {
                    result += ' ';
                }
                start = i + 1; 
            }
        }
        return result;
    }
}
