import java.util.*;

public class bus_fare {
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
        sc.nextLine();
        double bus_fare = 1.5;
        String stops []=new String [n];
        for(int i =0;i<n;i++){
            stops[i]=sc.nextLine();
        }

        int arr []=new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        String start = sc.next();
        String end = sc.next();
    
        int l = Arrays.asList(stops).indexOf(start);
        int r = Arrays.asList(stops).indexOf(end);
        int[]ps = new int[arr.length];

        prefix_sum(arr,ps);
        int ans =0;
        
        if(l==-1){
            ans = ps[r];
        }else{
            ans =ps[r]-ps[l];
        }

        System.out.print(ans*bus_fare);
    }
}
