public class Solution {
    public String reverseWord(String word, char ch) {
        int index = findIndex(word, ch);
        String inversion = "";
        for(int i = index; i >= 0; i--) {
            inversion += word.charAt(i);
        }

        for(int i = index+1; i < word.length(); i++) {
            inversion += word.charAt(i);
        }
        return inversion;
    }

    public int findIndex(String word, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)) {
                return i;
            }
        }
        return -1; // Return -1 if character not found
    }

    public static void main (String[] args) {
        Solution solution = new Solution(); // Create an instance of Solution
        String result = solution.reverseWord("Lucas", 'u');
        System.out.println(result); // Print the result
    }
}
