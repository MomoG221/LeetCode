class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        
        // Alternate between the characters of word1 and word2
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++)); // Add a character from word1
            merged.append(word2.charAt(j++)); // Add a character from word2
        }
        
        // Append remaining characters from word1 or word2
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }
        
        return merged.toString();
    }
    
    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1
        String word1 = "abc";
        String word2 = "pqr";
        String result1 = solution.mergeAlternately(word1, word2);
        System.out.println("Test Case 1: " + result1); // Expected: "apbqcr"
        
        // Test Case 2
        word1 = "ab";
        word2 = "pqrs";
        String result2 = solution.mergeAlternately(word1, word2);
        System.out.println("Test Case 2: " + result2); // Expected: "apbqrs"
        
        // Test Case 3
        word1 = "abcd";
        word2 = "pq";
        String result3 = solution.mergeAlternately(word1, word2);
        System.out.println("Test Case 3: " + result3); // Expected: "apbqcd"
        
    }
}
