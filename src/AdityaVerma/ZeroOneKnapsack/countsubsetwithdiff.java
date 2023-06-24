package AdityaVerma.ZeroOneKnapsack;

public class countsubsetwithdiff {
    public static void main(String[] args) {
        //int arr[] = {1, 1, 2, 3};
        int arr[] ={0,0,0,0,0,0,0,0,1};
        int diff =1;
        int s1=0;
        for(int ele:arr)
            s1+=ele;
        System.out.println(s1);
        int sum = (s1+diff)/2;
        System.out.println(sum);
        System.out.println(countsubsetdiff(arr, sum));
    }

    private static int countsubsetdiff(int arr[], int sum){
        int n=arr.length;
        int dp[][] = new int[n+1][sum+1];
        for(int i=0;i<=n;i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0 )
                    dp[i][j] = 0;
                if(j == 0)
                    dp[i][j] = 1;
            }
        }
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] <= j)
                    dp[i][j] = dp[i-1][j - arr[i - 1]] + dp[i - 1][j];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        for(int i=0;i<=n;i++) {
            for (int j = 0; j <= sum; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(dp[n][sum]);
        return dp[n][sum];
    }
}
