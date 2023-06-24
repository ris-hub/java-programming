import java.util.Scanner;

public class hire {
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        for(int i=0;i<n;i++)
        {
            A[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        while(x >0)
        {
            if(x % 2 ==1) {
                for (int i = 0; i < n - 1; i++) {
                    B[i] = Math.abs(A[i + 1] - A[i]);
                }
                B[n - 1] = Math.abs(A[n - 1] - A[0]);

            }
            else
            {
             for (int i = 0; i < n - 1; i++) {
                 A[i] = Math.abs(B[i + 1] - B[i]);
             }
                 A[n - 1] = Math.abs(B[n - 1] - B[0]);

            }
            x--;
        }
        System.out.print("A: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.print("B: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(B[i]+" ");
        }
        System.out.println();
    }
}
