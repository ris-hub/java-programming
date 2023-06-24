package Chegg;

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] permutation = new int[n];
        for (int i = 0; i < n; i++) {
            permutation[i] = i;
        }
        int minSum = Integer.MAX_VALUE;
        int[] bestPermutation = null;
        do {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += matrix[i][permutation[i]];
            }
            if (sum < minSum) {
                minSum = sum;
                bestPermutation = permutation.clone();
            }
        } while (nextPermutation(permutation));
        System.out.println("Best permutation: " + Arrays.toString(bestPermutation));
        System.out.println("Minimal sum: " + minSum);
        if (n < 25) {
            int[][] permutedMatrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    permutedMatrix[i][j] = matrix[i][bestPermutation[j]];
                }
            }
            System.out.println("Permuted matrix: ");
            for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(permutedMatrix[i]));
            }
        }
    }

    private static boolean nextPermutation(int[] permutation) {
        int i = permutation.length - 2;
        while (i >= 0 && permutation[i] >= permutation[i + 1]) {
            i--;
        }
        if (i == -1) {
            return false;
        }
        int j = permutation.length - 1;
        while (permutation[j] <= permutation[i]) {
            j--;
        }
        int temp = permutation[i];
        permutation[i] = permutation[j];
        permutation[j] = temp;
        int k = i + 1;
        int l = permutation.length - 1;
        while (k < l) {
            temp = permutation[k];
            permutation[k] = permutation[l];
            permutation[l] = temp;
            k++;
            l--;
        }
        return true;
    }
}

