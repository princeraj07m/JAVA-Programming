package Fibbonacci;
// follows fibbo series

import java.util.Scanner;

public class Climbing_Stairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev2 =0;
        int prev = 1;
        int curr = 0;
        if(n<=1){
            System.out.print(n);
        }
        for(int i = 2;i<=n;i++){
            curr = prev2+prev;
            prev2 = prev;
            prev = curr;
        }
        System.out.print(curr);
    
    }
}
