class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int otop = 1, etop = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                arr[otop] = nums[i];
                otop += 2;
            } else {
                arr[etop] = nums[i];
                etop += 2;
            }
        }
        return arr;
    }
}