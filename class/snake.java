public class snake {

    static void snake_pattern(int n) {
        int flag = 1;
        for (int i = n; i > 0; i--) {
            int j = n;
            int val = 0;
            if (flag == 1) {
                val = i * j;
            } else {
                val = (i * j) - n + 1;
            }
            while (j >= 1) {
                if (flag == 1) {
                    System.out.print(val-- + " ");
                    j--;
                } else {
                    System.out.print(val++ + " ");
                    j--;
                }
            }
            System.out.println();
            flag = -1 * flag;
        }
    }

    public static void main(String[] args) {
        snake_pattern(5);
    }
}