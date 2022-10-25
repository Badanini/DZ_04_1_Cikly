public class Task_01 {
    public static void main(String[] args) {
        int n, res, first, second;
        first = 0;
        second = 1;
        System.out.println(first + "\n" + second);
        for (int i = 1; i > 0; i++) {
            res = first + second;
            if (res <= 10000000) {
                System.out.println(res);
            } else break;
            first = second;
            second = res;
        }
    }
}
