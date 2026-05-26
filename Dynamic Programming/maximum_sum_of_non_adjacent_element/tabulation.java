import java.util.*;


public class tabulation {

     static int f(int n, int[] arr , int [] dp) {
       dp[0] =arr[0];


       for(int i =1;i<n;i++){
            int take = arr[i];
            if(i>1){
                take+=dp[i-2];
            }
            int ntake = 0 + dp[i-1];
            dp[i] = Math.max(take,ntake);
       }
       return dp[n-1];
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int dp [] = new int[n];
        Arrays.fill(dp,-1);
        int arr [] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = f(n,arr, dp);
        System.out.println(ans);
    }
}
