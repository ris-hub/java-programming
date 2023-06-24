package Kunal_kushwaha;

public class reverse {
    public static void main(String[] args) {
        System.out.println(rev(34002, 5));
        System.out.println(countzeroes(3400002, 0));
        //System.out.println(c);
    }
    static int rev(int n, int len){
        if(len==0)
            return 0;

        return (n%10) * (int)Math.pow(10, len-1) + rev(n/10, len-1);
    }
    //static int c=0;
    static int countzeroes(int n, int len){
        if(n == 0)
            return len;

        return n%10 == 0? countzeroes(n/10, len+1):countzeroes(n/10, len);
    }
}
