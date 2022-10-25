public class Task_11 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                System.out.println(i + "hiss");
            } else if (i % 5 == 0) {
                System.out.println(i + "buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + "fizz");
            } else System.out.println(i);
        }
    }
}