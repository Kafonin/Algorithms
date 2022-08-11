class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> solutions = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        
        for (int i = 0; i < nums.length - 2; i++) 
        {
            
            if (i == 0 || ((i > 0) && nums[i] != nums[i - 1])) 
            {
                int left    = i + 1;
                int right   = nums.length - 1;
            
                while (left < right) 
                {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) 
                    {
                        List<Integer> miniSolution = new ArrayList<Integer>();
                        miniSolution.add(nums[i]);
                        miniSolution.add(nums[left]);
                        miniSolution.add(nums[right]);
                        solutions.add(miniSolution);
                        
                        while ((left < right) && nums[left] == nums[left + 1]) 
                        {
                            left++;
                        }
                        while ((left < right) && nums[right] == nums[right - 1]) 
                        {
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if (sum > 0)
                    {
                        right--;
                    }
                    else
                    {
                        left++;
                    }
                }
            }
        }
        return solutions;
    }
}