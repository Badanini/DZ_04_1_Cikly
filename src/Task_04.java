public class Task_04 {
    public static void main(String[] args) {
        for (int n = 1; n <= 1000000; n++) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum = sum + i;
                } else ;
            }
            if (n == sum) {
                System.out.println(n);
            } else ;
        }
    }
}
