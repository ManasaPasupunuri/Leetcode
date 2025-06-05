import java.util.*;

class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        
        for (int i = 0; i < s1.length(); i++) {
            int u = s1.charAt(i) - 'a';
            int v = s2.charAt(i) - 'a';
            union(parent, u, v);
        }
        
        StringBuilder result = new StringBuilder();
        for (char c : baseStr.toCharArray()) {
            int p = find(parent, c - 'a');
            result.append((char) (p + 'a'));
        }
        return result.toString();
    }
    
    private int find(int[] parent, int u) {
        while (parent[u] != u) {
            parent[u] = parent[parent[u]];
            u = parent[u];
        }
        return u;
    }
    
    private void union(int[] parent, int u, int v) {
        int pu = find(parent, u);
        int pv = find(parent, v);
        if (pu < pv) {
            parent[pv] = pu;
        } else {
            parent[pu] = pv;
        }
    }
}