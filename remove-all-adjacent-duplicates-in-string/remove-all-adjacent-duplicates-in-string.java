class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<Character>();
        char[] ch=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ch.length;i++)
        {
		//if adjacent characters are same then,pop out the prev character and also dont add this current character to the stack
            if(!st.empty() && st.peek().equals(ch[i]))
            {
                st.pop();
                continue;
            }
            st.push(ch[i]);
        }
        while(!st.empty())
        {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}