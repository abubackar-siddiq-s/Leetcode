class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double sum = 0;
        int n = arr.length;
        int r = 0;
        for (r=0;r<k;r++){
            sum += arr[r];
        }
        double max = sum / k;
        for (int l=0;l<n-k;l++){
            sum += arr[r++];
            sum -= arr[l];
            if((sum / k) > max){
                max = sum / k;
            }
        }
        return max;
    }
}