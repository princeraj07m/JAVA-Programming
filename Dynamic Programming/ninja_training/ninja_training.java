import java.util.*;

public class ninja_training {
static int [][] points = new int[3][3];
    static int f(int[] arr,int idx ,int count){

        int ans = 0;

        if(count==2){
            for(int i = 0; i < 3; i++) {
            if(i==idx)continue;
            ans = Math.max(ans,arr[i]);
        }
        return ans;
        }

        for(int i = 0; i < 3; i++) {
            if(i==idx)continue;
            ans = Math.max(ans,arr[i]+f(points[count+1],i,count+1));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int m =3;
        int n =3;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                points[i][j] = sc.nextInt();
            }
        }

        System.out.print(f(points[0],-1 , 0));

    }

}
