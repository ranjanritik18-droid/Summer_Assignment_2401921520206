class Solution {
    public boolean repeatedSubstringPattern(String s) {
         String doubledString = s + s;
        String trimmedString = doubledString.substring(1, doubledString.length() - 1);
        return trimmedString.contains(s);
    }
}
