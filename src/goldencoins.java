import java.util.Scanner;

public class goldencoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a [] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0,l=0,h=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+= a[j];
                if(sum == k){
                    l=i+1;
                    h=j+1;
                    break;
                }
            }
        }
        System.out.print(l+" "+h);
    }
}
