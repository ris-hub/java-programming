/*
package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Set_Mismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else
                    ans.add(i);
            } else
                i++;

        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i)
                ans.add(i + 1);
        }
        return -1;
    }
    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
*/
