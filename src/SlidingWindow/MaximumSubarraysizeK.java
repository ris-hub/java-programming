package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSubarraysizeK {
    public static void main(String[] args) {
        int arr[]={1, 3, -1, -3, 5, 3, 6, 7};
        int  k=3;
        int size = arr.length;
        int i=0, j=0, sum=0, max = arr[0];
        ArrayList<Integer> l = new ArrayList<>();
        int ans[] = new int[size-k+1];

        while(j < size){
            if(arr[j] > max)
                max = arr[j];
            if(j-i+1 < k)
                j++;
            else if(j-i+1==k){
                ans[i] = l.get(i);
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
