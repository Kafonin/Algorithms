class Solution {
    public int addDigits(int num) {
        int ans = 0;
        if ((num/10) < 1) return num;
        while ((num/10) >= 1) {
            ans += num%10;
            num = num/10;
        }
        ans += num;
        return addDigits(ans);
    }
}