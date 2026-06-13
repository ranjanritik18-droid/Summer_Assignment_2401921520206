class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int low=0;
        for(int end=0;end<=arr.length;end++) {
            if(end==arr.length || arr[end]== ' '){
                reverseWord(arr,low,end-1);
                low=end+1;
            }
        }
        return new String(arr);
    }
    private void reverseWord(char [] arr,int s,int e) {
        while(s<e) {
            char temp = arr[s];
            arr[s]=arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
