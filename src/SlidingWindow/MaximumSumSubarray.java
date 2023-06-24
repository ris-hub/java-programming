package SlidingWindow;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int arr[]={2, 5, 1, 8, 2, 9, 1};
        int  k=3;
        int size = arr.length;
        int i=0, j=0, sum=0, max=Integer.MIN_VALUE;
        while(j < size){
            sum=sum+arr[j];
            if(j-i+1 < k)
                j++;
            else if(j-i+1==k){
                max=Math.max(max, sum);
                sum-=arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}
