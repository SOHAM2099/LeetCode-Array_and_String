
public class Solution {
    //SOHAM2099
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse each word
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        // Remove the trailing space
        return result.toString().trim();
    }
}