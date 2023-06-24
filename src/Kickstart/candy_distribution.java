package Kickstart;

import java.util.Scanner;

public class candy_distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            Long m = sc.nextLong();
            int c[] = new int[n];
            long sum=0;
            for(int i=0;i<n;i++){
                c[i] = sc.nextInt();
                sum+=c[i];
            }
            long d =sum/m;
            //System.out.println(d);
            long diff=sum - (d*m);
            System.out.println(diff);
        }
    }
}
