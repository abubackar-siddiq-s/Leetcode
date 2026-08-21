class Solution {
    public int removeDuplicates(int[] nums) {
        int top = 0;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[top++] = nums[i];
            }
        }
        nums[top++] = nums[nums.length-1];
        return top;
    }
}