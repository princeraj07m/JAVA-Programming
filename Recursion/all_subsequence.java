public class all_subsequence {

    static void subsets(String s,int i,StringBuilder ans){
        if(i>=s.length()){
            System.out.println(ans);
            return;
        }
        ans.append(s.charAt(i));
        subsets(s, i+1, ans);
        ans.deleteCharAt(ans.length() - 1);
        subsets(s, i+1, ans);
    }
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder ans = new StringBuilder();
        subsets(s,0,ans);
    }
}
