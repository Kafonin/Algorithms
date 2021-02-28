class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<String>();
        String[] temp = s.trim().split(" ");
        for (String str : temp) {
            if (!str.isEmpty())
                stack.push(str);
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            sb.append(" ");            
        }
        
        return sb.toString().trim();
    }
}
