class Solution {
    public int totalMoney(int n) {
        int firstMonday = 1, nextMonday = 1, total = 0, time = 0;
        
        while (n-->(0)) {
            // nextMonday = firstMonday;
            total += nextMonday++;
            time++;
            System.out.println("total: " + total + "\nnextMonday: " + nextMonday + "\ntime: " + time);
            if (time==7) {
                ++firstMonday;
                nextMonday = firstMonday;
                time = 0;
            }
        }
        return total;
    }
}