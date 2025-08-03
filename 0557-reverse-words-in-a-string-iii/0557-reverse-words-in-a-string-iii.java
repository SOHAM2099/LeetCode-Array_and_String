class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split("\\s+");
        String result="";
        for(int i=0;i<words.length;i++)
        {
            result+=new StringBuilder(words[i]).reverse();
            if(i!=words.length-1)   result+=" ";
        }
        return result;
    }
}