class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0; // To keep track of the length of the current unique substring
        String str = ""; // To build the current substring
        int max = 0; // To store the maximum length of the substring found
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // Check if the character is already in the current substring
            if (!str.contains(String.valueOf(ch))) {
                str += ch; // Add the character to the substring
                count++; // Increase the count of the current unique substring length
            } else {   
                // If the character is a duplicate, reset the substring
                // Find the index of the duplicate character and build the substring from there
                int index = str.indexOf(ch);
                str = str.substring(index + 1) + ch; // Keep the substring starting from the character after the duplicate
                count = str.length(); // Update the count with the new substring length
            }
            
            // Update the maximum length
            max = Math.max(max, count);
        }
        
        return max; // Return the length of the longest unique substring
    }
}
