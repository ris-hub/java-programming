package AdityaVerma.ZeroOneKnapsack;

public class EqualSumPartition {
    public static void main(String[] args) {
        int arr[] = {1,5, 10, 5, 21};
        System.out.println(equalsum(arr));
    }

    private static boolean equalsum(int[] arr) {
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        if(sum % 2!=0)
            return false;
        else
            return subsetsum(arr, sum/2);
    }

    private static boolean subsetsum(int[] arr, int sum) {
        int n=arr.length;
        boolean [][]dp= new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
            for(int j=0;j<=sum;j++){
                if(i==0)
                    dp[i][j]=false;
                if(j==0)
                    dp[i][j]=true;
            }
        for(int i=1;i<=n;i++)
            for(int j=1;j<=sum;j++)
                if(arr[i-1] <= j)
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];

        return(dp[n][sum]);
    }
}
