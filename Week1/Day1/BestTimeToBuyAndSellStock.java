class Solution {
    public int maxProfit(int[] nums) {
        int maxp=0;
        int minprice=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<minprice) {
                minprice=nums[i];
            }
            else if (nums[i]-minprice>maxp) {
                    maxp=nums[i]-minprice;
                }
        }
        return maxp;
        
    }
}
