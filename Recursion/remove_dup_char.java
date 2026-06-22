public class remove_dup_char {
    static void remove_dup(String s,StringBuilder ans,int []arr,int i){
        if(i>=s.length())return;

        if(arr[s.charAt(i)-'a'] ==0){
            ans.append(s.charAt(i));
            arr[s.charAt(i)-'a']++;
        }
        remove_dup(s, ans, arr, i+1);
    }
    public static void main(String[] args) {
        String s = "aabbccdd";
        StringBuilder ans  = new StringBuilder();
        int arr[] = new int[26];
        remove_dup(s,ans,arr,0);
        System.out.println(ans);
    }
}
