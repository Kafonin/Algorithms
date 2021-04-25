class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int i = 0, total = 0;
        while (i<startTime.length && i<endTime.length) {
            if (startTime[i]<=queryTime && endTime[i]>=queryTime) {
                total++;
            }
            i++;
        }
        return total;
    }
}