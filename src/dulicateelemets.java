import java.util.HashSet;
import java.util.Set;

class duplicateelements{
    public static void main(String[] args) {
        int [] arr={2, 2, 2, 4, 4, 4, 5, 6, 8, 9};
        int t=duplicate(arr, arr.length);
        System.out.println(t);
    }
    static int duplicate(int[] arr, int n){
        int c=0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(set.contains(arr[i]))
                c++;
            else
                set.add(arr[i]);
        }
        return c;
    }
}