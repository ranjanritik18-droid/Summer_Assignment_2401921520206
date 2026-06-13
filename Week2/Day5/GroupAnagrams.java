class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            String freq= getfreq(s);
            if(map.containsKey(freq)) {
                map.get(freq).add(s);
            }
            else{
                List<String> cur = new ArrayList<>();
                cur.add(s);
                map.put(freq,cur);
            }
        }
        return new ArrayList<>(map.values());
    }
    private String getfreq(String s) {
        int[] arr= new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        return Arrays.toString(arr);
    }
}
