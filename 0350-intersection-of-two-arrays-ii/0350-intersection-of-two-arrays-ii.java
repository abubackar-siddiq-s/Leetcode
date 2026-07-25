class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[(n1>n2)?n2:n1];
        int top = 0;
        int i = 0, j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<n1 && j<n2){
            if(nums1[i] == nums2[j]){
                arr[top++] = nums1[i];
                i++;
                j++;
            } else if(nums1[i]>nums2[j]){
                j++;
            } else {
                i++;
            }
        }
        return Arrays.copyOf(arr, top);
    }
}