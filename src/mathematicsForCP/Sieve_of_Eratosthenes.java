package mathematicsForCP;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime[] = sieveofEratosthenes(num);

        for(int i=0; i<=num; i++){
            System.out.println(i+" "+ isPrime[i]);
        }
    }
    static boolean[] sieveofEratosthenes(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i*i <=n; i++){
            for(int j=2*i; j<=n; j+=i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}
