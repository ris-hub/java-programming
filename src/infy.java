import java.util.Arrays;
import java.util.Scanner;
public class infy {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s[][] = new String[2][n];
        for(int i=0;i<n;i++)
        {
            s[0][i]= String.valueOf(sc.next().split(","));
        }
        for(int i=0;i<n;i++)
        {
            s[1][i]= String.valueOf(sc.next().split(","));
        }
        System.out.println(Arrays.toString(s));
    }

}