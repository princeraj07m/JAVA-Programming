import java.util.*;

public class msonae {

    static int f(int i, int[] arr, int[] dp) {
        if (i == 0)
            return arr[0];
        if (i < 0)
            return 0;
        if (dp[i] != -1)
            return dp[i];

        int pick = arr[i] + f(i - 2, arr, dp);
        int notPick = f(i - 1, arr, dp);

        dp[i] = Math.max(pick, notPick);
        return dp[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = f(n - 1, arr, dp);
        System.out.println(ans);
    }
}
