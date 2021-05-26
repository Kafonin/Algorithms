class Solution {
    public int subtractProductAndSum(int n) {
        int n1=1, n2=0;
        while (n!=0) {
            int digit=n%10;
            // System.out.println(digit);
            n1*=digit;
            n2+=digit;
            n/=10;
        }
        // System.out.println("n1: " + n1 + " n2: " + n2 );
        return (n1-n2);
    }
}