import java.util.*;

public class optimal {
    static int f(int n, int[] arr) {

       int curr =0;
       int prev = arr[0];
       int prev2 = 0;

       for(int i =1;i<n;i++){
            int take = arr[i]+prev2;
            int ntake = 0 + prev;

            curr = Math.max(take,ntake);
            prev2 = prev;
            prev = curr;
        }
       return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = f(n, arr);
        System.out.println(ans);
    }
}
