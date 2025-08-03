class Solution {
    //SOHAM2099
    public String reverseWords(String s) {
        s = s.trim();  // remove leading/trailing spaces
        StringBuilder sb = new StringBuilder(s).reverse();
        String[] words = sb.toString().split("\\s+");  // split by one or more spaces

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }

        return result.toString().trim();
    }
}
