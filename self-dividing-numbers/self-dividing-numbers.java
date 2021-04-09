class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        
        while (left<=right) { 
            int num = left;
            boolean flag = true;
            while (num>0) {
                int digit = num%10;
                if (digit==0 || left%digit!=0) {
                    flag = false;
                    break;
                } else {
                    num/=10;
                }
            }
            if (flag) {
                list.add(left);
            }
            left++;
        }
        return list;
    }
}