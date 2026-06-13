class Solution {
    public String longestPalindrome(String s) {
        if (s.length()==0) return s;
        String lps= "";
        for(int i=0;i<s.length();i++) {
            int low=i;
            int high=i;
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)) {
                low--;
                high++;
            }
            String curp= s.substring(low+1,high) ;

            if(lps.length()<curp.length()) {
                lps=curp;
            }
            low=i;
            high=i+1;
            while(low>=0 && high<s.length() && s.charAt(low)==s.charAt(high)) {
                low--;
                high++;
            }
            curp= s.substring(low+1,high) ;

            if(lps.length()<curp.length()) {
                lps=curp;
            }
        }
        return lps;
    }
}
