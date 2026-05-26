package Fibbonacci;
// memoization method
import java.util.Scanner;
import java.util.Arrays;

public class Fibbonacci_memoization {
    public static int fibbo(int n,int[]dp){
        if(n<=1)return n;  
        if(dp[n]!=-1)return dp[n];
        return dp[n] = fibbo(n-1,dp)+fibbo(n-2,dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.print(fibbo(n, dp));
    }  
}
