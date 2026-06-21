
public class reverse_array {

    static void f(int l,int r,int [] arr){
        if(l>=r){
            return;
        }
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        f(l+1,r-1,arr);
        return ;
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        f(0,4,arr);
        for(int i =0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
