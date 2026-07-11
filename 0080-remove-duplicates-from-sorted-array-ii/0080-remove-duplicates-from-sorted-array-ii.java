class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        int top = 0;
        for (int i=0;i<nums.length-2;i++){
            if(nums[i] != nums[i+2]){
                nums[top++] = nums[i];
            }
        }
        nums[top++] = nums[nums.length - 2];
        nums[top++] = nums[nums.length - 1];
        return top;
    }
}