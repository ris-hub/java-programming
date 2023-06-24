package Codechef_Starter_15;

import java.util.Scanner;

public class A_Subtask_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int c=0;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();

            }
            for (int i = 0; i < n; i++) {
                if (a[i] == 1)
                    c++;
                else
                    break;
            }
            if (c == m)
                System.out.println(50);
            else if(c ==n )
                System.out.println(100);
            else
                System.out.println(0);
        }
    }
}
