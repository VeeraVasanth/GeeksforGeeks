class Solution {
    int missingNum(int arr[]) {
        // code here
        int n=arr.length;
        long sum1=0;
        long sum=0;
        for(int i=0;i<n;i++){
        sum+=arr[i];
        }
        sum1=((long)(n+1)*(n+2))/2;
        int res = (int)(sum1-sum);
        return res;
    }
    
}