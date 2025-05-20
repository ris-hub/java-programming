package SegmentTree;

import java.util.Arrays;
import java.util.Scanner;

public class SegmentTree {

    private static int[] segmentTree;
    private static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        segmentTree = new int[2 * n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        buildTree(0, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(segmentTree));
        sc.close();
    }

    public static void buildTree(int i, int l, int r) {
        // base case
        if (l == r) {
            segmentTree[i] = arr[l];
            return;
        }

        int mid = (l + r) / 2;
        buildTree((2 * i) + 1, l, mid);
        buildTree((2 * i) + 2, mid + 1, r);
        segmentTree[i] = segmentTree[(2 * i) + 1] + segmentTree[(2 * i) + 2];
    }
}
