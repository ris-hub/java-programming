package Kunal_kushwaha;

public class BinarySearch {
    public static void main(String[] args) {
        int arr [] = {12, 34, 56, 66, 78, 83, 100, 550};
        int target = 550;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    public static int search(int[] arr, int target, int l, int h) {
        
        if(l > h)
            return -1;
        int mid=(h+l)/2;

        if(arr[mid] == target)
            return mid;

        if(arr[mid] < target)
            return search(arr, target, mid+1, h);
        
        return search(arr, target, l, mid-1);
    }
}
