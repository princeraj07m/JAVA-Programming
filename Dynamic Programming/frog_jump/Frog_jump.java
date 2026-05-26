import java.util.*;

public class Frog_jump {
    public static int f(int i,int []arr){
        if(i==0)return 0;

        int left = f(i-1,arr)+Math.abs(arr[i] - arr[i-1]);
        int right = Integer.MAX_VALUE; ;
        if(i>1){
            right = f(i-2,arr) + Math.abs(arr[i] - arr[i-2]);
        }
        return Math.min(left,right);
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []heights = new int[n];
        for(int i = 0;i<n;i++){
            heights[i] = sc.nextInt();
        }
        int minEnergy = f(n-1,heights);
        System.out.print(minEnergy);
    }
}

