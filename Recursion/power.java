public class power {
    static int power_of_x(int x,int n){
        if(n<=0)return 1;
        return x* power_of_x(x, n-1);
    }

    static int optimal_power(int x,int n){
        if(n<=0)return 1;

        int half_power = optimal_power(x, n/2);

        if(n%2!=0)return x*half_power*half_power;
        return half_power *half_power;
    }
    public static void main(String[] args) {
        System.out.println(power_of_x(2,10));
        System.out.println(optimal_power(2,10));
    }
}
