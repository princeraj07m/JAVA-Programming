import java.util.Scanner;

public class house_robber {
    static int f(int i, int n, int[] arr) {

        int curr = 0;
        int prev = arr[i];
        int prev2 = 0;

        for (i = i + 1; i < n; i++) {
            int take = arr[i] + prev2;
            int ntake = 0 + prev;

            curr = Math.max(take, ntake);
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
        if (n == 1) {
            System.out.println(arr[0]);
            return;
        }
        int ans1 = f(0, n - 1, arr);
        int ans2 = f(1, n, arr);

        System.out.println(Math.max(ans1, ans2));
    }
}
