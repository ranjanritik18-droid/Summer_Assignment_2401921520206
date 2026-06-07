class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int e=height.length-1;
        int max = Integer.MIN_VALUE;
        while(s<e) {
            int area= Math.min(height[s],height[e])*(e-s);
            max= Math.max(area,max);
            if (height[s]<=height[e]) {
                s++;
            }
            else e--;
        }
        return max;
    }
}
