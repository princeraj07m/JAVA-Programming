import java.util.*;

public class frog_jump_memoization {

    public static int f(int i,int []arr,int []dp){
        if(i==0)return 0;
        if(dp[i]!=-1)return dp[i];

        int left = f(i-1,arr,dp)+Math.abs(arr[i] - arr[i-1]);
        int right = Integer.MAX_VALUE; 

        if(i>1){
            right = f(i-2,arr,dp) + Math.abs(arr[i] - arr[i-2]);
        }
        return dp[i] = Math.min(left,right);
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []heights = new int[n];
        for(int i = 0;i<n;i++){
            heights[i] = sc.nextInt();
        }

        int dp[] = new int[n];
        Arrays.fill(dp,-1);

        int minEnergy = f(n-1,heights,dp);
        System.out.print(minEnergy);
    }
}
