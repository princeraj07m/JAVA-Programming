import java.util.*;

class find_missing_element{
    public static void main(String[] args){
        Set<Integer>s = new HashSet<>();
        int [] arr= {9,8,7,5,4,3,1};

        for(int i =1;i<=10;i++){
            s.add(i);
        }
        for(var i:arr){
            s.remove(i);
        }

        for(var i :s){
            System.out.print(i+" ");
        }
    }
}