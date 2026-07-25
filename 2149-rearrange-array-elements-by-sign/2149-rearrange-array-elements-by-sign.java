class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] odd = new int[n / 2];
        int otop = 0;
        int[] even = new int[n / 2];
        int etop = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                odd[otop++] = nums[i];
            } else {
                even[etop++] = nums[i];
            }
        }
        for (int i = 0, j = 0; i < n; i++, j++) {
            nums[i] = even[j];
            i++;
            nums[i] = odd[j];
        }
        return nums;
    }
}