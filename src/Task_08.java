public class Task_08 {
    public static void main(String[] args) {
        int h1, h2, m1, m2, count = 0;
        for (h1 = 0; h1 <= 2; h1++) {
            for (h2 = 0; (h1 < 2 && h2 <= 9) || (h1 == 2 && h2 <= 3); h2++) {
                for (m1 = 0; m1 <= 5; m1++) {
                    for (m2 = 0; m2 <= 9; m2++) {
                        if (h1 == m2 && h2 == m1) {
                            count += 1;
                            System.out.println(h1 + "" + h2 + ":" + m1 + m2 + "      "+count);

                        }
                    }
                }
            }
        }
        System.out.println("Симметричных комбинаций " + count);
    }
}
