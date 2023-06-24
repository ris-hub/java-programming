package Kunal_kushwaha;

public class sortedarray {
    public static void main(String[] args) {
        int []a={1, 2, 3, 4, 5, 6};
        System.out.println(sorted(a,1 , a.length));
    }

    private static boolean sorted(int[] a,int s, int l) {
        if(l == s)
            return true;
        if(s<l)
            if(a[s] < a[s-1] )
            return false;
        return sorted(a, s+1, l);
    }
}
