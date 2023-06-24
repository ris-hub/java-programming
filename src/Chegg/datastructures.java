package Chegg;

import java.util.Scanner;

public class datastructures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        System.out.println("Enter your choice(1-2)");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Enter the value of x between 1-n(inclusive)");
                int x1=sc.nextInt();
                int i1 =1;
                int c1=0;
                while(i1*x1 >=1 && i1*x1 <=n){
                    i1++;
                    c1++;
                }
                System.out.println("Total Number of operations: "+c1);
                break;
            case 2:
                int c2=0;
                for(int x2=1;x2<=n;x2++){
                    int i2=1;
                    while(i2*x2 >=1 && i2*x2 <=n){
                        i2++;
                        c2++;
                    }
                }
                System.out.println("Total Number of operations: "+c2);
                break;
            default:
                System.out.println("Enter 1 or 2");
        }
    }
}
