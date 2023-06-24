import java.util.Scanner;

public class xor_equation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int res=0,res1=0;
            int count =0;
            boolean ans= true;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                res= res ^ a[i];
            }
            if(res == 0)
                System.out.println(0);
            else
            {
                while(ans) {
                    count++;
                    for (int i = 0; i < n; i++) {
                        res1 = res1 ^ (a[i] + 1);
                        if (res1 == 0)
                            ans = false;
                        else
                            ans = true;
                          }
                            }
                    System.out.println(count);

            }

        }
    }
}
