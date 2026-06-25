class Solution {
    public int evalRPN(String[] tokens) {
        Deque <Integer> stack = new ArrayDeque<>();
        for(String token : tokens) {
            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")){
                int secop=stack.pop();
                int firop=stack.pop();
                switch (token) {
                    case "+":
                        stack.push(firop+secop);
                        break;
                    case "-":
                        stack.push(firop-secop);
                        break;
                    case "*":
                        stack.push(firop*secop);
                        break;
                    case "/":
                        stack.push(firop/secop);
                        break;
                }
            }else stack.push(Integer.parseInt(token));
        }
        return stack.pop();
        
    }
}
