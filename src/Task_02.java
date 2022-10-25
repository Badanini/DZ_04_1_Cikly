public class Task_02 {
    public static void main(String[] args) {
        System.out.println(2);
        for (int n = 3; n <= 100000; n = n + 2) {
            int count = 1;
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    count = count + 1;
                    if (count > 2) {
                        break;
                    }
                } else ;
            }
            if (count > 2) {
                continue;
            } else
                System.out.println(n);
        }
    }
}

