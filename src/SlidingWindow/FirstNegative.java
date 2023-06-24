package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FirstNegative {
    public static void main(String[] args) {
        //int arr[] ={12, -1, -7, 8, -15, 30, 16, 28};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=2;
        int i=0, j=0, size=arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        int[] ans = new int[size-k+1];
        while(j < size){
            if(arr[j] < 0)
                list.add(arr[j]);
             if(j-i+1 < k)
                 j++;
             else if(j-i+1==k){
                if(list.size() == 0)
                    ans[i]=0;
                else{
                    ans[i] = list.get(0);
                    if(list.get(0) == arr[i])
                        list.remove(0);
                }
                i++;
                j++;
             }
        }
        System.out.println(Arrays.toString(ans));
    }
}
