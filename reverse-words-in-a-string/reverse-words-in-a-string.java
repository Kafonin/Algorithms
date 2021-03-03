class Solution {
    public String reverseWords(String s) {
        ArrayList<String> al = stringList(s);
        // String[] temp = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i=al.size()-1; i>=0; i--) {
            sb.append(al.get(i));
            if (i>0) sb.append(" ");
        }
        return sb.toString();
    }
    
    public ArrayList<String> stringList(String stringParameter) {
        int len = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> res = new ArrayList();
        while (len<stringParameter.length()) {
            while (len<stringParameter.length() && Character.isLetterOrDigit(stringParameter.charAt(len))) {
                sb.append(stringParameter.charAt(len));
                len++;
            }
            if (sb.length()>0) {
                res.add(sb.toString());
                sb.setLength(0);
            }
            len++;
        }
        return res;
    }
}

// class Solution {
//     public String reverseWords(String s) {
//         Stack<String> stack = new Stack<String>();
//         String[] temp = s.trim().split(" ");
//         for (String str : temp) {
//             if (!str.isEmpty())
//                 stack.push(str);
//         }
        
//         StringBuilder sb = new StringBuilder();
//         while (!stack.isEmpty()) {
//             sb.append(stack.pop());
//             sb.append(" ");            
//         }
        
//         return sb.toString().trim();
//     }
// }