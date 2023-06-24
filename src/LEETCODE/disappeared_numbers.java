package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class disappeared_numbers {

    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        findDisappearedNumbers(arr);
    System.out.println(Arrays.toString(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
            int i=0;
            while (i<arr.length){
                int correct = arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr, i, correct);
                }
                else
                    i++;
            }
        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i)
                ans.add(i+1);
        }
        return ans;
        }
        static void swap(int arr[], int first, int second){
            int temp = arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
    }
