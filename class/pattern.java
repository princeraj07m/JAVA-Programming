import java.util.Scanner;

class pattern{
    public static void main(String [] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n =4;
        
        // int arr[] = new int [n+1];
        for(int i =1;i<=n;i++){
            int pos = (int)Math.pow(2, i-1);
            for(int j =1;j<=i;j++){
                if(j==1){
                    System.out.print(1 + " ");
                }else{
                    System.out.print((int)Math.pow(j, pos) +" ");
                    pos = pos-(int)Math.pow(2, i-1);
                }
            }
            System.out.println();
        }
    }
}
