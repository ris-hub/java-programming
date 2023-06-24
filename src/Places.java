import java.util.Arrays;

public class Places {
    public static void main(String[] args) {
        int numbers[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(numbers));
        recursiveDivideSort(numbers, 0, numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }
    static void  recursiveDivideSort(int[] numbers, int lo, int hi) {

        if (hi - lo > 0) {

            int mid = (hi + lo) / 2;

            recursiveDivideSort(numbers, lo, mid);

            recursiveDivideSort(numbers, mid+1, hi);

            sortPart(numbers, lo, hi);

        }

    }

    static void sortPart(int [] numbers, int lo, int hi) {

        for (int i = lo; i < hi; ++i) {

            for (int j = lo; j < hi-i; ++ j) {

                if (numbers[j] > numbers[j+1]) {

                    swap(numbers, j, j+1);

                }

            }

        }

    }

    static  void swap (int[] numbers, int x, int y) {

        int temp = numbers[x];

        numbers[x] = numbers[y];

        numbers[y] = temp;

    }
}
