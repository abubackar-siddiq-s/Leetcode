class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[l]);
                    a.add(nums[r]);
                    Collections.sort(a);
                    ans.add(a);
                    l++;
                    r--;
                } else if(nums[i] + nums[l] + nums[r] > 0){
                    r--;
                } else{
                    l++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}