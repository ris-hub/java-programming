import java.util.*;

public class testmatrix {
    public static void main(String[] args) {
        Integer[] arr1 = {101,101,610,447,389};
        Integer[] arr2= {610,4,101,4,101};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        int n = Collections.min(set);
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            s = s+d;
            n=n/10;
        }
        int m[][]=new int[2][s];
        for(int i=0;i<s;i++)
        {
            m[0][i] = arr1[arr1.length-s+i];
        }
        for(int j=0;j<s;j++)
        {
            m[1][j] = arr2[arr2.length-s+j];
        }
        //Arrays.sort(m);
        if(n<10) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < s; j++) {
                    System.out.print(m[i][j] + ",");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println(-1);
        }
    }
}
