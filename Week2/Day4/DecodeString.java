class Solution {
    public String decodeString(String s) {
    Deque<Integer> countStack = new ArrayDeque<>();
    Deque<String>  stringStack = new ArrayDeque<>();
    int curCount=0;
    StringBuilder curString= new StringBuilder();
    for(char ch:s.toCharArray()){
        if(Character.isDigit(ch)){
         curCount = curCount * 10 + (ch - '0');
    } else if (ch=='[') {
        countStack.push(curCount);
        stringStack.push(curString.toString());
        curCount=0;
        curString= new StringBuilder();
    } else if(ch==']') {
        int rt=countStack.pop();
        StringBuilder rs = new StringBuilder();
        for(int i=0;i<rt;i++) {
            rs.append(curString);
        }
        curString = new StringBuilder(stringStack.pop() + rs.toString());
    }else {
       curString.append(ch);
    } 
    }
    return curString.toString();
    }
}
