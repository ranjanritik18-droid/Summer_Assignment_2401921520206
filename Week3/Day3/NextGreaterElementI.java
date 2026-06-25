class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer,Integer> nge= new HashMap<>(nums2.length);
        for(int i= nums2.length-1;i>=0;i--) {
            int cur=nums2[i];
            while(!stack.isEmpty() && stack.peek()<cur) {
                stack.pop();
            }
            if(!stack.isEmpty()) {
                nge.put(cur,stack.peek());
            }
            stack.push(cur);

        }
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++) {
           res[i]= nge.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}
