class Solution {
    public String[] findWords(String[] words) {
        int[] rows = {2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        List<String> list = new ArrayList<>();
        int row = 0;
        
        for (String word : words) {
            
            String s = word.toLowerCase();
            boolean flag = true;
            row = rows[s.charAt(0)-'a'];
            
            for (int i=1; i<s.length(); i++) {
                if (rows[s.charAt(i)-'a']!=row) {
                    flag = false;
                    break;
                }
            }
            
            if (flag) {
                list.add(word);
            }
            
        }
        
        return list.toArray(new String[0]);
        
    }
}

// class Solution {
//     public String[] findWords(String[] words) {
//         ArrayList<String> ans = new ArrayList<String>();
//         for(int i=0;i<words.length;++i){    
//             String s = words[i].toLowerCase();
//             if(s.matches("^[qwertyuiop]*$") || s.matches("^[asdfghjkl]*$") ||             s.matches("^[zxcvbnm]*$")){
//                 ans.add(words[i]);
//             }
//         }
//         String[] ret = new String[ans.size()];
//         ret = ans.toArray(ret); 
//         return ans.toArray(ret);
//     }
// }