class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int top = 0;
        int[] arr = new int[n - k + 1];
        for (int l = 0; l <= n - k; l++) {
            int flag = 0;
            for (int i = l; i < l + k - 1; i++) {
                if (nums[i+1] != nums[i] + 1) {
                    arr[top++] = -1;
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                arr[top++] = nums[l + k - 1];
            }
        }
        return arr;
    }
}