class firstOccurance{
    static int first_occurance(int[]arr,int key,int i){
        if(i==arr.length)return -1;
        if(arr[i] == key){
            return i;
        }
        return first_occurance(arr,key,i+1);
    }

    static int last_occurance(int[] arr,int key,int i){
        if(i==arr.length)return -1;
        int last = last_occurance(arr, key, i+1);
        if(last !=-1){
            return last;
        }
        if(arr[i]==key){
            return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int arr [] = {3,4,5,3,4,6,7,8};
        System.out.println(first_occurance(arr,4,0));
        System.out.println(last_occurance(arr,4,0));
    }

}