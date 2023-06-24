package Codechef_Starter_15;

import java.util.Scanner;

public class Nice_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] s = new String[n];
            int a[]=new int[n];
            int b[]=new int[n];
            int c=0;
             for (int i = 0; i < n; i++)
                s[i] = sc.next();
            for (int i = 0; i <s.length; i++) {
                int x = Integer.parseInt(s[i]);
                a[i] = x - (i + 1);
            }
            for(int j=0;j<s.length;j++) {
                int y = Integer.parseInt(s[j]);
                b[j] = y - (j + 1);
            }
            for (int i = 0; i <s.length; i++) {
                if(a[i]==b[i])
                        c++;
            }
            System.out.println(c);
        }
    }
}
