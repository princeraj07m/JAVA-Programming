package Fibbonacci;
// most omptimal approach
import java.util.Scanner;

public class Fibbonacci_optimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.print(n);
            return;
        }
        int prev2 = 0;
        int prev = 1;
        int curr = 0;
        for(int i = 2;i<=n;i++){
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }
        System.out.print(prev);
    }
}
