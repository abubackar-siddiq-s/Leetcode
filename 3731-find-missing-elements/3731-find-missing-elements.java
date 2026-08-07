class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            max = Integer.max(max, nums[i]);
            min = Integer.min(min, nums[i]);
        }
        Arrays.sort(nums);
        int top = 0;
        for(int i=min;i<=max;i++){
            if(nums[top] != i){
                l.add(i);
            } else{
                top++;
            }
        }
        return l;
    }
}