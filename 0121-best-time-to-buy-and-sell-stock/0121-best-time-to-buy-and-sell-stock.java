class Solution {
    public int maxProfit(int[] arr) {
        int min = arr[0], max = arr[0], buy = 0, profit = 0, maxpro = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                max = arr[i];
                buy = i;
            }
            if (buy < i && arr[i] > max) {
                max = arr[i];
            }
            profit = max - min;
            if(profit > maxpro){
                maxpro = profit;
            }
        }
        return maxpro;
    }
}