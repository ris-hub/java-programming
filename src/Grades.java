import java.util.*;
public class Grades {


    public static int[] readGrades() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a grade : ");
        int size = reader.nextInt();
        int[] grades = new int[size];

        for(int i=0;i<size;i++) {
            System.out.println("Enter a grade: ");
            int grade = reader.nextInt();
            grades[i] = grade;
        }
        reader.close();
        return grades;
    }


    public static int sum(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
        return sum;
    }


    public static int sum(int[] arr,int firstIndex, int lastIndex) {
        firstIndex = arr[0];
        lastIndex = arr[0];
        return firstIndex + lastIndex;
    }


    public static double average(int[] arr) {
        int sum =0;
        for(int i=0;i<arr.length;i++) {
            sum = sum + arr[i];
        }
        return sum/arr.length;
    }


    public static int maxValue(int[] arr) {
        int max = 0;
        for(int i=0;i<arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }



    public static void main(String[] args) {

        int[] arr = new int[100];
        arr = readGrades();
        System.out.println("Sum : " + sum(arr));
        System.out.println("Sum of firstindexValue and lastindexValue" + sum(arr, 0, arr.length-1));
        System.out.println("Average :" + average(arr));
        System.out.println("Highest Grade : " + maxValue(arr));
    }
}
