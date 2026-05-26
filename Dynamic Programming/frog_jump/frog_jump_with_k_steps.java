import java.util.*;

public class frog_jump_with_k_steps {
    
    public static int f(int i,int []arr,int k ,int[]dp){
        
        if(i==0)return 0;
        if(dp[i] != -1)return dp[i];

        dp[i]  = Integer.MAX_VALUE;
        for(int j = 1;j<=k;j++){
            if(i-j>=0){
                int energy = f(i-j,arr,k,dp) + Math.abs(arr[i] - arr[i-j]);
                dp[i]  = Math.min(dp[i] , energy);
            }
        }
        return dp[i] ;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        int []heights = new int[n];
        for(int i = 0;i<n;i++){
            heights[i] = sc.nextInt();
        }


        int minEnergy = f(n-1,heights,k,dp);
        System.out.print(minEnergy);
    }
}
