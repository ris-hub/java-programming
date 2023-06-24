package Chegg;

import java.util.Random; // this creates random for our program
public class App {

    public static int minFinder_rec(int[] arr, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return arr[startIndex];
        }
        int midIndex = (startIndex + endIndex) / 2;
        int leftMin = minFinder_rec(arr, startIndex, midIndex);
        int rightMin = minFinder_rec(arr, midIndex + 1, endIndex);
        return Math.min(leftMin, rightMin);
    }
    public static int minFinder(int[] arr){
        int index = arr[0];
        //YOUR CODE GOES HERE
        for(int i=1;i<arr.length;i++){
            if(arr[i] < index)
                index=arr[i];
        }
        return index;
    }
    public static void main(String[] args) throws Exception {
        int[] myArr = new int[100];
        Random myRand = new Random(); // creating Random object
// Range for random to select from
        int min = 5;
        int max = 1000;

        int indexMin=0;

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = myRand.nextInt(max-min+1) + min; // storing random integers in an array
        }
// here we check the last item of array to see if it is full:
        System.out.println(myArr[ myArr.length-1]); // printing last element, not the biggest or smallest but just the last one
//now we find the minimum calling the function you wrote:
        indexMin=minFinder(myArr);
        System.out.println("The minimum is at location: "+indexMin+" The value is: "+myArr[indexMin]);
        indexMin=minFinder_rec(myArr,0, myArr.length-1);
        System.out.println("The minimum is at location: "+indexMin+" The value is: "+myArr[indexMin]);
    }
}
