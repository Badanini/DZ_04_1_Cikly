public class Task_10 {
    public static void main(String[] args) {
        int b=20;
        one:
        for (int i = 1; i > 0; i++) {
            int dev = 1;
            while (i % dev == 0 && dev <= b) {
                dev++;
                if (dev > b) {
                    System.out.println("Минимальное положительное число с делителями от 1 до "+b+" равняется\n"+i);
                    break one;
                }
            }
        }
    }
}
