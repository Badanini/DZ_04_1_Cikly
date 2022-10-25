public class Task_07 {
    public static void main(String[] args) {
        int chislo = 26;
        // первый способ
        int n = chislo, t;
        for (int i = 1; i > 0; i++) {
            if (n % 2 == 1) {
                System.out.print(1);
            } else System.out.print(0);
            n /= 2;
            if (n == 0) {
                System.out.println();
                break;
            } else ;
        }
        //второй способ
        n = chislo;
        for (int i = 0; i >= 0; i++) {
            if (n == 1 || n == 0) {
                System.out.println(n);
                break;
            }
            System.out.print(n % 2);
            n >>= 1;
        }

        printToBinary(chislo);
    }

    //проверка, но справа налево!
    public static void printToBinary(int value) {
        System.out.println(String.format("%32s", Integer.toBinaryString(value)).replace(' ', '0'));
    }
}
