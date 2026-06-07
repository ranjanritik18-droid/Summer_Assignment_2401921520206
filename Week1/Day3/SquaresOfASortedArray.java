class Solution {
    public int[] sortedSquares(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int i=nums.length-1;
        int[] res = new int[nums.length];
        while(s<=e) {
            res[i]=Math.max(nums[s]*nums[s],nums[e]*nums[e]);
            i--;
            if (nums[s]*nums[s]<nums[e]*nums[e]) e--;
            else s++;
        }
        return res;
    }
}
