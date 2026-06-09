class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        List<Integer> ans = new ArrayList<>();
        if (m > n) return ans;
        int[] pcount = new int[26];
        int[] wcount = new int[26];
        for (int i = 0; i < m; i++) {
            pcount[p.charAt(i) - 'a']++;
            wcount[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pcount, wcount)) {
            ans.add(0);
        }
        for (int i = m; i < n; i++) {
            wcount[s.charAt(i) - 'a']++;
            wcount[s.charAt(i - m) - 'a']--;
           if (Arrays.equals(pcount, wcount)) {
                ans.add(i - m + 1);
            }
        }
        return ans;
    }
   
}
