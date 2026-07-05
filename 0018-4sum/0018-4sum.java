class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                int l = j+1, r = nums.length - 1;
                while(l<r){
                    long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    List<Integer> li = new ArrayList<>();
                    if(sum == target){
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[l]);
                        li.add(nums[r]);
                        ans.add(li);
                        l++;
                        r--;
                    } else if(sum > target){
                        r--;
                    } else{
                        l++;
                    }
                }
            }
        }
        return new ArrayList(ans);
    }
}