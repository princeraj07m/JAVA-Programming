import java.util.Scanner;

class sumbtwn_two{

    static void prefix_sum(int []arr,int []ps){
        for(int i =0;i<arr.length;i++){
            if(i==0){
                ps[i] = arr[i];
            }else{
                ps[i]=ps[i-1]+arr[i];
            }
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int arr []=new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //  1 based indexing
        int l = sc.nextInt();
        int r = sc.nextInt();


        int[]ps = new int[arr.length];

        prefix_sum(arr,ps);
        int ans =0;
        if(l==1){
            ans =ps[r-1];
        }else{
            ans =ps[r-1]-ps[l-2];
        }

        System.out.print(ans);
    }
}