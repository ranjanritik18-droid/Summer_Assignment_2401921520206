class Solution {
    public int compress(char[] chars) {
        int idx= 0;
        for(int i=0;i<chars.length;i++) {
            int count =0;
            char c= chars[i];
            while(i<chars.length && chars[i]==c){
                count++;
                i++;
            }
            if(count==1) chars[idx++]=c;
            else{
                chars[idx++]=c;
                String s = Integer.toString(count);

               for (char dig : s.toCharArray()) {
                   chars[idx++] = dig;
                }  
            }
            i--;
        }
        return idx;
    }
}
